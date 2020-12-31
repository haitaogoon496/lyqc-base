package com.lyqc.base.enums.dbenum;

import com.lyqc.base.enums.EnumDesc;
import com.lyqc.base.enums.EnumValue;

/**
 * 上传状态 0:上传 1:已上传 2:审批通过3:审批未通过
 * Created by xiaoxian on 2018/5/14.
 */
public enum CaAfterLoanImgUploadStatus implements EnumValue,EnumDesc{
    UNKONW(-1, "未知"),
    WAIT_UPLOAD(0, "未上传"),
    UPLOADED(1, "已上传"),
    AUDIT_PASS(2, "审批通过"),
    AUDIT_RUFUSE(3, "审批未通过");

    private Integer index;
    private String name;

    CaAfterLoanImgUploadStatus(int index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override
    public String getDesc() {
        return name;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getName() {
        return name;
    }

    public static CaAfterLoanImgUploadStatus getStatusByIndex(Integer index){
        if(index == null){
            return UNKONW;
        }
        for(CaAfterLoanImgUploadStatus s : CaAfterLoanImgUploadStatus.values()){
            if(s.getIndex() == index.intValue()){
                return s;
            }
        }
        return UNKONW;
    }
}
