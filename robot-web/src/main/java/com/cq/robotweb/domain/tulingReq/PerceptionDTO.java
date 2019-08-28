package com.cq.robotweb.domain.tulingReq;

import lombok.Data;

/**
 * @Author: Chen Qiang
 * @Date: 2019-08-27 16:01
 * @description
 */
@Data
public class PerceptionDTO {
    /**
     * 文本信息
     */
    private InputTextDTO inputText;

    /**
     * 图片信息
     */
    private InputImageDTO inputImage;

    /**
     * 音频信息
     */
    private InputMediaDTO inputMedia;

    /**
     * 客户端属性
     */
    private SelfInfoDTO selfInfo;
}
