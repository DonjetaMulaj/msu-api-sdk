package com.github.msu.sdk.response.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.msu.sdk.response.misc.MoneySerializer;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
public class SplitPaymentTransaction {
	@JsonProperty(value = "merchantPaymentId")
	private String merchantPaymentId;
	@JsonProperty(value = "installmentCount")
	private Integer installmentCount;
	@JsonProperty(value = "cardNumber")
	private String cardNumber;
	@JsonProperty(value = "cardOwner")
	private String cardOwner;
	@JsonProperty(value = "issuer")
	private String issuer;
	@JsonProperty(value = "authCode")
	private String authCode;
	@JsonSerialize(using = MoneySerializer.class)
	private BigDecimal originalAmount = BigDecimal.ZERO;
	@JsonSerialize(using = MoneySerializer.class)
	private BigDecimal amount = BigDecimal.ZERO;
	@JsonProperty(value = "session")
	@XmlElementWrapper(name = "session")
	@XmlElement(name = "session")
	private Session sessionVO;
	@JsonProperty(value = "campaign")
	@XmlElementWrapper(name = "campaign")
	@XmlElement(name = "campaign")
	private CampaignCode campaignVO;

	public String getMerchantPaymentId() {
		return merchantPaymentId;
	}

	public Integer getInstallmentCount() {
		return installmentCount;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getCardOwner() {
		return cardOwner;
	}

	public String getIssuer() {
		return issuer;
	}

	public String getAuthCode() {
		return authCode;
	}

	public BigDecimal getOriginalAmount() {
		return originalAmount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public Session getSessionVO() {
		return sessionVO;
	}

	public CampaignCode getCampaignVO() {
		return campaignVO;
	}

}