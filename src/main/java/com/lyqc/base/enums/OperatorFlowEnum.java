package com.lyqc.base.enums;

public enum OperatorFlowEnum implements EnumValue {

	SAVE(1,"保存"),
	SUBMIT(2,"提交"),
	CANCEL(3,"取消"),
	RETURN(4,"退回");

	private int index;
	private String name;

	OperatorFlowEnum(int index, String name) {
		this.index = index;
		this.name = name;
	}
	@Override
	public int getIndex() {
		return index;
	}
	@Override
	public String getName() {
		return name;
	}


	/**
	 * 根据索引获取名称
	 * @param index 索引
	 * @return
	 */
	public static String getNameByIndex(int index){
		for(OperatorFlowEnum e : OperatorFlowEnum.values()){
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
	public static OperatorFlowEnum getByIndex(int index){
		for(OperatorFlowEnum e : OperatorFlowEnum.values()){
			if(e.getIndex() == index){
				return e;
			}
		}
		return null;
	}
}