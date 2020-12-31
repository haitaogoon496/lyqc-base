package com.lyqc.base.enums;

/**
 * @description: 车贷相关枚举
 * @Date : 下午12:08 2018/1/28
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public final class CarLoanConstant {
    /**
     * @description: 新车贷后资料上传状态(包括花乡的二手车 即先放款后抵押)
     * @Date : 下午12:08 2018/1/28
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum PostLoanStatusEnum implements EnumValue {
        TOBEUPLOAD(0,"未上传"),
        UPLOADED(1,"已上传"),
        REJECTED(2,"审批退回"),
        PASSED(3,"审批通过");
        PostLoanStatusEnum(int index, String name) {
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
            for(PostLoanStatusEnum e : PostLoanStatusEnum.values()){
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
        public static PostLoanStatusEnum getByIndex(int index){
            for(PostLoanStatusEnum e : PostLoanStatusEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 车牌类型 枚举
     * @Date : 下午12:08 2018/1/28
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum IsCompanyLicenseEnum implements EnumValue {
        PRIVATE_LICENSE(0,"私牌"),
        NORMAL_PUBLIC_LICENSE(1,"一般公牌"),
        LCV_LICENSE(2,"LCV挂靠公牌"),
        RENT_WITH_AGENCY(3,"以租代购");
        IsCompanyLicenseEnum(int index, String name) {
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
            for(IsCompanyLicenseEnum e : IsCompanyLicenseEnum.values()){
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
        public static IsCompanyLicenseEnum getByIndex(int index){
            for(IsCompanyLicenseEnum e : IsCompanyLicenseEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 是否自带征信 枚举
     * @Date : 2018/6/22 下午2:23
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum IsCreditEnum implements EnumValue {
        FO(0,"否"),
        YD(1,"简版征信"),
        YY(2,"详版征信"),
        QBT(3,"铅笔头征信");
        IsCreditEnum(int index, String name) {
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
            for(IsCreditEnum e : IsCreditEnum.values()){
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
        public static IsCreditEnum getByIndex(int index){
            for(IsCreditEnum e : IsCreditEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
