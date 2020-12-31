package com.lyqc.gpsprovider.enums;

import com.lyqc.base.enums.EnumDesc;
import com.lyqc.base.enums.EnumValue;
import com.lyqc.gpsprovider.re.GpsDeviceNumRe;

import java.util.Optional;

/**
 * @description: 车辆GPS模块常量枚举实体类
 * @Date : 下午1:52 2018/1/4
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public final class CarGpsConstant {
    /**
     * 赛格供应商前置
     */
    public final static String SG_PREFIX = GpsDeviceAgencyPrefix.SG.name();
    /**
     * 久劲供应商前置
     */
    public final static String JJ_PREFIX = GpsDeviceAgencyPrefix.JJ.name();
    /**
     * 谷米供应商前置
     */
    public final static String GM_PREFIX = GpsDeviceAgencyPrefix.GM.name();
    /**
     * @description: GPS规则配置-GPS属性 枚举
     * @Date : 2018/3/22 下午3:45
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum GpsProEnum implements EnumValue {

        NONE(0, "无需安装"),
        WIRELESS1(1, "无线X1"),
        WIRELESS1_AND_WIRED1(2, "无线X1,有线X1");

        GpsProEnum(int index, String name) {
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
            for(GpsProEnum e : GpsProEnum.values()){
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
        public static GpsProEnum getByIndex(int index){
            for(GpsProEnum e : GpsProEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }

        /**
         * 根据GPS属性获取相应gps无线、有线安装数量
         * @param index
         * @return
         */
        public static GpsDeviceNumRe getDeviceNumByGpsPro(int index){
            GpsDeviceNumRe gpsDeviceNumRe = new GpsDeviceNumRe(0,0);
            GpsProEnum gpsProEnum = Optional.ofNullable(getByIndex(index)).orElse(GpsProEnum.NONE);
            switch (gpsProEnum){
                case WIRELESS1:
                    gpsDeviceNumRe.setWireDeviceCount(0);
                    gpsDeviceNumRe.setWirelessDeviceCount(1);
                    break;
                case WIRELESS1_AND_WIRED1:
                    gpsDeviceNumRe.setWireDeviceCount(1);
                    gpsDeviceNumRe.setWirelessDeviceCount(1);
                    break;
            }
            return gpsDeviceNumRe;
        }
    }

    /**
     * @description: GPS安装方式 枚举
     * @Date : 2018/6/4 下午7:47
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum GpsInstallTypeEnum implements EnumValue {
        PICK_UP_INSTALL(1, "带货安装"),
        BY_ONESELF_INSTALL(2, "自行安装");

        GpsInstallTypeEnum(int index, String name) {
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
            for(GpsInstallTypeEnum e : GpsInstallTypeEnum.values()){
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
        public static GpsInstallTypeEnum getByIndex(int index){
            for(GpsInstallTypeEnum e : GpsInstallTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: 门店管理 秒据接口 枚举
     * @Date : 2017/9/27 下午2:55
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum AppInfoIsGpsEnum implements EnumValue {

        UNINSTALL(0, "未安装"),
        INSTALLED(1, "已确认安装"),
        UPLOADED(2, "安装单已上传");

        AppInfoIsGpsEnum(int index, String name) {
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
            for(AppInfoIsGpsEnum e : AppInfoIsGpsEnum.values()){
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
        public static AppInfoIsGpsEnum getByIndex(int index){
            for(AppInfoIsGpsEnum e : AppInfoIsGpsEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: GPS认证结果类型
     * @Date : 2018/6/14 下午3:07
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum ApproveTypeEnum implements EnumValue {
        AUTO(1, "自动"),
        MANUAL(0, "手动");
        ApproveTypeEnum(int index, String name) {
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
            for(ApproveTypeEnum e : ApproveTypeEnum.values()){
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
        public static ApproveTypeEnum getByIndex(int index){
            for(ApproveTypeEnum e : ApproveTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * gps设备 远程访问返回码 枚举
     *
     * @author sine
     *
     */
    public enum GPSDeviceStatusEnum {

        NORMAL("NORMAL", "正常"),
        NO_INIT("NO_INIT", "时间未初始化"),
        NO_TRACK("NO_TRACK", "没有行驶轨迹"),
        NO_SPEED("NO_SPEED", "没有速度记录"),
        BLACK_AREA("BLACK_AREA", "信号曾出现在黑名单区域"),
        NO_REAL_INFO("NO_REAL_INFO", "没有实时GPS信号"),
        DIFF_CITY("DIFF_CITY", "2个GPS不在一个城市"),
        INVALID_GPSID("INVALID_GPSID", "无效的GPS ID"),
        OTHER("OTHER", "其他错误");

        private String name;
        private String value;

        private GPSDeviceStatusEnum(String value, String name) {
            this.name = name;
            this.value = value;
        }

        public static String getName(String value) {
            for (GPSDeviceStatusEnum temp : GPSDeviceStatusEnum.values()) {
                if (temp.getValue().equals(value)) {
                    return temp.getName();
                }
            }
            return "N/A";
        }

        public String getName() {
            return this.name;
        }

        public String getValue() {
            return this.value;
        }
    }

    /**
     *
     * @description: GPS审批业务类型
     * 1、GPS附件资料（更新、新增、修改）
     * 2、GPS安装信息(更新)
     * @Date : 下午2:41 2017/12/1
     * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
     */
    public enum CaGpsApproveBizEnum implements EnumValue {

        GPS_ANNEX_INFO(0, "GPS附件资料"),
        GPS_INSTALL_INFO(1, "GPS安装信息");

        private int index;
        private String name;

        CaGpsApproveBizEnum(int index, String name) {
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
            for(CaGpsApproveBizEnum e : CaGpsApproveBizEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static CaGpsApproveBizEnum getByIndex(int index){
            for(CaGpsApproveBizEnum e : CaGpsApproveBizEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: GPS验证结果状态，对接APP客户端显示使用
     * 接口通过ca_car_gps的status业务处理
     * @Date : 2018/6/15 下午6:04
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum GpsApproveStatusEnum implements EnumDesc {
        FAILURE(0, "验证失败","审核失败"),
        SUCCESS(1, "验证成功","审核成功"),
        PROCESS(2, "验证中","待审核");
        private Integer index;
        private String name;
        private String desc;

        GpsApproveStatusEnum(Integer index, String name, String desc) {
            this.index = index;
            this.name = name;
            this.desc = desc;
        }

        @Override
        public int getIndex() {
            return this.index;
        }

        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public String getDesc() {
            return this.desc;
        }

        /**
         * 根据code获取自动审核结果
         * @param index
         * @return
         */
        public static String getAutoAuditResultByIndex(int index){
            for(GpsApproveStatusEnum e : GpsApproveStatusEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }
        /**
         * 根据code获取人工审核结果
         * @param index
         * @return
         */
        public static String getManualAuditResultByIndex(int index){
            for(GpsApproveStatusEnum e : GpsApproveStatusEnum.values()){
                if(e.getIndex() == index){
                    return e.getDesc();
                }
            }
            return null;
        }

        /**
         * 根据索引获取枚举对象
         * @param index 索引
         * @return
         */
        public static GpsApproveStatusEnum getByIndex(int index){
            for(GpsApproveStatusEnum e : GpsApproveStatusEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: 设置ca_car_gps 的 status
     * GPS 人工审核状态
     * @Date : 2018/7/28 下午5:02
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum CarGpsStatusEnum implements EnumValue {
        FAILURE(0, "审核失败"),
        SUCCESS(1, "审核通过"),
        PROCESS(2, "审核中"),
        ;

        private int index;
        private String name;

        CarGpsStatusEnum(int index, String name) {
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
            for(CarGpsStatusEnum e : CarGpsStatusEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static CarGpsStatusEnum getByIndex(int index){
            for(CarGpsStatusEnum e : CarGpsStatusEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: 办单侠 贷前/贷后 入口 GPS审核状态枚举
     * @Date : 2018/8/31 下午4:10
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum BdxGpsApproveStatusEnum implements EnumValue {
        NO_APPROVE(0, "未审核"),
        APPROVING(1, "审核中"),
        SUCCESS(2, "审核成功"),
        FAILURE(3, "审核失败"),
        ;

        private int index;
        private String name;

        BdxGpsApproveStatusEnum(int index, String name) {
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
            for(BdxGpsApproveStatusEnum e : BdxGpsApproveStatusEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static BdxGpsApproveStatusEnum getByIndex(int index){
            for(BdxGpsApproveStatusEnum e : BdxGpsApproveStatusEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: GPS安装位置 枚举
     * 主驾驶，副驾驶，后备箱，顶棚，尾门，阅读灯，A柱，B柱，C柱，车门夹层，中控，扶手箱
     * @Date : 2018/6/18 上午10:45
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum GpsInstallPositionEnum implements EnumValue {
        main_driver(1, "主驾驶"),
        copilot(2, "副驾驶"),
        trunk(3, "后备箱"),
        ceiling(4, "顶棚"),
        tail_gate(5, "尾门"),
        reading_light(6, "阅读灯"),
        A_pillar(7, "A柱"),
        B_pillar(8, "B柱"),
        C_pillar(9, "C柱"),
        hood_of_gate(10, "车门夹层"),
        center_control(11, "中控"),
        armrest_box(12, "扶手箱"),
        ;

        private int index;
        private String name;

        GpsInstallPositionEnum(int index, String name) {
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
            for(GpsInstallPositionEnum e : GpsInstallPositionEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static GpsInstallPositionEnum getByIndex(int index){
            for(GpsInstallPositionEnum e : GpsInstallPositionEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * CaCarGps 中安装方式 isCurrent
     * 是否当前退回原因项 (0:否 1:是)
     * @author 石冬冬
     */
    public enum CarGpsIsCurrentEnum implements EnumValue {

        YES(1, "是"),
        NO(0, "否");

        private int index;
        private String name;

        CarGpsIsCurrentEnum(int index, String name) {
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
            for(CarGpsIsCurrentEnum e : CarGpsIsCurrentEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static CarGpsIsCurrentEnum getByIndex(int index){
            for(CarGpsIsCurrentEnum e : CarGpsIsCurrentEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * CaCarGps 中 isBack
     * 是否退回原因项 (0:否 1:是)
     * @author 石冬冬
     */
    public enum CarGpsIsBackEnum implements EnumValue {

        YES(1, "是"),
        NO(0, "否");

        private int index;
        private String name;

        CarGpsIsBackEnum(int index, String name) {
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
            for(CarGpsIsBackEnum e : CarGpsIsBackEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static CarGpsIsBackEnum getByIndex(int index){
            for(CarGpsIsBackEnum e : CarGpsIsBackEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: GPS供应商设备类型
     * @Date : 2018/8/23 上午11:50
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum GpsDeviceTypeEnum implements EnumValue {
        UNKNOWN(0, "UNKNOWN"),//未知类型
        WX(1, "WX"),//无线
        YX(2, "YX");//有线
        private int index;
        private String name;

        GpsDeviceTypeEnum(int index, String name) {
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
            for(GpsDeviceTypeEnum e : GpsDeviceTypeEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static GpsDeviceTypeEnum getByIndex(int index){
            for(GpsDeviceTypeEnum e : GpsDeviceTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
        public static GpsDeviceTypeEnum getByName(String name){
            for(GpsDeviceTypeEnum e : GpsDeviceTypeEnum.values()){
                if(e.getName().equals(name)){
                    return e;
                }
            }
            return null;
        }

        /**
         * 根据gps设备商编码获取设备类型
         * @param gpsDealerCode gps设备商编码
         * @return
         */
        public static GpsDeviceTypeEnum getEnumByDealerCode(String gpsDealerCode){
            GpsDeviceTypeEnum gpsDeviceTypeEnum = GpsDeviceTypeEnum.UNKNOWN;
            if(gpsDealerCode.endsWith("WX")){
                gpsDeviceTypeEnum = GpsDeviceTypeEnum.WX;
            }
            if(gpsDealerCode.endsWith("YX")){
                gpsDeviceTypeEnum = GpsDeviceTypeEnum.YX;
            }
            return gpsDeviceTypeEnum;
        }
    }
    /**
     * @description: GPS审核 违规类别 枚举
     * @Date : 2018/9/17 上午11:00
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum ViolationTypeEnum implements EnumValue {
        DISCORD_WITH_SYSTEM(1, "安装车型与系统不一致"),
        SCENE_WITH_CUSTOMER(2, "客户出现在安装现场"),
        REUSE_DEVICE(3, "重复使用设备"),
        POSITION_DISPARITY(4, "定位异省"),
        OTHER(5, "其他"),
        ;
        private int index;
        private String name;

        ViolationTypeEnum(int index, String name) {
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
            for(ViolationTypeEnum e : ViolationTypeEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static ViolationTypeEnum getByIndex(int index){
            for(ViolationTypeEnum e : ViolationTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: GPS审核 违规情况 枚举
     * @Date : 2018/9/17 上午11:00
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum ViolationSituationEnum implements EnumValue {
        YES(1, "有违规"),
        NO(0, "无违规"),
        ;
        private int index;
        private String name;

        ViolationSituationEnum(int index, String name) {
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
            for(ViolationSituationEnum e : ViolationSituationEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static ViolationSituationEnum getByIndex(int index){
            for(ViolationSituationEnum e : ViolationSituationEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
