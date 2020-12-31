package com.lyqc.yy.param;


import com.lyqc.yy.dto.DirectSchemesDTO;
import com.lyqc.yy.dto.LyLinkFaceDTO;
import com.lyqc.yy.dto.LyManualParamDTO;
import com.lyqc.yy.model.LyApplicant;
import com.lyqc.yy.model.LyApplicantSpouse;
import com.lyqc.yy.model.LyApplication;
import com.lyqc.yy.model.LyCarInfo;
import com.lyqc.yy.model.LyDealerCompany;
import com.lyqc.yy.model.LyGuarantee;
import com.lyqc.yy.model.LySale;
import com.lyqc.yy.model.LyStore;
import lombok.Data;

import java.io.Serializable;

@Data
public class FightFraudParam implements Serializable
{
    private static final long serialVersionUID = 7067517425086385053L;
    private LyApplicant lyApplicant;
    private LyApplicantSpouse lyApplicantSpouse;
    private LyApplication lyApplication;
    private LyCarInfo lyCarInfo;
    private LyDealerCompany lyDealerCompany;
    private LyGuarantee lyGuarantee;
    private LyStore lyStore;
    private LySale lySale;
    private LyLinkFaceDTO linkFaceDTO;
    private DeviceInfoParam deviceInfoParam;
    private DirectSchemesDTO directSchemesDTO;
    private LyManualParamDTO lyManualParamDTO;
}
