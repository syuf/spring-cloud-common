package com.zlpay.common.feign.enums;

public enum RespCodeEnum {
	SUCCESS("0000","成功"),
	FAIL("0001","失败"),
	;
	private String value;
	private String displayName;
	
	RespCodeEnum(String value,String displayName){
		this.value = value;
		this.displayName = displayName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	
}
