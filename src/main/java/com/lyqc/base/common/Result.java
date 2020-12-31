package com.lyqc.base.common;

import com.lyqc.base.enums.RemoteEnum;

import java.io.Serializable;

/**
 * @description: 用于DTO返回泛型使用，提供Dobbo服务一种数据协议
 * @Date : 上午11:49 2017/9/29
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class Result<E> implements Serializable {
    private final static int SUCCESS_CODE = 0;
    private final static int FAILURE_CODE = 1;
    private final static String SUCCESS_MSG = "操作成功";
    private final static String FAILURE_MSG = "操作失败";
    private static final long serialVersionUID = -6237151417035547947L;
    /**
     * 是否执行成功
     */
    private boolean success;
    /**
     * 包体
     */
    private E data;
    /**
     * 执行操作code
     */
    private int code;
    /**
     * 业务消息
     */
    private String msg;

    public Result() {
    }

    /**
     * 构造函数
     * @param success
     * @param data
     * @param code
     * @param msg
     */
    public Result(boolean success, E data, int code, String msg) {
        this.success = success;
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 静态方法，返回执行成功
     * @return
     */
    public static Result suc(){
        return suc(SUCCESS_MSG,SUCCESS_CODE,SUCCESS_MSG);
    }

    /**
     * 静态方法，返回执行成功
     * @param t
     * @param <E>
     * @return
     */
    public static <E> Result<E> suc(E t){
        return suc(t,SUCCESS_CODE,SUCCESS_MSG);
    }

    /**
     * 静态方法，返回执行成功
     * @param t
     * @param code
     * @param msg
     * @param <E>
     * @return
     */
    public static <E> Result<E> suc(E t,int code,String msg){
        return new Result<>(Boolean.TRUE,t,code,msg);
    }

    /**
     * 静态方法，返回执行成功
     * @param t 返回具体的包装对象
     * @param remoteEnum 业务枚举对象
     * @param msg 业务信息
     * @param <E>
     * @return
     */
    public static <E> Result<E> suc(E t, RemoteEnum remoteEnum, String msg){
        return new Result<>(Boolean.TRUE,t,remoteEnum.getIndex(),msg);
    }

    /**
     * 静态方法，返回执行失败
     * @return
     */
    public static Result<Object> fail(){
        return fail(FAILURE_MSG,FAILURE_CODE,FAILURE_MSG);
    }

    /**
     * 静态方法，返回执行失败
     * @param t
     * @param <E>
     * @return
     */
    @Deprecated
    public static <E> Result<E> fail(E t){
        return fail(t,FAILURE_CODE,FAILURE_MSG);
    }

    @Deprecated
    public static Result fail(String msg){
        return fail(null, -1, msg);
    }

    /**
     * 静态方法，返回执行失败
     * @param code 业务代码
     * @param msg 业务信息
     * @param <E>
     * @return
     */
    public static <E> Result<E> fail(int code,String msg){
        return fail(null, code, msg);
    }

    /**
     * 静态方法，返回执行失败
     * @param remoteEnum 业务枚举
     * @param msg 业务信息
     * @param <E>
     * @return
     */
    public static <E> Result<E> fail(RemoteEnum remoteEnum,String msg){
        return fail(null, remoteEnum.getIndex(), msg);
    }

    /**
     * 静态方法，返回执行失败
     * @param remoteEnum
     * @return
     */
    public static <E> Result<E> fail(RemoteEnum remoteEnum){
        return new Result<>(Boolean.FALSE,null,remoteEnum.getIndex(),remoteEnum.getName());
    }
    /**
     * 静态方法，返回执行失败
     * @param t
     * @param code
     * @param msg
     * @param <E>
     * @return
     */
    public static <E> Result<E> fail(E t,int code,String msg){
        return new Result<>(Boolean.FALSE,t,code,msg);
    }

    /**
     * 静态方法，返回执行成功
     * @param t 返回具体的包装对象
     * @param remoteEnum 业务枚举对象
     * @param msg 业务信息
     * @param <E>
     * @return
     */
    public static <E> Result<E> fail(E t, RemoteEnum remoteEnum, String msg){
        return fail(t,remoteEnum.getIndex(),msg);
    }

    /**
     * 静态方法，返回执行失败：业务异常
     * @param t
     * @param <E>
     * @return
     */
    public static <E> Result<E> failInBusiness(E t){
        return fail(t, RemoteEnum.ERROR_IN_BUSINESS.getIndex(),RemoteEnum.ERROR_IN_BUSINESS.getName());
    }
    /**
     * 静态方法，返回执行失败：参数为空
     * @param t
     * @param <E>
     * @return
     */
    public static <E> Result<E> failWithEmptyParam(E t){
        return fail(t, RemoteEnum.ERROR_WITH_EMPTY_PARAM.getIndex(),RemoteEnum.ERROR_WITH_EMPTY_PARAM.getName());
    }
    /**
     * 静态方法，返回执行失败：服务端内部错误
     * @param t
     * @param <E>
     * @return
     */
    public static <E> Result<E> failInServer(E t){
        return fail(t, RemoteEnum.ERROR_IN_SERVER.getIndex(),RemoteEnum.ERROR_IN_SERVER.getName());
    }
    /**
     * 静态方法，返回执行失败：运行时错误
     * @param t
     * @param <E>
     * @return
     */
    public static <E> Result<E> failInRuntime(E t){
        return fail(t, RemoteEnum.ERROR_IN_RUNTIME.getIndex(),RemoteEnum.ERROR_IN_RUNTIME.getName());
    }
    /**
     * 静态方法，返回执行失败：未找到相关记录
     * @param t
     * @param <E>
     * @return
     */
    public static <E> Result<E> failInEmptyRecord(E t){
        return fail(t, RemoteEnum.WARN_EMPTY_RECORD.getIndex(),RemoteEnum.WARN_EMPTY_RECORD.getName());
    }
}
