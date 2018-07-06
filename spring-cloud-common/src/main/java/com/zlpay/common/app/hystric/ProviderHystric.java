package com.zlpay.common.app.hystric;

import org.springframework.stereotype.Component;

import com.zlpay.common.app.ProviderService;
import com.zlpay.common.feign.dto.PayDTO;
import com.zlpay.common.feign.dto.PayResultDTO;
import com.zlpay.common.feign.enums.RespCodeEnum;

@Component
public class ProviderHystric implements ProviderService{

	@Override
	public PayResultDTO pay(PayDTO dto) {
		PayResultDTO resultDto = new PayResultDTO();
		resultDto.setRespCode(RespCodeEnum.FAIL);
		resultDto.setRespMsg("系统繁忙,稍后再试aaaaaaa");
		return resultDto;
	}

	@Override
	public String refund(String orderId) {
		return "sorry hystric!!";
	}
}
