package it.cattolica.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="CASH_FLOW")
@Table(name = "CASH_FLOW")
public class CashFlow {
	@Id
	@Column(name="FLOW_ID", length = 20, nullable = false)
	private String flowId;
	
	@Column(name="DIRECTION")
	private String direction;
	
	@Column(name="PAYMENT_CURRENCY")
	private String paymentCurrency;

	@Column(name="PAYMENT_CURRENCY_ISO")
	private String paymentCurrencyIso;

	@Column(name="FLOW_SIDE")
	private String flowSide;

	@Column(name="FLOW_TYPE")
	private String flowType;

	@Column(name="FLOW_SIGN")
	private String flowSign;

	@Column(name="PAYMENT_DATE")
	private String paymentDate;

	@Column(name="PAYMENT_AMOUNT")
	private String paymentAmount;

	@Column(name="PAYMENT_AMOUNT_CHAR")
	private String paymentAmountChar;

	@Column(name="PAYMENT_CUR")
	private String paymentCur;

	@Column(name="PAYMENT_CUR_ISO")
	private String paymentCurIso;

	@Column(name="LOCAL_CUR_RATE")
	private String localCurRate;

	@Column(name="LOCAL_CUR_AMOUNT")
	private String localCurAmount;
	
	@Column(name="FIXED_AMOUNT")
	private String fixedAmount;
	
	@Column(name="DEAL_NUMBER")
	private String dealNumber;
	
	@Column(name="SECURITY_ID")
	private String securityId;

	public String getFlowId() {
		return flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public String getPaymentCurrencyIso() {
		return paymentCurrencyIso;
	}

	public void setPaymentCurrencyIso(String paymentCurrencyIso) {
		this.paymentCurrencyIso = paymentCurrencyIso;
	}

	public String getFlowSide() {
		return flowSide;
	}

	public void setFlowSide(String flowSide) {
		this.flowSide = flowSide;
	}

	public String getFlowType() {
		return flowType;
	}

	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	public String getFlowSign() {
		return flowSign;
	}

	public void setFlowSign(String flowSign) {
		this.flowSign = flowSign;
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

	public String getPaymentAmountChar() {
		return paymentAmountChar;
	}

	public void setPaymentAmountChar(String paymentAmountChar) {
		this.paymentAmountChar = paymentAmountChar;
	}

	public String getPaymentCur() {
		return paymentCur;
	}

	public void setPaymentCur(String paymentCur) {
		this.paymentCur = paymentCur;
	}

	public String getPaymentCurIso() {
		return paymentCurIso;
	}

	public void setPaymentCurIso(String paymentCurIso) {
		this.paymentCurIso = paymentCurIso;
	}

	public String getLocalCurRate() {
		return localCurRate;
	}

	public void setLocalCurRate(String localCurRate) {
		this.localCurRate = localCurRate;
	}

	public String getLocalCurAmount() {
		return localCurAmount;
	}

	public void setLocalCurAmount(String localCurAmount) {
		this.localCurAmount = localCurAmount;
	}

	public String getFixedAmount() {
		return fixedAmount;
	}

	public void setFixedAmount(String fixedAmount) {
		this.fixedAmount = fixedAmount;
	}

	public String getDealNumber() {
		return dealNumber;
	}

	public void setDealNumber(String dealNumber) {
		this.dealNumber = dealNumber;
	}

	public String getSecurityId() {
		return securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}
	

}
