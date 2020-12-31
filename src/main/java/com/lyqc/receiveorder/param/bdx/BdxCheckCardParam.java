package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import lombok.Data;

/**
 * 验卡数据
 * Created by xiaoxian on 2018/7/17.
 */
@Data
public class BdxCheckCardParam implements Serializable{
    private Integer bankCardType;
    private String bankAccount;
    private String bankCardNo;
}
