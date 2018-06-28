package com.zlpay.common.feign.dto;

import com.zlpay.common.feign.enums.RespCodeEnum;

import lombok.Data;

@Data
public class PayResultDTO {

	/**
	 * 应答码
	 */
	private RespCodeEnum respCode;
	/**
	 * 应答描述
	 */
	private String respMsg;
}
