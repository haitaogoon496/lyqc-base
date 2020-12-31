package com.lyqc.yy.param;


import com.lyqc.yy.model.InsAddressBook;
import com.lyqc.yy.model.InsAppInfo;
import com.lyqc.yy.model.InsCallRecord;
import com.lyqc.yy.model.InsDeviceInfo;
import com.lyqc.yy.model.InsSms;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DeviceInfoParam implements Serializable
{
    private static final long serialVersionUID = 8944159109668817829L;
    private InsDeviceInfo deviceInfo;
    private List<InsCallRecord> callRecord;
    private List<InsAddressBook> addressBook;
    private List<InsSms> sms;
    private List<InsAppInfo> appInfo;

}
