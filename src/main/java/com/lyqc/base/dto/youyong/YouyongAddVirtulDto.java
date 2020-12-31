package com.lyqc.base.dto.youyong;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.lyqc.base.common.BaseDTO;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/4/23.
 */
@Data
public class YouyongAddVirtulDto extends BaseDTO{
    @NotNull(message = "身份证不能为空")
    private String idCard; //,//身份证

    @NotNull(message = "姓名不能为空")
    private String name; //,//姓名

    private String mobile; //,//手机
    private String bank; //,//开户行
    private String bankCardNo; //,//银行卡号

    @NotNull(message = "征信授权方式不能为空")
    @Min(value = 1)
    @Max(value = 2)
    private Integer authType; //,//征信授权方式  1纸质  2电子

    private String owerSaler; //,//门店所属销售

    private String dealerCode; //, //所在门店

    @NotNull(message = "来源不能为空")
    @Min(value = 1)
    @Max(value = 2)
    private Integer source; // //1-有用现金贷 2C-端
}
