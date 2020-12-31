package com.lyqc.contract.param;

import java.io.Serializable;
import java.util.List;

import com.lyqc.receiveorder.param.bdx.BdxContractAnnexParam;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/8/8.
 */
@Data
public class ContractAddByImgParam implements Serializable{
    private List<BdxContractAnnexParam> contractAnnexParams;
}
