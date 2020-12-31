package com.lyqc.base.enums;

/**
 * @Author：rongss
 * @Description
 * @Date：Created in 下午1:12 2018/7/21
 */
public class CaPreFundResultEnum {

    /**
     * 身份证ocr
     */
    public enum IdentitycardEnum implements EnumValue {

        /**
         * 失败
         */
        FAIL(0, "失败"),
        /**
         * 成功
         */
        SUCCESS(1, "成功");

        IdentitycardEnum(int index, String name) {
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
            for(CaPreFundResultEnum.IdentitycardEnum e : CaPreFundResultEnum.IdentitycardEnum.values()){
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
        public static CaPreFundResultEnum.IdentitycardEnum getByIndex(int index){
            for(CaPreFundResultEnum.IdentitycardEnum e : CaPreFundResultEnum.IdentitycardEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    public enum IsPassFundPreNameEnum {

        NORMAL(0, "普通资金方", ""),
        SPDB(1, "浦发资金方", "PF"),
        NYBANK(2, "南粤资金方", "NY"),
        HC(3, "华昌", "HC"),
        //新华昌即新网 2018.5.29确认 备注一下
        XHC(4, "新华昌", "XHC"),
        ICBC(5, "工行", "GH"),
        WZR(6, "微众融", "WZR"),
        WZ(7, "微众", "WZ"),
        ZBYH(8, "众邦银行", "ZBYH"),
        CM(9, "挖财", "CM"),
        BH(10, "渤海", "BH"),
        PFLS(10, "天浦", "PFLS");

        private int index;
        private String name;
        private String code;

        IsPassFundPreNameEnum(int index, String name,String code) {
            this.index = index;
            this.name = name;
            this.code = code;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }


        public static String getName(String code) {
            if (code != null) {
                for (IsPassFundPreNameEnum item : IsPassFundPreNameEnum.values()) {
                    if (item.code.equals(code)) {
                        return item.name;
                    }
                }
            }
            return "";
        }
    }


    /**
     * 准入
     */
    public enum AdmittanceEnum implements EnumValue {

        /**
         * 失败
         */
        FAIL(0, "失败"),
        /**
         * 通过
         */
        PASS(1,"通过"),
        /**
         * 拒绝
         */
        REFUSE(2, "拒绝"),
        /**
         * 验证中
         */
        VERIFICATION(3, "拒绝"),
        /**
         * 未验证
         */
        UNVERIFIED(3, "未验证");

        AdmittanceEnum(int index, String name) {
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
            for(CaPreFundResultEnum.AdmittanceEnum e : CaPreFundResultEnum.AdmittanceEnum.values()){
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
        public static CaPreFundResultEnum.AdmittanceEnum getByIndex(int index){
            for(CaPreFundResultEnum.AdmittanceEnum e : CaPreFundResultEnum.AdmittanceEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 绑卡
     */
    public enum BindBankCardEnum implements EnumValue {

        /**
         * 未绑定
         */
        UNBOUND(0, "未绑定"),
        /**
         * 已绑定
         */
        BIND(1,"已绑定"),
        /**
         * 已跳过
         */
        SKIPPED(2, "已跳过");

        BindBankCardEnum(int index, String name) {
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
            for(CaPreFundResultEnum.BindBankCardEnum e : CaPreFundResultEnum.BindBankCardEnum.values()){
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
        public static CaPreFundResultEnum.BindBankCardEnum getByIndex(int index){
            for(CaPreFundResultEnum.BindBankCardEnum e : CaPreFundResultEnum.BindBankCardEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 资方预审
     */
    public enum PassFundPreEnum implements EnumValue {

        /**
         * 已完成
         */
        FINISHED(1, "已完成"),
        /**
         * 拒绝
         */
        REFUSE(2,"拒绝"),
        /**
         * 跳过
         */
        SKIPPED(3, "跳过");

        PassFundPreEnum(int index, String name) {
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
            for(CaPreFundResultEnum.PassFundPreEnum e : CaPreFundResultEnum.PassFundPreEnum.values()){
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
        public static CaPreFundResultEnum.PassFundPreEnum getByIndex(int index){
            for(CaPreFundResultEnum.PassFundPreEnum e : CaPreFundResultEnum.PassFundPreEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
