package com.lyqc.product.enums;

import com.lyqc.base.enums.EnumDesc;
import com.lyqc.base.enums.EnumValue;

import java.util.stream.Stream;

/**
 * @description: 通用枚举
 * @Date : 2018/7/3 上午10:56
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public final class ConstEnum {
    /**
     * @description: 是/否 枚举
     * @Date : 2018/7/3 上午10:59
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum YesOrNoEnum implements EnumValue {
        YES(1, "是"),
        NO(0, "否");

        YesOrNoEnum(int index, String name) {
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
            for(YesOrNoEnum e : YesOrNoEnum.values()){
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
        public static YesOrNoEnum getByIndex(int index){
            for(YesOrNoEnum e : YesOrNoEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 是否二手车
     * @Date : 2018/4/15 上午11:19
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum IsOldEnum implements EnumValue {
        OLD_CAR(1, "二手车"),
        NEW_CAR(0, "新车");

        IsOldEnum(int index, String name) {
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
            for(IsHouseEnum e : IsHouseEnum.values()){
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
        public static IsHouseEnum getByIndex(int index){
            for(IsHouseEnum e : IsHouseEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 是否提供房产
     * @Date : 2018/4/15 上午11:19
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum IsHouseEnum implements EnumValue {
        YES(1, "是"),
        NO(0, "否");

        IsHouseEnum(int index, String name) {
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
            for(IsHouseEnum e : IsHouseEnum.values()){
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
        public static IsHouseEnum getByIndex(int index){
            for(IsHouseEnum e : IsHouseEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 车类
     * @Date : 2018/4/15 上午11:19
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum CarTypeEnum implements EnumValue {
        PASSENGER(0, "乘用车"),
        LCV(1, "LCV"),
        MMPV(2, "MMPV"),
        COMMERCIAL(3, "商用车");
        CarTypeEnum(int index, String name) {
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
            for(CarTypeEnum e : CarTypeEnum.values()){
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
        public static CarTypeEnum getByIndex(int index){
            for(CarTypeEnum e : CarTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }

    }
    /**
     * @description: 车辆 燃油类型 枚举
     * @Date : 2018/7/3 上午11:05
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum FuelTypeEnum implements EnumValue {
        GASOLINE_DIESEL_OIL(1,"汽油柴油"),
        HEV(2,"油电混动"),
        PURE_ELECTRIC(3,"纯电");
        FuelTypeEnum(int index, String name) {
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
            for(FuelTypeEnum e : FuelTypeEnum.values()){
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
        public static FuelTypeEnum getByIndex(int index){
            for(FuelTypeEnum e : FuelTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }

    }
    /**
     * @description: 还款期限 枚举
     * @Date : 2018/4/15 上午11:19
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum LoanPeriodsEnum implements EnumValue {
        SIX(6, "6"),
        TWELVE(12, "12"),
        EIGHTEEN(18, "18"),
        TWENTY_FOUR(24, "24"),
        THIRTY(30, "30"),
        THIRTY_SIX(36, "36"),
        FORTY_TWO(42, "42"),
        FORTY_EIGHT(48, "48");
        LoanPeriodsEnum(int index, String name) {
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
            for(LoanPeriodsEnum e : LoanPeriodsEnum.values()){
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
        public static LoanPeriodsEnum getByIndex(int index){
            for(LoanPeriodsEnum e : LoanPeriodsEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 性别 枚举
     * @Date : 2018/7/3 上午11:08
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum SexEnum implements EnumValue {
        MALE(0,"男性"),
        FEMALE(1,"女性");
        SexEnum(int index, String name) {
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
            for(SexEnum e : SexEnum.values()){
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
        public static SexEnum getByIndex(int index){
            for(SexEnum e : SexEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }

    }

    /**
     * @description: 户口性质 枚举
     * @Date : 2018/7/3 上午11:08
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum HouseholdRegisterEnum implements EnumValue {
        NATIVE_TOWN(1,"本地城镇"),
        NATIVE_COUNTRY(2,"本地农村"),
        OVERLAND_TOWN(3,"外地城镇"),
        OVERLAND_COUNTRY(4,"外地农村");
        HouseholdRegisterEnum(int index, String name) {
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
            for(HouseholdRegisterEnum e : HouseholdRegisterEnum.values()){
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
        public static HouseholdRegisterEnum getByIndex(int index){
            for(HouseholdRegisterEnum e : HouseholdRegisterEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 车牌类型 枚举
     * @Date : 2018/6/25 下午12:03
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum LicenceTypeEnum implements EnumValue{
        PRIVATE_LICENCE(0,"私牌"),
        PUBLIC_LICENCE(1,"公牌"),
        SUBORDINATE_PUBLIC_LICENSE(2,"挂靠公牌"),
        INSTEAD_OF_BUY_WITH_LEASE(3,"以租代购");
        private int index;
        private String name;

        LicenceTypeEnum(int index, String name){
            this.name = name;
            this.index = index;
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
            for(LicenceTypeEnum e : LicenceTypeEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static LicenceTypeEnum getByIndex(int index){
            for(LicenceTypeEnum e : LicenceTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 驾照所属 枚举 【此枚举已失效,请使用】
     * {@link DriverLicenseOwnerNewEnum}
     * @Date : 2018/6/25 下午12:03
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    @Deprecated
    public enum DriverLicenseOwnerEnum implements EnumValue{
        OWNER(0,"本人"),
        SPOUSE(1,"配偶"),
        GUARANTEE(2,"担保人"),
        OTHER(3,"其他");
        private int index;
        private String name;

        DriverLicenseOwnerEnum(int index, String name){
            this.name = name;
            this.index = index;
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
            for(DriverLicenseOwnerEnum e : DriverLicenseOwnerEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static DriverLicenseOwnerEnum getByIndex(int index){
            for(DriverLicenseOwnerEnum e : DriverLicenseOwnerEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * 驾照所属
     */
    public enum DriverLicenseOwnerNewEnum implements EnumDesc {
        OWNER(1,"01","本人"),
        SPOUSE(2,"02","配偶"),
        OTHER(3,"03","其他"),
        GUARANTEE(4,"04","担保人"),
        IMMEDIATE_FAMILY_MEMBERS(5,"05","直系亲属")
        ;

        DriverLicenseOwnerNewEnum(Integer index, String name, String desc) {
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
            for(DriverLicenseOwnerNewEnum e : DriverLicenseOwnerNewEnum.values()){
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
        public static DriverLicenseOwnerNewEnum getByIndex(int index){
            for(DriverLicenseOwnerNewEnum e : DriverLicenseOwnerNewEnum.values()){
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
        public static DriverLicenseOwnerNewEnum getByDesc(String desc){
            for(DriverLicenseOwnerNewEnum e : DriverLicenseOwnerNewEnum.values()){
                if(e.getDesc().equals(desc)){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: 婚姻状况 枚举
     * @Date : 2018/6/25 下午12:03
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum MarriageEnum implements EnumValue{
        UNMARRIED(0,"未婚"),
        MARRIED(1,"已婚"),
        DIVORCE(2,"离异"),
        SPOUSE(3,"丧偶");

        private int index;
        private String name;

        MarriageEnum(int index, String name){
            this.name = name;
            this.index = index;
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
            for(MarriageEnum e : MarriageEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static MarriageEnum getByIndex(int index){
            for(MarriageEnum e : MarriageEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: 担保人 枚举
     * @Date : 2018/6/25 下午12:03
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum GuaranteeTypeEnum implements EnumValue{
        NO(0,"否"),
        PERSONAL_GUARANTEE(1,"个人担保"),
        COMPANY_GUARANTEE(2,"公司担保");

        private int index;
        private String name;

        GuaranteeTypeEnum(int index, String name){
            this.name = name;
            this.index = index;
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
            for(GuaranteeTypeEnum e : GuaranteeTypeEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static GuaranteeTypeEnum getByIndex(int index){
            for(GuaranteeTypeEnum e : GuaranteeTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 征信授权方式 枚举
     * @Date : 2018/9/10 下午3:00
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum CreditAuthTypeEnum implements EnumValue{
        PAPER_AUTH(1,"纸质授权"),
        ELECTRONIC_AUTH(2,"电子授权");

        private int index;
        private String name;

        CreditAuthTypeEnum(int index, String name){
            this.name = name;
            this.index = index;
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
            for(CreditAuthTypeEnum e : CreditAuthTypeEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static CreditAuthTypeEnum getByIndex(int index){
            for(CreditAuthTypeEnum e : CreditAuthTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 全局参数类型
     * 表：pd_config_params
     * @Date : 2018/12/11 下午2:26
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum ParamTypeEnum implements EnumValue{
        SWITCH(1,"开关"),
        JSON(2,"JSON"),
        DECIMAL(3,"数值"),
        STRING(4,"字符"),
        ;

        private int index;
        private String name;

        ParamTypeEnum(int index, String name){
            this.name = name;
            this.index = index;
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
            for(ParamTypeEnum e : ParamTypeEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static ParamTypeEnum getByIndex(int index){
            for(ParamTypeEnum e : ParamTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: 超享包包含项目枚举
     * @Date : 2019/1/9 下午2:26
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum EnjoyPackItemEnum implements EnumDesc{
        RSX(1,"RSX","人身险"),
        DQX(2,"DQX","盗抢险"),
        XBYJ(3,"XBYJ","续保押金")
        ;

        private int index;
        private String name;
        private String desc;

        EnjoyPackItemEnum(int index, String name,String desc){
            this.name = name;
            this.index = index;
            this.desc = desc;
        }

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

        public static String getNameByIndex(int index){
            for(EnjoyPackItemEnum e : EnjoyPackItemEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static EnjoyPackItemEnum getByIndex(int index){
            return Stream.of(EnjoyPackItemEnum.values()).filter(per -> per.getIndex() == index).findFirst().orElse(null);
        }

        public static EnjoyPackItemEnum getByName(String name){
            return Stream.of(EnjoyPackItemEnum.values()).filter(per -> per.getName().equals(name)).findFirst().orElse(null);
        }

        public static EnjoyPackItemEnum getByDesc(String desc){
            return Stream.of(EnjoyPackItemEnum.values()).filter(per -> per.getDesc().equals(desc)).findFirst().orElse(null);
        }
    }

}
