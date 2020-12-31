package com.lyqc.contract.enums.common;

/**
 * Created by ggg on 2017/7/25.
 * 错误信息业务常量
 */
public enum ErrorConstants {
    DAO_ERR(10, "DAO异常"),
    REQUEST_PARAMS_IS_NULL(20, "请求参数不能为空"),
    ENUM_EXCEPTION(30, "枚举解析异常"),
    RESULT_IS_NULL(40, "查询结果不存在"),


    E_CONTRACT_EXCEPTION(100, "电子合同接口异常"),
    E_CONTRACT_RESULT_IS_NULL(101, "电子合同接口返回数据为空"),
    E_CONTRACT_CALLBACK_PARAMS_IS_NULL(102, "电子合同签署完成回调参数为空"),
    E_CONTRACT_PARAMS_IS_NULL(103, "电子合同合同要素入参为空"),
    E_CONTRACT_IS_NULL(104, "电子合同信息为空"),
    CONTRACT_STATUS_ERROR(105, "获取合同状态异常"),
    CONTRACT_LIST_ERROR(106, "获取合同列表数据异常"),
    E_CONTRACT_SIGNING(107, "电子合同签约中,请勿重签"),
    E_CONTRACT_SIGN_SUCCESS(107, "电子合同签约成功,请勿重签"),
    E_CONTRACT_UPLOAD_FAIL(108, "合同上传失败"),
    E_CONTRACT_CANNEL_FAIL(109, "取消合同失败"),
    E_CONTRACT_PRE_SINGING(110, "预签约签约中"),


    TEMPLATE_IS_NULL(200, "合同模板信息为空"),

    PRODUCT_CODE_NOT_EXIST(300, "产品编码不存在"),
    REQ_PROPPSER_IS_NULL(301, "申请人信息为空"),
    REQ_SUB_PROPPSER_IS_NULL(302, "申请人状况信息为空"),
    REQ_CAR_IS_NULL(303, "车辆信息为空"),
    REQ_DEALER_IS_NULL(304, "门店信息为空"),
    REQ_LOAN_IS_NULL(305, "借款信息为空"),
    REQ_FEE_IS_NULL(306, "费用信息为空"),
    REQ_ACCOUNT_IS_NULL(307, "费用账户信息为空"),
    REQ_ADDRESS_IS_NULL(308, "地址信息为空"),
    REQ_JOB_IS_NULL(308, "工作信息为空"),
    REQ_RELATIVE_IS_NULL(309, "申请关联人信息为空"),
    MARKET_IS_NULL(310, "市场信息为空"),

    PUSH_UNITE_LOAN_ERROR(400, "推送新网联合贷信息到资负异常"),
    PUSH_UNITE_LOAN_RETURN_NULL(401, "推送新网联合贷信息到资负响应信息为空"),
    PUSH_UNITE_LOAN_RETURN_FAIL(402, "推送新网联合贷信息到资负响应失败"),
    UNITE_LOAN_CALLBACK_IS_NULL(403, "推送新网联合贷信息到资负响应失败"),
    CALLBACK_IS_EXIST(404, "合同中心回调信息已存在，请勿多次回调"),
    UNITE_LOAN_SIGNING(405, "新网联合贷合同签署中"),

    CARRIER_DOWNLOAD_FAIL(500, "影像中心文件下载失败");

    private int errorCode;
    private String errorMessage;

    ErrorConstants(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
