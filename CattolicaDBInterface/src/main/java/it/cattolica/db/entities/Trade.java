package it.cattolica.db.entities;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Entity implementation class for Entity: Trade
 *
 */
@Entity(name="TRADE")
@Table(name="TRADE")
public class Trade{

	@Id
	@Column(name="ACCRUED_AMNT", precision = 23, scale = 5, nullable = false)
	private Number ACCRUED_AMNT;

	@Column(name="ACCRUED_AMNT2")
	private Number ACCRUED_AMNT2;
	
	@Column(name="ACCR_COUPON")
	private Number ACCR_COUPON;
	
	@Column(name="LO_CASH_BANK")
	private String LO_CASH_BANK;
	
	@Column(name="LO_ACC_NUM")
	private String LO_ACC_NUM;
	
	@Column(name="LO_CASH_BENEF")
	private String LO_CASH_BENEF;
	
	@Column(name="LO_ANBNKCTP")
	private String LO_ANBNKCTP;
	
	@Column(name="BROKER_FEES")
	private Number BROKER_FEES;
	
	@Column(name="BUS_EVENT")
	private String BUS_EVENT;
	
	@Column(name="CHANGE_RATE")
	private Number CHANGE_RATE;
	
	@Column(name="COM_SPREAD")
	private Number COM_SPREAD;
	
	@Column(name="CTP")
	private String CTP;
	
	@Column(name="CTP_FEES")
	private Number CTP_FEES;
	
	@Column(name="CURRENCY")
	private String CURRENCY;
	
	@Column(name="ENTITY")
	private String ENTITY;
	
	@Column(name="PTF_FIN")
	private String PTF_FIN;
	
	@Column(name="PAY_AMOUNT")
	private Number PAY_AMOUNT;
	
	@Column(name="GROSS_PRICE")
	private Number GROSS_PRICE;
	
	@Column(name="INSTR_ALLOTMENT")
	private String INSTR_ALLOTMENT;
	
	@Column(name="INSTR_CURRENCY")
	private String INSTR_CURRENCY;
	
	@Column(name="INSTR_MKT")
	private String INSTR_MKT;
	
	@Column(name="INSTR_REF")
	private String INSTR_REF;
	
	@Column(name="INSTR_TYPE")
	private String INSTR_TYPE;
	
	@Column(name="L_CASH_INT_BK")
	private String L_CASH_INT_BK;
	
	@Column(name="TYPE")
	private String TYPE;
	
	@Column(name="MARKET_FEES")
	private Number MARKET_FEES;
	
	@Column(name="INSTR_NAME")
	private String INSTR_NAME;
	
	@Column(name="NEG_DATE")
	private String NEG_DATE;
	
	@Column(name="NET_AMOUNT")
	private Number NET_AMOUNT;
	
	@Column(name="NET_PRICE")
	private Number NET_PRICE;
	
	@Column(name="NOMINAL")
	private Number NOMINAL;
	
	@Column(name="USER")
	private String USER;
	
	@Column(name="PAY_DATE")
	private Date PAY_DATE;
	
	@Column(name="PAY_METHOD")
	private String PAY_METHOD;
	
	@Column(name="PL_DATE")
	private Date PL_DATE;
	
	@Column(name="PTF_INS")
	private String PTF_INS;
	
	@Column(name="PTF_ID")
	private String PTF_ID;
	
	@Column(name="PRICE_TYPE")
	private String PRICE_TYPE;
	
	@Column(name="QUANTITY")
	private Number QUANTITY;
	
	@Column(name="SMDT")
	private String SMDT;
	
	@Column(name="SWIFT_CODE")
	private String SWIFT_CODE;
	
	@Column(name="SICOVAM")
	private String SICOVAM;
	
	@Column(name="STP_STATUS")
	private String STP_STATUS;
	
	@Column(name="STRIKE")
	private Number STRIKE;
	
	@Column(name="TRADE_TIME")
	private Date TRADE_TIME;
	
	@Column(name="TRADE_DATE")
	private Date TRADE_DATE;
	
	@Column(name="TRADE_ID")
	private Number TRADE_ID;
	
	@Column(name="TRADE_YTM")
	private Number TRADE_YTM;
	
	@Column(name="UND_NAME")
	private String UND_NAME;
	
	@Column(name="UND_REFERENCE")
	private String UND_REFERENCE;
	
	@Column(name="VALUE_DATE")
	private Date VALUE_DATE;
	
	@Column(name="BROKER")
	private String BROKER;
	
	@Column(name="UND_REF_NAME")
	private String UND_REF_NAME;
	
	@Column(name="UND_ISIN")
	private String UND_ISIN;
	
	

