package com.lyqc.dharma.dto;

import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @Date : 2018/12/29$ 11:32$
 * @Author : liht
 */
@Data
public class TokenInfoResponseDTO {

    private String token;
    private Date createTime;
    private Date expireTime;

}
