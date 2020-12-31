package com.lyqc.contract.param;

import com.lyqc.receiveorder.param.bdx.BdxFundContractParam;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AddFundContractParam implements Serializable {
    private List<BdxFundContractParam> bdxFundContractParams;
}
