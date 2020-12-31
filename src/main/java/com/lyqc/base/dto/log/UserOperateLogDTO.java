package com.lyqc.base.dto.log;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.enums.UserOperateLogConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotNull;

/**
 * @description: 用户操作日志DTO 记录到sy_user_operate_log
 * @Date : 上午11:12 2018/3/3
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserOperateLogDTO extends BaseDTO {
    private static final long serialVersionUID = 6629825559675996442L;
    /**
     * 操作人
     */
    @NotNull(message = "[userName]操作人不能为空")
    @Length(max = 40)
    private String userName;
    /**
     * 操作人
     */
    @NotNull(message = "[userId]操作人不能为空")
    private Integer userId;
    /**
     * 业务类型
     * {@link com.lyqc.base.enums.UserOperateLogConstant.AuthModelEnumForProduct}
     */
    @NotNull(message = "[authModel]业务类型不能为空")
    private UserOperateLogConstant.AuthModelEnumForProduct authModel;
    /**
     * 操作类型
     *  {@link com.lyqc.base.enums.UserOperateLogConstant.AuthTypeEnum}
     */
    @NotNull(message = "[authType]操作类型不能为空")
    private UserOperateLogConstant.AuthTypeEnum authType;
    /**
     * 日志详情
     */
    @NotNull(message = "[authDetail]日志详情不能为空")
    @Length(max = 5000)
    private String authDetail;
}
