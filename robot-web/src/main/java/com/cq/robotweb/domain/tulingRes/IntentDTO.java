package com.cq.robotweb.domain.tulingRes;

import lombok.Data;

import java.util.Map;

/**
 * @Author: Chen Qiang
 * @Date: 2019-08-27 17:42
 * @description
 */
@Data
public class IntentDTO {

    /**
     * 输出功能code
     */
    private Integer code;
    /**
     * 意图名称
     */
    private String intentNamed;
    /**
     * 意图动作名称
     */
    private String actionName;
    /**
     * 参数
     */
    private Map parameters;
}
