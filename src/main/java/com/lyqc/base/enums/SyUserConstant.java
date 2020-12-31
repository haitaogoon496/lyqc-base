package com.lyqc.base.enums;

/**
 * @description: 系统用户相关枚举
 * @Date : 2018/3/4 上午11:13
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public final class SyUserConstant {
    /**
     * @description: 系统用户状态 枚举
     * @Date : 2018/3/4 上午11:13
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum UserStatusEnum {

        N("N", "已生效"),
        C("C", "未生效待复核"),
        F("F", "停用"),
        D("D", "停用"),
        UNKNOWN("", "未知用户");

        UserStatusEnum(String code, String name) {
            this.code = code;
            this.name = name;
        }

        private String code;
        private String name;

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        /**
         * 根据索引获取名称
         * @param code 索引
         * @return
         */
        public static String getNameByCode(String code){
            for(UserStatusEnum e : UserStatusEnum.values()){
                if(e.getCode().equals(code)){
                    return e.getName();
                }
            }
            return "";
        }

        /**
         * 根据索引获取枚举对象
         * @param code 索引
         * @return
         */
        public static UserStatusEnum getByCode(String code){
            for(UserStatusEnum e : UserStatusEnum.values()){
                if(e.getCode().equals(code)){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: 系统用户类型 枚举
     * @Date : 2018/3/4 上午11:13
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum UserTypeEnum {

        Y("Y", "YOOLI用户"),
        D("D", "经销商"),
        C("C", "第三方合作伙伴"),
        L("L", "车贷客户"),
        UNKNOWN("", "未知机构");

        UserTypeEnum(String code, String name) {
            this.code = code;
            this.name = name;
        }

        private String code;
        private String name;

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        /**
         * 根据索引获取名称
         * @param code 索引
         * @return
         */
        public static String getNameByCode(String code){
            for(UserTypeEnum e : UserTypeEnum.values()){
                if(e.getCode().equals(code)){
                    return e.getName();
                }
            }
            return "";
        }

        /**
         * 根据索引获取枚举对象
         * @param code 索引
         * @return
         */
        public static UserTypeEnum getByCode(String code){
            for(UserTypeEnum e : UserTypeEnum.values()){
                if(e.getCode().equals(code)){
                    return e;
                }
            }
            return null;
        }
    }
}
