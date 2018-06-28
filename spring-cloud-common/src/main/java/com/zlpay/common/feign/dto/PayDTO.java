package com.zlpay.common.feign.dto;

import lombok.Data;

@Data
public class PayDTO {
	/**
	 * 订单ID
	 */
	private String orderId;
	/**
	 * 订单金额
	 */
	private long amt;
}
