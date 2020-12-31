package com.lyqc.receiveorder.dto;

import java.math.BigDecimal;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 返点账户
 * Created by xiaoxian on 2018/6/21.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoanAccountRebeatDto extends LoanAccountDto{
    private Integer order ; //返点账户顺序 1 和 2
    private BigDecimal distributeAccount;
}
