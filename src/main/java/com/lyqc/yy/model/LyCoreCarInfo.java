package com.lyqc.yy.model;


import java.io.Serializable;
import java.util.List;

import com.lyqc.yy.dto.CarVinResultDTO;
import lombok.Data;

@Data
public class LyCoreCarInfo implements Serializable
{
    private static final long serialVersionUID = 6798792630957057675L;
    private IdentityCard identityCard;
    private IdentityResult identityResult;
    private IdentityCard spouseIdentityCard;
    private IdentityResult spouseIdentityResult;
    private IdentityCard guaranteeIdentityCard;
    private IdentityResult guaranteeIdentityResult;
    private GztBadInfoResult gztBadInfoResult;
    private GztBadInfoResult spouseGztBadInfoResult;
    private GztBadInfoResult guaranteeGztBadInfoResult;
    private List<CarVinResultDTO> listCarVinResultDTO;
    private YjValueScore yjValueScore;
    private YjValueScore spouseYjValueScore;
    private YjValueScore guaranteeYjValueScore;

}
