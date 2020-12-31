package com.lyqc.base.enums;
/**
 * @description: 放款资料枚举
 * @Date : 2018/6/20 下午2:11
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum LoanFileStatusEnum implements EnumValue{
	
	STATUS_WAIT_UPLOAD(0,"待上传"),
	STATUS_PASS(1,"审核通过"),
	STATUS_REFUSE(2,"审核退回"),
	STATUS_UPLOAD(3,"上传成功"),
	STATUS_WAIT_APPROVAL(4,"待审核"),
	/**
	 * 特殊状态，可直接进入待放列表
	 */
	STATUS_WAIT_REPEAT(5,"待补充上传资料"),
	STATUS_NEW_ORDER(6,"作为新单请款");
	LoanFileStatusEnum(int index, String name) {
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
		for(LoanFileStatusEnum e : LoanFileStatusEnum.values()){
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
	public static LoanFileStatusEnum getByIndex(int index){
		for(LoanFileStatusEnum e : LoanFileStatusEnum.values()){
			if(e.getIndex() == index){
				return e;
			}
		}
		return null;
	}
}
