package com.cq.robotweb.utils;

import com.alibaba.fastjson.JSONObject;
import com.cq.robotweb.response.TulingHttpResponse;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import java.io.IOException;

/**
 * @Author: Chen Qiang
 * @Date: 2019-08-27 17:24
 * @description
 */
public class TulingUtil {

    private static String TULING_URL="http://openapi.tuling123.com/openapi/api/v2";

    public static TulingHttpResponse getTulingContent(String request) throws IOException {
        HttpEntity entity=new StringEntity(request);

        TulingHttpResponse response=null;
        HttpPost post=new HttpPost(TULING_URL);
        post.setConfig(HttpUtil.getRequestConfig());
        post.setEntity(entity);
        String result=HttpUtil.readHtml(post);
        if(StringUtils.isNotEmpty(result)){
            response=JSONObject.parseObject(result, TulingHttpResponse.class);
        }
        return response;
    }


}
