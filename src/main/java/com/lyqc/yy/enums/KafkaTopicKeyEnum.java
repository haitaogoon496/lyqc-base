package com.lyqc.yy.enums;

public enum KafkaTopicKeyEnum {
    TRANDITION_3C_FIRST_PARAM("3C", "3C_FIRST_PARAM", "商品贷一次风控参数"),
    TRANDITION_3C_FIRST_RESULT("3C", "3C_FIRST_RESULT", "商品贷一次风控结果"),
    TRANDITION_3C_LOANMIDDLE_PARAM("3C", "3C_LOANMIDDLE_PARAM", "商品贷贷中风控参数"),
    TRANDITION_3C_LOANMIDDLE_RESULT("3C", "3C_LOANMIDDLE_RESULT", "商品贷贷中风控结果"),
    TRANDITION_3C_XINKE_LOGIN_PARAM("3C", "3C_XINKE_LOGIN_PARAM", "3c新客登录传风控"),
    RECEIVE_THIRD_MSG_FRAUDMETRIX_PARAM("RECEIVE_THIRD_MSG", "RECEIVE_THIRD_MSG_FRAUDMETRIX_PARAM", "接收同盾指纹参数"),
    RECEIVE_THIRD_MSG_ZM_PARAM("RECEIVE_THIRD_MSG", "RECEIVE_THIRD_MSG_ZM_PARAM", "接收芝麻参数"),
    RECEIVE_THIRD_MSG_IDCARDCHECK_PARAM("RECEIVE_THIRD_MSG", "RECEIVE_THIRD_MSG_IDCARDCHECK_PARAM", "接收身份证后六位检查参数"),
    RECEIVE_THIRD_MSG_FRAUDMETRIX_RESULT("RECEIVE_THIRD_MSG", "RECEIVE_THIRD_MSG_FRAUDMETRIX_RESULT", "返回同盾指纹结果"),
    RECEIVE_THIRD_MSG_ZM_RESULT("RECEIVE_THIRD_MSG", "RECEIVE_THIRD_MSG_ZM_RESULT", "返回芝麻结果"),
    RECEIVE_THIRD_MSG_IDCARDCHECK_RESULT("RECEIVE_THIRD_MSG", "RECEIVE_THIRD_MSG_IDCARDCHECK_RESULT", "返回芝麻结果"),
    PDL_BLANKLIST_PARAM("PDL", "PDL_BLANKLIST_PARAM", "线上有钱用 百度，人脸黑名单 风控参数"),
    PDL_COMPLEX_BLANKLIST_PARAM("PDL", "PDL_COMPLEX_BLANKLIST_PARAM", "线上有钱用 同盾、凭安(联系人黑名单) 风控参数"),
    PDL_FIRST_PARAM("PDL", "PDL_FIRST_PARAM", "线上有钱用一次风控参数"),
    PDL_SECOND_PARAM("PDL", "PDL_SECOND_PARAM", "线上有钱用二次风控参数"),
    PDL_RECEIVE_MANUAL_PARAM("PDL", "PDL_RECEIVE_MANUAL_PARAM", "线上有钱用 接收PDL人工审核结果参数"),
    PDL_BLANKLIST_RESULT("PDL", "PDL_BLANKLIST_RESULT", "线上有钱用 百度，人脸黑名单 风控结果"),
    PDL_COMPLEX_BLANKLIST_RESULT("PDL", "PDL_COMPLEX_BLANKLIST_RESULT", "线上有钱用 同盾、凭安(联系人黑名单) 风控结果"),
    PDL_FIRST_RESULT("PDL", "PDL_FIRST_RESULT", "线上有钱用一次风控结果"),
    PDL_SECOND_RESULT("PDL", "PDL_SECOND_RESULT", "线上有钱用二次风控结果"),
    CAR_FIRST_PARAM("CAR", "CAR_FIRST_PARAM", "力蕴汽车第一决策引擎参数"),
    CAR_SECOND_PARAM("CAR", "CAR_SECOND_PARAM", "力蕴汽车第二决策引擎参数"),
    CAR_FOUR_PARAM("CAR", "CAR_FOUR_PARAM", "力蕴汽车第四决策引擎参数"),
    /** @deprecated */
    @Deprecated
    CAR_THIRD_PARAM("CAR", "CAR_THIRD_PARAM", "车贷第三决策引擎参数"),
    CAR_FIRST_RESULT("CAR", "CAR_FIRST_RESULT", "车贷第一决策引擎结果"),
    CAR_SECOND_RESULT("CAR", "CAR_SECOND_RESULT", "车贷第二决策引擎结果"),
    /** @deprecated */
    @Deprecated
    CAR_THIRD_RESULT("CAR", "CAR_THIRD_RESULT", "车贷第三决策引擎结果"),
    CAR_FOUR_RESULT("CAR", "CAR_FOUR_RESULT", "力蕴第四决策引擎结果"),
    YQY_FIRST_PARAM("YQY", "YQY_FIRST_PARAM", "有钱用一跑风控"),
    YQY_FIRST_RESULT("YQY", "YQY_FIRST_RESULT", "有钱用一跑风控结果"),
    YQY_SECOND_PARAM("YQY", "YQY_SECOND_PARAM", "有钱用二跑风控"),
    YQY_SECOND_RESULT("YQY", "YQY_SECOND_RESULT", "有钱用二跑风控结果"),
    WML_FIRST_PARAM("WML", "WML_FIRST_PARAM", "工友贷一跑风控"),
    WML_FIRST_RESULT("WML", "WML_FIRST_RESULT", "工友贷一跑风控结果"),
    WML_SECOND_PARAM("WML", "WML_SECOND_PARAM", "工友贷二跑风控"),
    WML_SECOND_RESULT("WML", "WML_SECOND_RESULT", "工友贷二跑风控结果"),
    YQY_CAR_FIRST_PARAM("YQYCAR", "YQY_CAR_FIRST_PARAM", "车竞对有钱用一跑风控"),
    YQY_CAR_FIRST_RESULT("YQYCAR", "YQY_CAR_FIRST_RESULT", "车竞对有钱用一跑风控结果"),
    YQY_CAR_SECOND_PARAM("YQYCAR", "YQY_CAR_SECOND_PARAM", "车竞对有钱用二跑风控"),
    YQY_CAR_SECOND_RESULT("YQYCAR", "YQY_CAR_SECOND_RESULT", "车竞对有钱用二跑风控结果"),
    O2O_DELIVERY_PARAM("O2O", "O2O_DELIVERY_PARAM", "O2O送货决策引擎参数"),
    O2O_DELIVERY_RESULT("O2O", "O2O_DELIVERY_RESULT", "O2O送货决策引擎结果"),
    DWF_ONE_PARAM("DWF", "DWF_ONE_PARAM", "库融申请参数"),
    DWF_SECOND_PARAM("DWF", "DWF_SECOND_PARAM", "库融审批参数"),
    DWF_THIRD_PARAM("DWF", "DWF_THIRD_PARAM", "库融提现参数"),
    DWF_FOUR_PARAM("DWF", "DWF_FOUR_PARAM", "库融提额参数"),
    DWF_ONE_RESULT("DWF", "DWF_ONE_RESULT", "库融申请结果"),
    DWF_SECOND_RESULT("DWF", "DWF_SECOND_RESULT", "库融审批结果"),
    DWF_THIRD_RESULT("DWF", "DWF_THIRD_RESULT", "库融提现结果"),
    DWF_FOUR_RESULT("DWF", "DWF_FOUR_RESULT", "库融提额结果"),
    MM_AUDIT_SH_FIRST_RESULT("MM_AUDIT", "MM_AUDIT_SH_FIRST_RESULT", "商户审核第一步结果"),
    MM_AUDIT_MD_FIRST_RESULT("MM_AUDIT", "MM_AUDIT_MD_FIRST_RESULT", "门店审核第一步结果"),
    MM_AUDIT_DY_FIRST_RESULT("MM_AUDIT", "MM_AUDIT_DY_FIRST_RESULT", "店员审核第一步结果"),
    MM_AUDIT_SH_SECOND_RESULT("MM_AUDIT", "MM_AUDIT_SH_SECOND_RESULT", "商户审核第二步结果"),
    MM_AUDIT_MD_SECOND_RESULT("MM_AUDIT", "MM_AUDIT_MD_SECOND_RESULT", "门店审核第二步结果"),
    MM_AUDIT_DY_SECOND_RESULT("MM_AUDIT", "MM_AUDIT_DY_SECOND_RESULT", "店员审核第二步结果"),
    YQY_CAR_SKO_PARAM("YQYCAR", "YQY_CAR_SKO_PARAM", "车竞对 秒拒前置 参数"),
    YQY_CAR_SKO_RESULT("YQYCAR", "YQY_CAR_SKO_RESULT", "车竞对 秒拒前置 结果"),
    YQY_FRQ_SKO_PARAM("YQYFRQ", "YQY_FRQ_SKO_PARAM", "泛人群有钱用对 秒拒前置 参数"),
    YQY_FRQ_SKO_RESULT("YQYFRQ", "YQY_FRQ_SKO_RESULT", "泛人群有钱用 秒拒前置 结果"),
    YQY_FRQ_FIRST_PARAM("YQYFRQ", "YQY_FRQ_FIRST_PARAM", "泛人群有钱用一跑风控"),
    YQY_FRQ_FIRST_RESULT("YQYFRQ", "YQY_FRQ_FIRST_RESULT", "泛人群有钱用一跑风控结果"),
    YQY_FRQ_SECOND_PARAM("YQYFRQ", "YQY_FRQ_SECOND_PARAM", "泛人群有钱用二跑风控"),
    YQY_FRQ_SECOND_RESULT("YQYFRQ", "YQY_FQR_SECOND_RESULT", "泛人群有钱用二跑风控结果"),
    NEWCAR_FIRST_PARAM("CAR", "NEWCAR_FIRST_PARAM", "新车融资租赁第一决策引擎参数"),
    NEWCAR_SECOND_PARAM("CAR", "NEWCAR_SECOND_PARAM", "新车融资租赁第二决策引擎参数"),
    NEWCAR_FIRST_RESULT("CAR", "NEWCAR_FIRST_RESULT", "新车融资租赁第一决策引擎结果"),
    NEWCAR_SECOND_RESULT("CAR", "NEWCAR_SECOND_RESULT", "新车融资租赁第二决策引擎结果"),
    SECKILL("SECKILL", "RISK_SECKILL", "秒拒请求"),
    SECKILL_RESULT("SECKILL", "RISK_SECKILL_RESULT", "秒拒结果"),
    JYD_FIRST_PARAM("JYD", "RISK_JYD_FIRST", "精英贷一次风控"),
    JYD_FIRST_RESULT("JYD", "RISK_JYD_FIRST_RESULT", "精英贷一次风控返回结果"),
    CAPRICORN_AUTHORIZE("AUTHORIZE", "TEL_OPERATOER_LOGIN", "摩羯创建授权成功任务"),
    CAPRICORN_TEL_OPERATOER_SUM("AUTHORIZE", "TEL_OPERATOER_SUM", "摩羯汇总报告数据生成成功"),
    CAPRICORN_TEL_OPERATOER_ORIGIN("AUTHORIZE", "TEL_OPERATOER_ORIGIN", "摩羯原始数据生成成功"),
    SP_BATCHFLOW_PARAM("BATCHFLOW", "SP_BATCHFLOW_PARAM", "3C交叉跑批授信前前置分流决策引擎参数"),
    SP_BATCHFLOW_RESULT("BATCHFLOW", "SP_BATCHFLOW_RESULT", "3C交叉跑批授信前置分流决策引擎结果");

    private String keyType;
    private String keyName;
    private String keyDescript;

    private KafkaTopicKeyEnum(String keyType, String keyName, String keyDescript) {
        this.keyType = keyType;
        this.keyName = keyName;
        this.keyDescript = keyDescript;
    }

    public String getKeyType() {
        return this.keyType;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public String getKeyDescript() {
        return this.keyDescript;
    }

    public String toString() {
        return "[" + this.keyType + ":" + this.keyName + ":" + this.keyDescript + "]";
    }
}
