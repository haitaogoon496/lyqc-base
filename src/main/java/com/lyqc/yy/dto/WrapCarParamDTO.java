package com.lyqc.yy.dto;

import com.lyqc.yy.enums.KafkaCallerEnum;
import com.lyqc.yy.enums.KafkaTopicKeyEnum;
import com.lyqc.yy.param.FightFraudParam;
import lombok.Data;

import java.io.Serializable;

@Data
public class WrapCarParamDTO implements Serializable
{
    private static final long serialVersionUID = 3799833710762630373L;
    private KafkaCallerEnum caller;
    private KafkaTopicKeyEnum key;
    private FightFraudParam data;
    private Object state;
    private int random;

}
