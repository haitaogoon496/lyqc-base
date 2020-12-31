package com.lyqc.base.enums;

/**
 * @description: 数据字典业务类型
 * @Date : 2018/6/19 下午5:39
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum ConArgTypeEnum implements EnumValue {
    CAR_COLOR(2,"车辆颜色"),
    LOAN_PERIODS(11,"还款期限"),
    CAR_SERIES(26,"车类"),
    RATE_LEVEL(31,"利率档位"),
    ACCOUNT_FEE_THRESHOLD(32,"账户管理费率阈值"),
    GPS_LEVEL(37,"gps档位"),
    GPS_INSTALL_WAY(45,"GPS安装方式"),
    GPS_DEALER(49,"GPS供应商"),
    EXTEND_SAFE_TC_FEE(50,"延保费规则-延保费套餐"),
    GPS_PRO(55,"GPS属性"),
    WORK_FLOW(60,"平台费规则 -工作流"),
    SECOND_PREMIUM_TC_FEE(480,"第二年保险费套餐"),
    THIRD_PREMIUM_TC_EE(481,"第二年保险费套餐"),
    ;

    ConArgTypeEnum(int index, String name) {
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

    public static String getNameByIndex(int index){
        for(ConArgTypeEnum e : ConArgTypeEnum.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    public static ConArgTypeEnum getByIndex(int index){
        for(ConArgTypeEnum e : ConArgTypeEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }
}
