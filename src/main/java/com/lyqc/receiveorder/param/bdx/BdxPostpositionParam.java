package com.lyqc.receiveorder.param.bdx;

import com.lyqc.poseidon.param.CaAppInfo;
import com.lyqc.poseidon.param.CaAppInfoExtend;
import com.lyqc.poseidon.param.CaAppInfoFee;
import com.lyqc.poseidon.param.CaCarInfo;
import lombok.Data;

import java.io.Serializable;

/**
 * 后置规则校验接口参数
 */
@Data
public class BdxPostpositionParam implements Serializable {

    private static final long serialVersionUID = 1161615447710353739L;

    private CaAppInfo caAppInfo;

    private CaCarInfo caCarInfo;

    private CaAppInfoFee caAppInfoFee;

    private CaAppInfoExtend caAppInfoExtend;


}
