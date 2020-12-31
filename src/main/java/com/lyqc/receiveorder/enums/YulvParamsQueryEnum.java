package com.lyqc.receiveorder.enums;

import com.lyqc.base.enums.EnumDesc;

/**
 * User: HY
 * Date: 2019/3/5
 * Time: 13:13
 * Description:参数化查询枚举
 */
public enum  YulvParamsQueryEnum implements EnumDesc {
    Q100001(1,"Q100001","根据appCode查询订单信息"),
    Q100003(3,"Q100003","根据appCode查询返佣金"),
    Q100006(6,"Q100006","根据appCode查询贷后审批退回信息");

    YulvParamsQueryEnum(Integer index, String api, String desc) {
        this.index = index;
        this.api = api;
        this.desc = desc;
    }

    private Integer index;
    /**
     * url
     */
    private String api;
    /**
     * 描述
     */
    private String desc;

    @Override
    public String getDesc() {
        return this.desc;
    }

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public String getName() {
        return this.api;
    }

    public String getApi() {
        return this.api;
    }
}
