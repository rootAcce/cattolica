package it.cattolica.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="DEAL")
@Table(name = "DEAL")
public class Deal {

	@Id
	@Column(name="DEAL_NUMBER", precision = 23, scale = 5, nullable = false)
	private Number dealNumber;
	
	@Column(name="POSITION_AMOUNT")
	private String positionAmount;

	@Column(name="PAYMENT_CURRENCY")
	private String paymentCurrency;

	@Column(name="PRODUCT_TYPE")
	private String productType;

	@Column(name="PORTFOLIO")
	private String portfolio;

	@Column(name="GUARANTOR")
	private String guarantor;

	@Column(name="VALUATION_CLASS")
	private String valuationClass;

	@Column(name="FUND")
	private String fund;

	@Column(name="INTEREST_CALENDAR")
	private String interestCalendar;

	@Column(name="CALC_BASE_DAYS")
	private String calcBaseBays;

	@Column(name="CALC_BASE_AMOUNT")
	private String calcBaseAmount;

	@Column(name="COUNTERPART_ID")
	private String counterpartId;

	@ManyToOne
	@JoinColumn(name="SECURITY_ID")
	private Security securityId;

	@Column(name="ORDER_DATE")
	private String orderDate;

	@Column(name="CONTRACT_DATE")
	private String contractDate;

	@Column(name="CONTRACT_TIME")
	private String contractTime;

	public Number getDealNumber() {
		return dealNumber;
	}

	public void setDealNumber(Number dealNumber) {
		this.dealNumber = dealNumber;
	}

	public String getPositionAmount() {
		return positionAmount;
	}

	public void setPositionAmount(String positionAmount) {
		this.positionAmount = positionAmount;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}

	public String getGuarantor() {
		return guarantor;
	}

	public void setGuarantor(String guarantor) {
		this.guarantor = guarantor;
	}

	public String getValuationClass() {
		return valuationClass;
	}

	public void setValuationClass(String valuationClass) {
		this.valuationClass = valuationClass;
	}

	public String getFund() {
		return fund;
	}

	public void setFund(String fund) {
		this.fund = fund;
	}

	public String getInterestCalendar() {
		return interestCalendar;
	}

	public void setInterestCalendar(String interestCalendar) {
		this.interestCalendar = interestCalendar;
	}

	public String getCalcBaseBays() {
		return calcBaseBays;
	}

	public void setCalcBaseBays(String calcBaseBays) {
		this.calcBaseBays = calcBaseBays;
	}

	public String getCalcBaseAmount() {
		return calcBaseAmount;
	}

	public void setCalcBaseAmount(String calcBaseAmount) {
		this.calcBaseAmount = calcBaseAmount;
	}

	public String getCounterpartId() {
		return counterpartId;
	}

	public void setCounterpartId(String counterpartId) {
		this.counterpartId = counterpartId;
	}

	public Security getSecurityId() {
		return securityId;
	}

	public void setSecurityId(Security securityId) {
		this.securityId = securityId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getContractDate() {
		return contractDate;
	}

	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}

	public String getContractTime() {
		return contractTime;
	}

	public void setContractTime(String contractTime) {
		this.contractTime = contractTime;
	}

	
	
	
	
	
	
}
