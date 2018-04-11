package it.cattolica.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="SECURITY")
@Table(name = "SECURITY")
public class Security {

	@Id
	@Column(name="SECURITY_ID", length = 20, nullable = false)
	private String securityId;

	@Column(name="SECURITY_ACCOUNT")
	private String securityAccount;

	@Column(name="NOMINAL_AMOUNT")
	private String nominalAmount;

	@Column(name="NUMBER_UNITS")
	private String numberUnits;

	@Column(name="PRICE")
	private String price;

	@Column(name="PRICE_UNIT")
	private String pricaUnit;

	@Column(name="PAYMENT_CURRENCY")
	private String paymentCussency;

	@Column(name="PAYMENT_DATE")
	private String paymentDate;

	@Column(name="PAYMENT_AMOUNT")
	private String paymentAmount;

	@Column(name="EXCHANGE")
	private String exchange;

	@Column(name="NOMINAL_ORIG_AMT")
	private String nominalOrigAmt;

	@Column(name="IND_PRICE_VALUE")
	private String indPriceValue;

	@Column(name="POSITION_VALUE_DATE")
	private String positionValueDate;

	@Column(name="CALCULATE_DATE")
	private String calculateDate;

	@Column(name="TRADED_FLAT")
	private String tradedFlat;

	@Column(name="LOCAL_AMOUNT")
	private String localAmont;

	public String getSecurityId() {
		return securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	public String getSecurityAccount() {
		return securityAccount;
	}

	public void setSecurityAccount(String securityAccount) {
		this.securityAccount = securityAccount;
	}

	public String getNominalAmount() {
		return nominalAmount;
	}

	public void setNominalAmount(String nominalAmount) {
		this.nominalAmount = nominalAmount;
	}

	public String getNumberUnits() {
		return numberUnits;
	}

	public void setNumberUnits(String numberUnits) {
		this.numberUnits = numberUnits;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPricaUnit() {
		return pricaUnit;
	}

	public void setPricaUnit(String pricaUnit) {
		this.pricaUnit = pricaUnit;
	}

	public String getPaymentCussency() {
		return paymentCussency;
	}

	public void setPaymentCussency(String paymentCussency) {
		this.paymentCussency = paymentCussency;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getNominalOrigAmt() {
		return nominalOrigAmt;
	}

	public void setNominalOrigAmt(String nominalOrigAmt) {
		this.nominalOrigAmt = nominalOrigAmt;
	}

	public String getIndPriceValue() {
		return indPriceValue;
	}

	public void setIndPriceValue(String indPriceValue) {
		this.indPriceValue = indPriceValue;
	}

	public String getPositionValueDate() {
		return positionValueDate;
	}

	public void setPositionValueDate(String positionValueDate) {
		this.positionValueDate = positionValueDate;
	}

	public String getCalculateDate() {
		return calculateDate;
	}

	public void setCalculateDate(String calculateDate) {
		this.calculateDate = calculateDate;
	}

	public String getTradedFlat() {
		return tradedFlat;
	}

	public void setTradedFlat(String tradedFlat) {
		this.tradedFlat = tradedFlat;
	}

	public String getLocalAmont() {
		return localAmont;
	}

	public void setLocalAmont(String localAmont) {
		this.localAmont = localAmont;
	}
	
}