	public Number getACCRUED_AMNT2() {
		return ACCRUED_AMNT2;
	}
	public void setACCRUED_AMNT2(Number aCCRUED_AMNT2) {
		ACCRUED_AMNT2 = aCCRUED_AMNT2;
	}
	public Number getACCR_COUPON() {
		return ACCR_COUPON;
	}
	public void setACCR_COUPON(Number aCCR_COUPON) {
		ACCR_COUPON = aCCR_COUPON;
	}
	public String getLO_CASH_BANK() {
		return LO_CASH_BANK;
	}
	public void setLO_CASH_BANK(String lO_CASH_BANK) {
		LO_CASH_BANK = lO_CASH_BANK;
	}
	public String getLO_ACC_NUM() {
		return LO_ACC_NUM;
	}
	public void setLO_ACC_NUM(String lO_ACC_NUM) {
		LO_ACC_NUM = lO_ACC_NUM;
	}
	public String getLO_CASH_BENEF() {
		return LO_CASH_BENEF;
	}
	public void setLO_CASH_BENEF(String lO_CASH_BENEF) {
		LO_CASH_BENEF = lO_CASH_BENEF;
	}
	public String getLO_ANBNKCTP() {
		return LO_ANBNKCTP;
	}
	public void setLO_ANBNKCTP(String lO_ANBNKCTP) {
		LO_ANBNKCTP = lO_ANBNKCTP;
	}
	public Number getBROKER_FEES() {
		return BROKER_FEES;
	}
	public void setBROKER_FEES(Number bROKER_FEES) {
		BROKER_FEES = bROKER_FEES;
	}
	public String getBUS_EVENT() {
		return BUS_EVENT;
	}
	public void setBUS_EVENT(String bUS_EVENT) {
		BUS_EVENT = bUS_EVENT;
	}
	public Number getCHANGE_RATE() {
		return CHANGE_RATE;
	}
	public void setCHANGE_RATE(Number cHANGE_RATE) {
		CHANGE_RATE = cHANGE_RATE;
	}
	public Number getCOM_SPREAD() {
		return COM_SPREAD;
	}
	public void setCOM_SPREAD(Number cOM_SPREAD) {
		COM_SPREAD = cOM_SPREAD;
	}
	public String getCTP() {
		return CTP;
	}
	public void setCTP(String cTP) {
		CTP = cTP;
	}
	public Number getCTP_FEES() {
		return CTP_FEES;
	}
	public void setCTP_FEES(Number cTP_FEES) {
		CTP_FEES = cTP_FEES;
	}
	public String getCURRENCY() {
		return CURRENCY;
	}
	public void setCURRENCY(String cURRENCY) {
		CURRENCY = cURRENCY;
	}
	public String getENTITY() {
		return ENTITY;
	}
	public void setENTITY(String eNTITY) {
		ENTITY = eNTITY;
	}
	public String getPTF_FIN() {
		return PTF_FIN;
	}
	public void setPTF_FIN(String pTF_FIN) {
		PTF_FIN = pTF_FIN;
	}
	public Number getPAY_AMOUNT() {
		return PAY_AMOUNT;
	}
	public void setPAY_AMOUNT(Number pAY_AMOUNT) {
		PAY_AMOUNT = pAY_AMOUNT;
	}
	public Number getGROSS_PRICE() {
		return GROSS_PRICE;
	}
	public void setGROSS_PRICE(Number gROSS_PRICE) {
		GROSS_PRICE = gROSS_PRICE;
	}
	public String getINSTR_ALLOTMENT() {
		return INSTR_ALLOTMENT;
	}
	public void setINSTR_ALLOTMENT(String iNSTR_ALLOTMENT) {
		INSTR_ALLOTMENT = iNSTR_ALLOTMENT;
	}
	public String getINSTR_CURRENCY() {
		return INSTR_CURRENCY;
	}
	public void setINSTR_CURRENCY(String iNSTR_CURRENCY) {
		INSTR_CURRENCY = iNSTR_CURRENCY;
	}
	public String getINSTR_MKT() {
		return INSTR_MKT;
	}
	public void setINSTR_MKT(String iNSTR_MKT) {
		INSTR_MKT = iNSTR_MKT;
	}
	public String getINSTR_REF() {
		return INSTR_REF;
	}
	public void setINSTR_REF(String iNSTR_REF) {
		INSTR_REF = iNSTR_REF;
	}
	public String getINSTR_TYPE() {
		return INSTR_TYPE;
	}
	public void setINSTR_TYPE(String iNSTR_TYPE) {
		INSTR_TYPE = iNSTR_TYPE;
	}
	public String getL_CASH_INT_BK() {
		return L_CASH_INT_BK;
	}
	public void setL_CASH_INT_BK(String l_CASH_INT_BK) {
		L_CASH_INT_BK = l_CASH_INT_BK;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public Number getMARKET_FEES() {
		return MARKET_FEES;
	}
	public void setMARKET_FEES(Number mARKET_FEES) {
		MARKET_FEES = mARKET_FEES;
	}
	public String getINSTR_NAME() {
		return INSTR_NAME;
	}
	public void setINSTR_NAME(String iNSTR_NAME) {
		INSTR_NAME = iNSTR_NAME;
	}
	public String getNEG_DATE() {
		return NEG_DATE;
	}
	public void setNEG_DATE(String nEG_DATE) {
		NEG_DATE = nEG_DATE;
	}
	public Number getNET_AMOUNT() {
		return NET_AMOUNT;
	}
	public void setNET_AMOUNT(Number nET_AMOUNT) {
		NET_AMOUNT = nET_AMOUNT;
	}
	public Number getNET_PRICE() {
		return NET_PRICE;
	}
	public void setNET_PRICE(Number nET_PRICE) {
		NET_PRICE = nET_PRICE;
	}
	public Number getNOMINAL() {
		return NOMINAL;
	}
	public void setNOMINAL(Number nOMINAL) {
		NOMINAL = nOMINAL;
	}
	public String getUSER() {
		return USER;
	}
	public void setUSER(String uSER) {
		USER = uSER;
	}
	public Date getPAY_DATE() {
		return PAY_DATE;
	}
	public void setPAY_DATE(Date pAY_DATE) {
		PAY_DATE = pAY_DATE;
	}
	public String getPAY_METHOD() {
		return PAY_METHOD;
	}
	public void setPAY_METHOD(String pAY_METHOD) {
		PAY_METHOD = pAY_METHOD;
	}
	public Date getPL_DATE() {
		return PL_DATE;
	}
	public void setPL_DATE(Date pL_DATE) {
		PL_DATE = pL_DATE;
	}
	public String getPTF_INS() {
		return PTF_INS;
	}
	public void setPTF_INS(String pTF_INS) {
		PTF_INS = pTF_INS;
	}
	public String getPTF_ID() {
		return PTF_ID;
	}
	public void setPTF_ID(String pTF_ID) {
		PTF_ID = pTF_ID;
	}
	public String getPRICE_TYPE() {
		return PRICE_TYPE;
	}
	public void setPRICE_TYPE(String pRICE_TYPE) {
		PRICE_TYPE = pRICE_TYPE;
	}
	public Number getQUANTITY() {
		return QUANTITY;
	}
	public void setQUANTITY(Number qUANTITY) {
		QUANTITY = qUANTITY;
	}
	public String getSMDT() {
		return SMDT;
	}
	public void setSMDT(String sMDT) {
		SMDT = sMDT;
	}
	public String getSWIFT_CODE() {
		return SWIFT_CODE;
	}
	public void setSWIFT_CODE(String sWIFT_CODE) {
		SWIFT_CODE = sWIFT_CODE;
	}
	public String getSICOVAM() {
		return SICOVAM;
	}
	public void setSICOVAM(String sICOVAM) {
		SICOVAM = sICOVAM;
	}
	public String getSTP_STATUS() {
		return STP_STATUS;
	}
	public void setSTP_STATUS(String sTP_STATUS) {
		STP_STATUS = sTP_STATUS;
	}
	public Number getSTRIKE() {
		return STRIKE;
	}
	public void setSTRIKE(Number sTRIKE) {
		STRIKE = sTRIKE;
	}
	public Date getTRADE_TIME() {
		return TRADE_TIME;
	}
	public void setTRADE_TIME(Date tRADE_TIME) {
		TRADE_TIME = tRADE_TIME;
	}
	public Date getTRADE_DATE() {
		return TRADE_DATE;
	}
	public void setTRADE_DATE(Date tRADE_DATE) {
		TRADE_DATE = tRADE_DATE;
	}
	public Number getTRADE_ID() {
		return TRADE_ID;
	}
	public void setTRADE_ID(Number tRADE_ID) {
		TRADE_ID = tRADE_ID;
	}
	public Number getTRADE_YTM() {
		return TRADE_YTM;
	}
	public void setTRADE_YTM(Number tRADE_YTM) {
		TRADE_YTM = tRADE_YTM;
	}
	public String getUND_NAME() {
		return UND_NAME;
	}
	public void setUND_NAME(String uND_NAME) {
		UND_NAME = uND_NAME;
	}
	public String getUND_REFERENCE() {
		return UND_REFERENCE;
	}
	public void setUND_REFERENCE(String uND_REFERENCE) {
		UND_REFERENCE = uND_REFERENCE;
	}
	public Date getVALUE_DATE() {
		return VALUE_DATE;
	}
	public void setVALUE_DATE(Date vALUE_DATE) {
		VALUE_DATE = vALUE_DATE;
	}
	public String getBROKER() {
		return BROKER;
	}
	public void setBROKER(String bROKER) {
		BROKER = bROKER;
	}
	public String getUND_REF_NAME() {
		return UND_REF_NAME;
	}
	public void setUND_REF_NAME(String uND_REF_NAME) {
		UND_REF_NAME = uND_REF_NAME;
	}
	public String getUND_ISIN() {
		return UND_ISIN;
	}
	public void setUND_ISIN(String uND_ISIN) {
		UND_ISIN = uND_ISIN;
	}
	public Trade() {
		super();
	}   
	public Number getACCRUED_AMNT() {
		return this.ACCRUED_AMNT;
	}

	public void setACCRUED_AMNT(Number ACCRUED_AMNT) {
		this.ACCRUED_AMNT = ACCRUED_AMNT;
	}
   
}
