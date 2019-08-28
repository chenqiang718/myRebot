package com.cq.robotweb.service;

import com.alibaba.fastjson.JSON;
import com.cq.robotweb.requester.TulingHttpRequester;
import com.cq.robotweb.response.ChatResponse;
import com.cq.robotweb.response.ServiceResponse;
import com.cq.robotweb.response.TulingHttpResponse;
import com.cq.robotweb.utils.TulingUtil;
import org.springframework.stereotype.Service;

/**
 * @Author: Chen Qiang
 * @Date: 2019-08-27 20:07
 * @description
 */
@Service("tulingService")
public class TulingServiceImpl implements TulingService {
    @Override
    public ServiceResponse<ChatResponse> chat(TulingHttpRequester request) {
        ServiceResponse<ChatResponse> serviceResponse=new ServiceResponse<>(20000,"",null);
        TulingHttpResponse response;
        try {
            response= TulingUtil.getTulingContent(JSON.toJSONString(request));
            serviceResponse.setCode(10000);
            serviceResponse.setMsg("成功");
            serviceResponse.setData(convert(response));
        }catch (Exception e){
            e.printStackTrace();
        }
        return serviceResponse;
    }

    private ChatResponse convert(TulingHttpResponse tulingHttpResponse){
        ChatResponse chatResponse=new ChatResponse();
        if(tulingHttpResponse!=null){
            chatResponse.setReply(tulingHttpResponse.getResults()[0].getValues().get("text"));
        }
        return chatResponse;
    }
}
