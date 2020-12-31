package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/7/12.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxMxAuthParam implements Serializable{
    @NotBlank(message = "moxie不能为空")
    private String taskId;
}
