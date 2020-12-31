package com.lyqc.gpsweb.enums;

import com.lyqc.base.enums.EnumDesc;

/**
 * @description: GPS人工审核结果代码枚举
 * @Date : 2018/6/20 上午10:45
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum GpsManualAuditCodeEnum implements EnumDesc{
	SUCCESS(1,"1", "审核通过"),
	FAIL_IMG_BZ(2,"2", "审核失败（安装照片数量不足）"),
	FAIL_CAR_BF(3,"3", "审核失败（安装照片车型、颜色与系统不符）"),
	FAIL_CPYZ(4,"4", "审核失败（重拍远照）"),
	FAIL_CPJZ(5, "5","审核失败（重拍近照）"),
	FAIL_GHAZWZ(6,"6", "审核失败（需更换安装位置）"),
	FAIL_7(7,"7", "无线不隐蔽，更换安装位置"),
	FAIL_8(8,"8", "请补充无线安装照片"),
	FAIL_9(9,"9", "GPS安装位置不符合要求（GPS设备必须一前一后，有线严禁接发动机舱），重新安装"),
	FAIL_10(10,"10", "车铭牌与车不符或车架号与系统不符"),
	FAIL_11(11,"11", "车型与系统不符或车身颜色与系统不符"),
	FAIL_12(12, "12","GPS资料中设备号与系统设备号不符，重新修改核对"),
	FAIL_13(13,"13", "GPS申请表有误，重新检查修改"),
	FAIL_14(14,"14", "有线无轨迹，重新验证"),
	FAIL_15(15,"15", "无线超时无信号，重新验证"),
	FAIL_16(16,"16", "GPS安装照片与其他客户安装照片完全相同"),
	FAIL_17(17, "17","GPS设备号重复使用"),
	FAIL_18(18,"18", "客户在GPS安装现场"),
	FAIL_19(19, "19","无线超时无信号"),
	FAIL_20(20, "20","有线无轨迹"),
	FAIL_21(21, "21","安装单信息有遗漏或有误"),
	FAIL_22(22, "22","客户在安装现场，请发邮件至GPS公共邮箱（gpssh@mljr.com）并抄送区域经理"),
	FAIL_23(23, "23","GPS设备重复使用，请发邮件至GPS公共邮箱（gpssh@mljr.com）并抄送区域经理"),
	FAIL_24(24, "24","安装车辆与系统车辆不符，请发邮件至GPS公共邮箱（gpssh@mljr.com）并抄送区域经理"),
	FAIL_25(25, "25","GPS定位异常，请发邮件至GPS公共邮箱（gpssh@mljr.com）并抄送区域经理"),
	OTHER(100, "100","其他"),
	;

	GpsManualAuditCodeEnum(Integer index, String name, String desc) {
		this.index = index;
		this.name = name;
		this.desc = desc;
	}

	private int index;
	private String name;
	private String desc;

	@Override
	public int getIndex() {
		return index;
	}

	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getDesc() {
		return desc;
	}

	/**
	 * 根据索引获取名称
	 * @param index 索引
	 * @return
	 */
	public static String getNameByIndex(int index){
		for(GpsManualAuditCodeEnum e : GpsManualAuditCodeEnum.values()){
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
	public static GpsManualAuditCodeEnum getByIndex(int index){
		for(GpsManualAuditCodeEnum e : GpsManualAuditCodeEnum.values()){
			if(e.getIndex() == index){
				return e;
			}
		}
		return null;
	}

	/**
	 * 根据索引获取枚举对象
	 * @param desc 索引
	 * @return
	 */
	public static GpsManualAuditCodeEnum getByDesc(String desc){
		for(GpsManualAuditCodeEnum e : GpsManualAuditCodeEnum.values()){
			if(e.getDesc().equals(desc)){
				return e;
			}
		}
		return null;
	}

	/**
	 * 根据代码查询名称，特别注意（由于后期需求数据库中存储的可以是多个，因此请注意）
	 * @param code 代码
	 * @return
	 */
	public static String getNameByCode(String code){
		for(GpsManualAuditCodeEnum e : GpsManualAuditCodeEnum.values()){
			if(e.getName().equals(code)){
				return e.getName();
			}
		}
		return "";
	}

	/**
	 * 根据代码查询名称
	 * @param codes 代码，以";"分割
	 * @return
	 */
	public static String getNamesInScope(String codes){
		if(null == codes || "".equals(codes)){
			return "";
		}
		StringBuffer sb = new StringBuffer();
		String[] arrays = codes.split(";");
		for(String code : arrays){
			sb.append(getNameByCode(code)).append(";");
		}
		if(sb.length()>0){
			return sb.substring(0,sb.length()-1);
		}
		return "";
	}

}
