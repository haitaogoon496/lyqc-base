package com.lyqc.base.enums;

/**
 * @description: 申请单状态枚举
 * @Date : 2018/6/20 下午1:50
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum AppInfoStatusEnum implements EnumValue{
	_7(7, "初审已通过"),
	_8(8, "准入已通过"),
	_9(9,"风控验证中"),
	_10(10,"已删除"),
	_11(11,"已取消"),
	_12(12,"已拒绝"),
	_13(13,"新建待提交"),
	_14(14,"复审退回修改"),
	_15(15,"贷前退回修改"),
	_16(16,"贷后退回修改"),
	_17(17,"等待上传贷前资料"),
	_18(18,"等待上传贷后资料"),
	_19(19,"等待放款"),
	_20(20,"等待初审领单"),
	_21(21,"初审审批"),
	_22(22,"等待复审领单"),
	_23(23,"复审审批"),
	_24(24,"终审审批"),
	_25(25,"等待贷前领单"),
	_26(26,"贷前资料审批"),
	_27(27,"等待贷后领单"),
	_28(28,"贷后资料审批"),
	_29(29,"等待放款"),
	_30(30,"退回复审审批"),
	_31(31,"拒绝待复核"),
	_32(32,"放款成功");

	AppInfoStatusEnum(int index, String name) {
		this.index = index;
		this.name = name;
	}

	private int index;
	private String name;

	@Override
	public int getIndex() {
		return this.index;
	}

	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * 根据索引获取名称
	 * @param index 索引
	 * @return
	 */
	public static String getNameByIndex(int index){
		for(AppInfoStatusEnum e : AppInfoStatusEnum.values()){
			if(e.getIndex() == index){
				return e.getName();
			}
		}
		return null;
	}

	/**
	 * 根据索引获取枚举对象
	 * @param index 索引
	 * @return
	 */
	public static AppInfoStatusEnum getByIndex(int index){
		for(AppInfoStatusEnum e : AppInfoStatusEnum.values()){
			if(e.getIndex() == index){
				return e;
			}
		}
		return null;
	}
}