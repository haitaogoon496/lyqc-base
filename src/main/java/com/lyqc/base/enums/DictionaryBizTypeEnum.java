package com.lyqc.base.enums;

/**
 * @description: 系统数据字典业务类型枚举
 * 对应sy_arg_control表的arg_type
 * @Date : 下午10:43 2018/4/9
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public enum  DictionaryBizTypeEnum implements EnumValue{
    CAR_COLOR(2, "车辆颜色"),
    NOW_INDUSTRY(3, "从事行业"),
    NOW_UNIT_SCALE(7, "工作单位规模/人数"),
    NOW_UNIT_KIND(8, "工作单位性质"),
    LOAN_PERIOD(11, "贷款期限"),
    MARRIAGE(12, "婚姻状况"),
    NOW_LIVING_TIME(14, "现居住时间/年"),
    EDUCATION(16, "学历"),
    DB_CONTACT_TYPE(17, "担保人与申请人关系"),
    RELATION_DFL(18, "驾驶员与主贷人关系"),
    E_CONTACT_TYPE(19, "与紧急联系人关系"),
    NOW_POSITION(21, "职位"),
    HOUSE_OWNER(22, "住房所有权"),
    IS_LCV(26, "车类"),
    IMAGE_DATA(30, "影像件资料"),
    LOAN_RATE_LEVEL(31, "利率档位"),
    GPS_RATE_LEVEL(37, "GPS档位"),
    DRIVER_TYPE(40, "准驾车型"),
    CARD_TYPE(41, "卡类型"),
    NOW_WORK_YEAR(42, "现单位工作年限"),
    CREDIT_SELF_CHECK(43, "征信自查"),
    GPS_INSTALL_WAY(45, "GPS安装方式"),
    PUFA_CREDIT_CARD_CODE(53, "浦发信用卡代码"),
    PUFA_CITY(54, "浦发城市"),
    GPS_PRO(55, "GPS属性"),
    EXTEND_SAFE_TC(50, "延保费规则-延保费套餐"),
    SER_FIN_WORKFLOW(60, "平台费规则 -工作流"),
    HOUSEHOLD_REGISTER(61, "户口性质"),
    GUARANTEE_TYPE(62, "是否有担保人"),
    HOUSE_PROPERTY(63, "是否提供房产"),
    CAR_LICENSE_TYPE(64, "车牌类型"),
    FUEL_TYPE(65, "燃油类型"),
    DRIVER_OWER(66, "驾驶证归属人"),
    SELLER_GENRE(67, "卖方类型"),
    AUTO_APPR_CLASSIFY(68,"前置规则分类"),
    CUSTOMER_TYPE(69,"客户类型"),
    YAN_BAO_TC2(480, "第二年保险费套餐规则-第二年保险费套餐"),
    YAN_BAO_TC3(481, "第三年保险费套餐规则-第三年保险费套餐"),
    SER_FIN_RATE(485, "平台费规则 - 融费率"),
    DYQD(503,"抵押渠道"),
    PRODUCT_MANAGE_RULE_CLASSIFY(600, "产品规则管理-规则类名");

    private int index;
    private String name;

    DictionaryBizTypeEnum(int index, String name) {
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

    public static String getNameByIndex(int index){
        for(DictionaryBizTypeEnum e : DictionaryBizTypeEnum.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    public static DictionaryBizTypeEnum getByIndex(int index){
        for(DictionaryBizTypeEnum e : DictionaryBizTypeEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }
}
