package com.cq.robotweb.response;

import com.cq.robotweb.domain.tulingRes.IntentDTO;
import com.cq.robotweb.domain.tulingRes.ResultDTO;
import lombok.Data;

/**
 * @Author: Chen Qiang
 * @Date: 2019-08-27 17:56
 * @description
 */
@Data
public class TulingHttpResponse {
    /**
     * 请求意图
     */
    private IntentDTO intent;
    /**
     * 输出结果集
     */
    private ResultDTO[] results;
}
