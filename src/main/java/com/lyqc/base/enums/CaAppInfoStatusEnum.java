package com.lyqc.base.enums;

/**
 * 申请单状态
 *
 * @author sine
 *
 */
public enum CaAppInfoStatusEnum {

	CAAPP8(8, "等待上传信审资料", "等待上传信审资料"),
	CAAPP9(9, "等待批复", "风控验证中"),
	CAAPP10(10, "已删除", "已删除"),
	CAAPP11(11, "已取消", "已取消"),
	CAAPP12(12, "已拒绝", "已拒绝"),
	CAAPP13(13, "新建待提交", "新建待提交"),
	CAAPP14(14, "复审退回修改", "复审退回修改"),
	CAAPP15(15, "贷前退回修改", "贷前退回修改"),
	CAAPP16(16, "贷后退回修改", "贷后退回修改"),
	CAAPP17(17, "等待上传贷前资料", "等待上传贷前资料"),
	CAAPP18(18, "等待上传贷后资料", "等待上传贷后资料"),
	CAAPP19(19, "等待放款", "等待放款"),
	CAAPP20(20, "等待批复", "等待初审领单"),
	CAAPP21(21, "等待批复", "初审审批"),
	CAAPP22(22, "等待批复", "等待复审领单"),
	CAAPP23(23, "等待批复", "复审审批"),
	CAAPP24(24, "等待批复", "终审审批"),
	CAAPP25(25, "等待贷前审核", "等待贷前领单"),
	CAAPP26(26, "等待贷前审核", "贷前资料审批"),
	CAAPP27(27, "等待贷后审核", "等待贷后领单"),
	CAAPP28(28, "等待贷后审核", "贷后资料审批"),
	CAAPP29(29, "等待放款", "放款审批"),
	CAAPP30(30, "等待批复", "退回复审审批"),
	CAAPP31(31, "等待批复", "拒绝待复核"),
	CAAPP32(32, "已放款且流程结束", "放款成功"),
	CAAPP33(33, "等待批复", "等待终审审批");

	private int status;
	private String value1;// 申请端状态
	private String value2;// 审批端状态

	// 构造方法
	CaAppInfoStatusEnum(int status, String value1, String value2) {
		this.status = status;
		this.value1 = value1;
		this.value2 = value2;
	}

	public static String getStatusValue1(int status) {
		for (CaAppInfoStatusEnum dm : CaAppInfoStatusEnum.values()) {
			if (dm.getStatus() == status) {
				return dm.value1;
			}
		}
		return "";
	}

	public static String getStatusValue2(int status) {
		for (CaAppInfoStatusEnum dm : CaAppInfoStatusEnum.values()) {
			if (dm.getStatus() == status) {
				return dm.value2;
			}
		}
		return "";
	}

	public static String getStatusValue2(String status) {
		for (CaAppInfoStatusEnum dm : CaAppInfoStatusEnum.values()) {
			if (dm.getStatus() == Integer.parseInt(status)) {
				return dm.value2;
			}
		}
		return "";
	}

	public int getStatus() {
		return status;
	}

	public String getStatusStr() {
		return status + "";
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public static void main(String[] args) {
	}
}
