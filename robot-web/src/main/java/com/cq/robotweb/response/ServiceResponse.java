package com.cq.robotweb.response;

import lombok.Data;

/**
 * @Author: Chen Qiang
 * @Date: 2019-08-27 19:32
 * @description
 */
public class ServiceResponse<T> {
    /**
     * 信息码
     */
    private Integer code;
    /**
     * 描述信息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;

    public static ServiceResponse<Object> failed=new ServiceResponse<>(20000,"请求失败",null);

    public ServiceResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ServiceResponse(){
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
