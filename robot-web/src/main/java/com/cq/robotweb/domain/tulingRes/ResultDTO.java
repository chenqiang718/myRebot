package com.cq.robotweb.domain.tulingRes;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.Map;

/**
 * @Author: Chen Qiang
 * @Date: 2019-08-27 17:50
 * @description
 */
@Data
public class ResultDTO {

    /**
     * 输出类型:
     * 文本(text);连接(url);音频(voice);视频(video);图片(image);图文(news)
     */
    private String resultType;
    /**
     * 输出值
     */
    private Map<String,String> values;
    /**
     * ‘组’编号:0为独立输出，大于0时可能包含同组相关内容 (如：音频与文本为一组时说明内容一致)
     */
    private int groupType;

}
