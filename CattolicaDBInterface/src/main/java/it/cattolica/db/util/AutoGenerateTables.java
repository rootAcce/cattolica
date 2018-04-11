package it.cattolica.db.util;

import java.io.File;
import java.util.EnumSet;

import org.hibernate.boot.Metadata;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

public class AutoGenerateTables {
	public static final String SCRIPT_FILE = "exportScript.sql";
	
	public static SchemaExport getSchemaExport() {
		 
	       SchemaExport export = new SchemaExport();
	       // Script file.
	       File outputFile = new File(SCRIPT_FILE);
	       String outputFilePath = outputFile.getAbsolutePath();
	 
	       System.out.println("Export file: " + outputFilePath);
	 
	       export.setDelimiter(";");
	       export.setOutputFile(outputFilePath);
	        
	       // No Stop if Error
	       export.setHaltOnError(false);
	       //
	       return export;
	   }
	 
	   public static void dropDataBase(SchemaExport export, Metadata metadata) {
	       // TargetType.DATABASE - Execute on Databse
	       // TargetType.SCRIPT - Write Script file.
	       // TargetType.STDOUT - Write log to Console.
	       EnumSet<TargetType> targetTypes = EnumSet.of(TargetType.DATABASE, TargetType.SCRIPT, TargetType.STDOUT);
	 
	       export.drop(targetTypes, metadata);
	   }
	 
	   public static void createDataBase(SchemaExport export, Metadata metadata) {
	       // TargetType.DATABASE - Execute on Databse
	       // TargetType.SCRIPT - Write Script file.
	       // TargetType.STDOUT - Write log to Console.
	  
	       EnumSet<TargetType> targetTypes = EnumSet.of(TargetType.DATABASE, TargetType.SCRIPT, TargetType.STDOUT);
	 
	       SchemaExport.Action action = SchemaExport.Action.CREATE;
	       //
	       export.execute(targetTypes, action, metadata);
	 
	       System.out.println("Export OK");
	 
	   }
	 
	   public static void main(String[] args) {
	 
	       
	   }
}
