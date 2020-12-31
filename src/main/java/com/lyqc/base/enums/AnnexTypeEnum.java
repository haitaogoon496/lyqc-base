package com.lyqc.base.enums;

/**
 * @description: 影像件业务类型
 * @Date : 2018/8/27 下午12:19
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum AnnexTypeEnum implements EnumValue{
	APP_ANNEX(4, "申请附件"),
	BEF_ANNEX(5, "贷前附件"),
	AFT_ANNEX(6, "贷后附件"),
	APR_ANNEX(28, "审批附件"),
	GPS_ANNEX(29, "GPS资料"),
	FILE_ANNEX(30, "影像件资料"),
	ELECTRONIC_AUTHORIZATION(9,"电子授权书");

	AnnexTypeEnum(int index, String name) {
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
		for(AnnexTypeEnum e : AnnexTypeEnum.values()){
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
	public static AnnexTypeEnum getByIndex(int index){
		for(AnnexTypeEnum e : AnnexTypeEnum.values()){
			if(e.getIndex() == index){
				return e;
			}
		}
		return null;
	}
}