package com.cq.robotweb.service;

import com.cq.robotweb.requester.TulingHttpRequester;
import com.cq.robotweb.response.ChatResponse;
import com.cq.robotweb.response.ServiceResponse;

/**
 * @Author: Chen Qiang
 * @Date: 2019-08-27 20:08
 * @description
 */
public interface TulingService {
    ServiceResponse<ChatResponse> chat(TulingHttpRequester requester);
}
