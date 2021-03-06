package com.github.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.msu.sdk.response.model.PayByLinkPayment;

public class QueryPayByLinkPayment extends ApiResponse {
	@JsonProperty(value = "payByLinkPaymentList")
	@XmlElementWrapper(name = "payByLinkPaymentList")
	@XmlElement(name = "payByLinkPaymentList")
	private List<PayByLinkPayment> payByLinkPaymentVOList;

	public List<PayByLinkPayment> getPayByLinkPaymentVOList() {
		return payByLinkPaymentVOList;
	}
}
