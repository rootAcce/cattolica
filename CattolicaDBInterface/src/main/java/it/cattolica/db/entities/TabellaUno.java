package it.cattolica.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity(name="TabellaUno")
@Table(name = "TabellaUno", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
public class TabellaUno {

	@Id
	@Column(name="ID", length = 20, nullable = false)
	private String id;
	
	@Column(name="description")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
