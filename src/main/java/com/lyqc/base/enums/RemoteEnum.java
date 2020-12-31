package com.lyqc.base.enums;

/**
 * @description: 服务接口相关枚举
 * @Date : 下午3:47 2018/1/6
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public enum  RemoteEnum implements EnumValue{
    SUCCESS(0, "成功"),
    FAILURE(1, "失败"),
    ERROR_IN_RUNTIME(5000, "运行时错误"),
    ERROR_IN_SERVER(5001, "服务器内部错误"),
    ERROR_WITH_EMPTY_PARAM(5002, "参数值不能为空"),
    ERROR_IN_BUSINESS(5003, "业务异常"),
    USER_NOT_EXISTS(5004, "不存在用户"),
    USER_SESSION_EXPIRE(5005, "用户session实效"),
    WARN_EMPTY_RECORD(5006, "未找到相关记录"),
    ILLEGAL_ARGUMENTS(5007, "不合法参数"),
    USER_NO_PERMISSION(5008, "用户无访问权限");

    private int index;
    private String name;

    RemoteEnum(int index, String name) {
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
        for(RemoteEnum e : RemoteEnum.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    public static RemoteEnum getByIndex(int index){
        for(RemoteEnum e : RemoteEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }
}
