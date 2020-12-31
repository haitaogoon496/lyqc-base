package com.lyqc.yy.param;

import com.lyqc.yy.dto.LyCoreAuditDataDTO;
import com.lyqc.yy.model.LyCoreApplicant;
import com.lyqc.yy.model.LyCoreApplicantSpouse;
import com.lyqc.yy.model.LyCoreCar;
import com.lyqc.yy.model.LyCoreDealerCompany;
import com.lyqc.yy.model.LyCoreGuarantee;
import com.lyqc.yy.model.LyCoreStore;
import lombok.Data;

import java.io.Serializable;

@Data
public class FightFraudCoreParam implements Serializable
{

    private static final long serialVersionUID = 8016835250067168758L;

    public static final String TYPE_CARINFO = "CARINFO";
    public static final String TYPE_CARPRICE = "CARPRICE";
    public static final String TYPE_AUDIT = "AUDIT";
    public static final String RET_CODE_SUCCESS = "0";
    public static final String RET_CODE_FAIL = "-1";
    public static final String RET_CODE_PARAM_NULL = "-2";
    public static final String RET_CODE_PASS_IN = "3000";
    public static final String RET_CODE_PASS_NOIN = "4000";
    public static final String RET_CODE_REJECT = "3001";
    public static final String RET_CODE_CANCEL = "3002";
    private String type;
    private String contractId;
    private LyCoreApplicant lyCoreApplicant;
    private LyCoreApplicantSpouse lyCoreApplicantSpouse;
    private LyCoreGuarantee lyCoreGuarantee;
    private LyCoreCar lyCoreCar;
    private LyCoreDealerCompany lyCoreDealerCompany;
    private LyCoreStore lyCoreStore;
    private LyCoreAuditDataDTO lyCoreAuditDataDTO;

}
