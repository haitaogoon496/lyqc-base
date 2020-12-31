package com.lyqc.gpsprovider.dto;

import com.lyqc.base.common.BaseDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description: 申请单GPS影像件DTO对象
 * @Date : 2018/6/15 下午7:18
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
public class AppAnnexImgDTO extends BaseDTO {
    private	String imgName;//图片名称
    private	String appCode;//申请单编号
    private	Long userId;//用户ID
    private	String userName;//用户姓名
    private	String imgCode;//影像件编码
    private	String imgKey;//影像件key
}
