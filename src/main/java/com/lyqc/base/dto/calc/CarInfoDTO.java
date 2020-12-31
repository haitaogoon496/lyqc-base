package com.lyqc.base.dto.calc;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 车辆信息相关DTO，用于计算引擎传输使用
 * @Date : 下午9:29 2018/4/15
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class CarInfoDTO extends BaseDTO {
    static final String SIGN = "-";
    @ApiModelProperty(name="carAge",value="车龄(月)",dataType="BigDecimal")
    @NotNull(message = "[carAge]车龄(月)不能为空")
    private BigDecimal carAge;

    @ApiModelProperty(name="course",value="车辆里程",dataType="BigDecimal")
    @NotNull(message = "[course]车辆里程不能为空")
    private BigDecimal course;
    /**
     * 新车参考价格(不含税)(元)
     */
    @ApiModelProperty(name="carNewPrice",value="新车参考价格",dataType="BigDecimal")
    @NotNull(message = "[carNewPrice]新车参考价格不能为空")
    private	BigDecimal carNewPrice;
    /**
     * 二手车首次登记日期
     */
    @ApiModelProperty(name="carFirstBook",value="二手车首次登记日期",dataType="Date")
    @NotNull(message = "[carFirstBook]二手车首次登记日期不能为空")
    private Date carFirstBook;

    /**
     * 车龄计算(根据车辆首次登记日期到当前日期间隔月份)
     * @param beginTimeValue 首次登记日期
     * @param endTimeValue 系统当前时间
     * @return 车龄月份
     */
    public static BigDecimal callCarAge(Date beginTimeValue, Date endTimeValue) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String beginTime = sdf.format(beginTimeValue);
        String endTime = sdf.format(endTimeValue);
        // 拆分开始日期的年月日
        String[] beginDate = beginTime.split(SIGN);
        // 拆分开始日期的年月日
        String[] endDate = endTime.split(SIGN);
        // 得到开始日期的月数
        Integer bMonth = Integer.parseInt(beginDate[0]) * 12 + Integer.parseInt(beginDate[1]);
        // 得到结束日
        Integer eMonth = Integer.parseInt(endDate[0]) * 12 + Integer.parseInt(endDate[1]);
        if (Integer.parseInt(endDate[2]) - Integer.parseInt(beginDate[2]) > 0) {
            // 如果结束日期的天大于开始的天 则结束日期的月+1
            eMonth = eMonth + 1;
        }
        // 获取月数
        Integer totalMonth = Math.abs(eMonth - bMonth);
        return new BigDecimal(totalMonth.toString());
    }
}
