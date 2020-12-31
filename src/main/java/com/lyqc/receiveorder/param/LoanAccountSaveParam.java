package com.lyqc.receiveorder.param;

import lombok.Data;

/**
 * 保存放款账户参数
 * Created by xiaoxian on 2018/6/21.
 */
@Data
public class LoanAccountSaveParam extends BaseReiveorderParam{
    private LoanAccountSaveContentParam dealerAccountDTO;
}
