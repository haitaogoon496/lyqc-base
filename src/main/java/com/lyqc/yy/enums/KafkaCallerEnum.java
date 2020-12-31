package com.lyqc.yy.enums;

public enum KafkaCallerEnum {
    CALLER_CAR_1001("CAR", "CALLER_CAR_1001", "车贷人车分离项目"),
    CALLER_CAR_1002("CAR", "CALLER_CAR_1002", "车贷花生好车项目"),
    CALLER_CAR_1003("CAR", "CALLER_CAR_1003", "车贷秒拒前置"),
    CALLER_CAR_1004("CAR", "CALLER_CAR_1004", "车贷力蕴项目"),
    CALLER_PDL_1001("PDL", "CALLER_PDL_1001", "PDL人脸识别"),
    CALLER_PDL_1002("PDL", "CALLER_PDL_1002", "PDL联系人黑名单"),
    CALLER_PDL_1003("PDL", "CALLER_PDL_1003", "PDL信审第一次风控"),
    CALLER_PDL_1004("PDL", "CALLER_PDL_1004", "PDL信审第二次风控"),
    CALLER_PDL_1005("PDL", "CALLER_PDL_1005", "线上有钱用一次风控转dubbo"),
    YYFQ_RISK_BATCH("BATCH", "YYFQ_RISK_BATCH", "批量系统"),
    CALLER_CROSS_CASH("CCL", "CALLER_ADJUST", "交叉贷调额"),
    CALLER_DWF_1001("DWF", "CALLER_DWF_1001", "库融业务前端"),
    CALLER_DWF_TEST("DWF", "CALLER_DWF_TEST", "库融bgrk测试"),
    CALLER_MM_AUDIT("MM_AUDIT", "MM_AUDIT", "商户审核自动化"),
    CALL_FRQ_YQY("CALLER_FRQ_1001", "CALLER_FRQ_1001", "泛人群有钱用"),
    CALLER_JSBK_1001("CALLER_JSBK_1001", "CALLER_JSBK_1001", "极速白卡"),
    CALLER_JYD_1001("JYD", "CALLER_JYD_1001", "精英贷一次风控"),
    CALLER_CAR_1005("CAR", "CALLER_CAR_1005", "美利好车3年直租"),
    CALLER_CAR_1006("CAR", "CALLER_CAR_1006", "力蕴C端App"),
    CALLER_DWF_1002("DWF", "CALLER_DWF_1002", "库融信审系统"),
    CALLER_BATCHFLOW_1001("BATCHFLOW", "CALLER_BATCHFLOW_1001", "3C交叉跑批分流任务");

    private String callerType;
    private String callerName;
    private String callerDescript;

    private KafkaCallerEnum(String callerType, String callerName, String callerDescript) {
        this.callerType = callerType;
        this.callerName = callerName;
        this.callerDescript = callerDescript;
    }

    public String getCallerType() {
        return this.callerType;
    }

    public String getCallerName() {
        return this.callerName;
    }

    public String getCallerDescript() {
        return this.callerDescript;
    }

    public String toString() {
        return "[" + this.callerType + ":" + this.callerName + ":" + this.callerDescript + "]";
    }
}