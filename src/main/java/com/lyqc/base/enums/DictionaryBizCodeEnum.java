package com.lyqc.base.enums;

/**
 * @description: 数据字典 业务code枚举
 * @Date : 2018/7/9 下午12:11
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum DictionaryBizCodeEnum implements EnumDesc {
    flowSeq(1, "flowSeq", "审批流程");

    private Integer index;
    private String name;
    private String desc;

    DictionaryBizCodeEnum(Integer index, String name, String desc) {
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
     * 根据索引获取名称
     *
     * @param index 索引
     * @return
     */
    public static String getNameByIndex(int index) {
        for (DictionaryBizCodeEnum e : DictionaryBizCodeEnum.values()) {
            if (e.getIndex() == index) {
                return e.getName();
            }
        }
        return null;
    }

    /**
     * 根据索引获取枚举对象
     *
     * @param index 索引
     * @return
     */
    public static DictionaryBizCodeEnum getByIndex(int index) {
        for (DictionaryBizCodeEnum e : DictionaryBizCodeEnum.values()) {
            if (e.getIndex() == index) {
                return e;
            }
        }
        return null;
    }

    /**
     * 根据索引获取枚举对象
     *
     * @param desc 索引
     * @return
     */
    public static DictionaryBizCodeEnum getByDesc(String desc) {
        for (DictionaryBizCodeEnum e : DictionaryBizCodeEnum.values()) {
            if (e.getDesc().equals(desc)) {
                return e;
            }
        }
        return null;
    }
}