package com.zlpay.common.app;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zlpay.common.app.hystric.ProviderHystric;
import com.zlpay.common.feign.dto.PayDTO;
import com.zlpay.common.feign.dto.PayResultDTO;

@FeignClient(value = "service-provider",fallback = ProviderHystric.class)
public interface ProviderAppService {
	
	@RequestMapping(value = "/provider/pay",method = RequestMethod.POST)
	PayResultDTO pay(@RequestBody PayDTO dto);
	
	@RequestMapping(value = "/provider/refund",method = RequestMethod.POST)
	String refund(@RequestParam String orderId);
}
