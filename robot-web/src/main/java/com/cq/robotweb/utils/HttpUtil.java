package com.cq.robotweb.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @Author: Chen Qiang
 * @Date: 2019-08-27 16:37
 * @description
 */
public class HttpUtil {

    private static CloseableHttpClient httpClient;

    //配置信息
    private static RequestConfig requestConfig = RequestConfig.custom()
            // 设置连接超时时间(单位毫秒)
            .setConnectTimeout(5000)
            // 设置请求超时时间(单位毫秒)
            .setConnectionRequestTimeout(5000)
            // socket读写超时时间(单位毫秒)
            .setSocketTimeout(5000)
            // 设置是否允许重定向(默认为true)
            .setRedirectsEnabled(true).build();

    public static String readHtml(HttpUriRequest request) throws IOException {
        CloseableHttpResponse response=null;
        String result="";
        try {
            httpClient=HttpClients.createDefault();
            response=httpClient.execute(request);
            HttpEntity httpEntity=response.getEntity();
            if(httpEntity!=null && response.getStatusLine().getStatusCode()==200){
                result= EntityUtils.toString(httpEntity);
            }
        }catch (IOException e){
            throw e;
        }finally {
            if(response!=null){
                response.close();
            }
            if(httpClient!=null){
                httpClient.close();
            }
        }
        return result;
    }

    public static RequestConfig getRequestConfig(){
        return requestConfig;
    }
}
