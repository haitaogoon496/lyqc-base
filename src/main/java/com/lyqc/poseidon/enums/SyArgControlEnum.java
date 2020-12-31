package com.lyqc.poseidon.enums;

/**
 * @Author：rongss
 * @Description
 * @Date：Created in 下午3:28 2018/2/22
 */
public class SyArgControlEnum {

    public enum ConArgCodeEnum {

        YYFL_LIMIT("yyfl_limit", "分流单量限制");

        private String value;
        private String name;

        ConArgCodeEnum(String value, String name) {
            this.value = value;
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        public static String getNameByIndex(String value){
            for(ConArgCodeEnum e : ConArgCodeEnum.values()){
                if(e.getValue().equals( value )){
                    return e.getName();
                }
            }
            return null;
        }

        public static ConArgCodeEnum getByValue(String value){
            for(ConArgCodeEnum e : ConArgCodeEnum.values()){
                if(e.getValue().equals( value)){
                    return e;
                }
            }
            return null;
        }
    }


    public enum ConArgTypeEnum {

        TYPE2(2,"车辆颜色"),
        TYPE3(3,"从事行业"),
        TYPE7(7,"现工作单位人数"),
        TYPE12(12,"婚姻状况"),
        TYPE14(14,"现居住时间"),
        TYPE16(16,"学历"),
        TYPE17(17,"与申请人的关系"),
        TYPE18(18, "与主贷人关系"),
        TYPE19(19, "与紧急联系人关系"),
        TYPE25(25, "拒绝类型"),
        TYPE26(26, "车类型"),
        TYPE31(31, "利率档位"),
        TYPE34(34, "通过类型"),
        TYPE35(35, "取消类型"),
        TYPE40(40, "准驾车型类型"),
        TYPE42(42, "现工作单位年限"),
        TYPE49(49, "GPS经销商配置数据"),
        TYPE55(55, "GPS属性"),
        TYPE56(56, "申请人原件"),
        TYPE57(57, "担保人原件"),
        TYPE58(58, "申请人扫描件"),
        TYPE62(62, "担保人情况"),
        TYPPE_10215(10215,"燃料类型");

        private Integer value;
        private String name;

        ConArgTypeEnum(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        public static String getNameByIndex(Integer value){
            for(ConArgTypeEnum e : ConArgTypeEnum.values()){
                if(e.getValue().equals( value )){
                    return e.getName();
                }
            }
            return null;
        }

        public static ConArgTypeEnum getByValue(Integer value){
            for(ConArgTypeEnum e : ConArgTypeEnum.values()){
                if(e.getValue().equals( value)){
                    return e;
                }
            }
            return null;
        }
    }




}
