package com.lyqc.base.dto.gps;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.model.CrmAppAnnex;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.util.List;

/**
 * @description: GPS提交DTO对象
 * @Date : 下午7:48 2018/1/3
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Deprecated
public class GpsSubmitDTO extends BaseDTO {
    private static final long serialVersionUID = -6165001330649484325L;
    /**
     * 单据号
     */
    @NotEmpty(message = "申请单号不能为空")
    private String appCode;
    /**
     * gps安装附件集合
     */
    @NotNull(message = "GPS安装附件不能为空")
    private List<CrmAppAnnex> annexList;

    public GpsSubmitDTO() {
    }

    /**
     * 构造函数
     * @param appCode 单据号
     * @param annexList GPS安装附件集合
     */
    public GpsSubmitDTO(String appCode, List<CrmAppAnnex> annexList) {
        this.appCode = appCode;
        this.annexList = annexList;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public List<CrmAppAnnex> getAnnexList() {
        return annexList;
    }

    public void setAnnexList(List<CrmAppAnnex> annexList) {
        this.annexList = annexList;
    }
}
