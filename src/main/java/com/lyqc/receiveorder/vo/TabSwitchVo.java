package com.lyqc.receiveorder.vo;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * 是否打开编辑页控制
 * 老 直销 渠道使用
 * Created by xiaoxian on 2018/8/25.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TabSwitchVo implements Serializable{
    private String appCode;

    private List<String> switchList;

    private int needGps;
}
