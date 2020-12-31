package com.lyqc.product.dto;

import com.lyqc.base.entity.CaAppInfoEntity;
import com.lyqc.base.entity.CaAppInfoFeeEntity;
import com.lyqc.base.entity.CaCarInfoEntity;
import com.lyqc.base.entity.CaProppserInfoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;

/**
 * @description:置入前置所需数据
 * @author: zhaoxin
 * @date: 2019/3/4 2:34 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PrePositionDTO implements Serializable {
    private static final long serialVersionUID = -3356912462840000459L;

    /**
     * 贷款申请单信息
     */
    @NotNull(message = "[appInfo]订单信息不能为空")
    protected CaAppInfoEntity appInfo;

    /**
     * 贷款申请单费用信息
     */
    @NotNull(message = "[appInfoFee]贷款申请单费用信息不能为空")
    protected CaAppInfoFeeEntity appInfoFee;

    /**
     * 贷款申请单车辆信息
     */
    @NotNull(message = "[carInfo]贷款申请单车辆信息不能为空")
    protected CaCarInfoEntity carInfo;

    /**
     * 申请人信息
     */
    @NotNull(message = "[proppserInfo]申请人信息不能为空")
    protected CaProppserInfoEntity proppserInfo;
}
