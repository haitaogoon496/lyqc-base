package com.lyqc.receiveorder.enums;

import com.lyqc.base.enums.EnumDesc;

/**
 * yulv系统业务码
 * index 阿拉伯数字编码
 * desc 描述
 */
public enum YulvBussinessCodeEnum implements EnumDesc {
    /*
    * 10.业务异常--入参为空
    * 11.业务异常--入参数据异常
    * 12.业务异常--执行发现数据有误
    * 13.业务异常--调用第三方返回错误
    * 30.网络异常--调用第三方超时
    * 31.IO异常--读写文件失败
    * 32.
    *
    *
    *
    *
    */


    PARAM_IS_NULL(10001,"入参存在空值"),
    API_PARAM_IS_NULL(10002,"api入参不能为空"),

    AUTH_FAIL(11001,"认证失败"),
    ORDER_NOT_FOUND(11002,"订单不存在"),
    API_NOT_FOUND(11003,"api不存在"),

    ORDER_FORBIDDEN(12001,"该状态不允许此接口调用"),
    ORDER_DELETE_ERROR(12002,"当前状态不支持删除"),
    ORDER_WEIZHONG_FIRST_AUDIT_FORBINDDEN(12003,"初审尚未通过！"),
    ORDER_BEFORE_BACK_ERROR(12004,"当前订单状态不支持贷前退回"),
    ORDER_NO_BEFORE_BACK_ERROR(12005,"非贷前阶段不能退回"),
    ORDER_HEIGHT_BEFORE_BACK_ERROR(12006,"高风险订单不能退回"),
    ORDER_INSURANCE_No_LENGTH_ERROR(12007,"保单号最长30"),
    CITY_NOT_FIND_ERROR(12008,"没有找到指定的城市信息"),
    SYDEALER_NOT_FIND_ERROR(120009,"没有找到指定的经销商信息"),
    EXPRESSION_PARSER_ERROR(120010,"SPEL解析异常"),
    EXPRESSION_SOURCE_ERROR(120011,"SPEL获取ROOT数据异常"),
    EXPRESSION_ROOT_MISSING_ERROR(120012,"配置文件缺失root参数"),
    KEY_EXIST_ERROR(120013,"存在相同的key,请检测配置信息"),
    PARAMS_ERROR(120014,"入参校验错误!"),

    ECONTRACT_RETURN_ERROR(13001,"电子合同不允许重签"),
    IMG_NOT_FOUND(13031,"影像件中心查找不到"),
    INSURANCE_NO_ERROR(13032,"保单号长度最大为30"),

    REQUEST_DATA_ERROR(30000,"调用第三方服务错误"),
    ECONTRACT_REQ_TIMEOUT(30001,"电子合同请求超时"),

    WEBANK_REQ_TIMEOUT(30002,"微众请求超时"),
    IMG_QUERY_ERROR(30031,"影像件读取超时"),

    IMG_WRITE_ERROR(31001,"影像件写入本地失败");


    private Integer index;
    private String desc;

    YulvBussinessCodeEnum(Integer index, String desc){
        this.index = index;
        this.desc = desc;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getName() {
        return getIndex()+"";
    }

    @Override
    public String toString() {
        return "[" + this.index + ":" + this.desc + "]";
    }
}
