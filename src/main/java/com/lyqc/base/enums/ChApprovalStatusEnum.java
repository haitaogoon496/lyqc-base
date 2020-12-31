package com.lyqc.base.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum ChApprovalStatusEnum {

	JD("1", "京东渠道"),
	JD_FIN_CREDIT_FACTORY("2", "华昌渠道"),
	HC_LEVLE("3", "华昌入池规则验证");

	private String name;
	private String value;

	private ChApprovalStatusEnum(String value, String name) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public String getValue() {
		return this.value;
	}

	public static String getMethodNameByCode(String method) {
		for (ChApprovalStatusEnum methods : ChApprovalStatusEnum.values()) {
			if (methods.getValue().equals(method)) {
				return methods.getName();
			}
		}
		return "未定义的返回码";
	}

	public static List<Map<String, Object>> toList() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for (ChApprovalStatusEnum temp : ChApprovalStatusEnum.values()) {
			for (int i = 1; i >= 0; i--) {
				Map<String, Object> map = new HashMap<String, Object>();
				String name = temp.getName() + (i == 0 ? "不" : "") + "通过";
				String value = temp.getValue() + i;
				map.put("name", name);
				map.put("value", value);
				list.add(map);
			}
		}
		return list;
	}

	public static Map<String, Object> getMaps() {
		Map<String, Object> map = new HashMap<String, Object>();
		for (ChApprovalStatusEnum temp : ChApprovalStatusEnum.values()) {
			for (int i = 1; i >= 0; i--) {
				String name = temp.getName() + (i == 0 ? "不" : "") + "通过";
				String value = temp.getValue() + i;
				map.put(value, name);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		Map<String, Object> map = getMaps();
		System.out.println(map.get("11"));
		;
	}
}
