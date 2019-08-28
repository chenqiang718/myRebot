package com.cq.robotweb.requester;

import com.cq.robotweb.domain.tulingReq.PerceptionDTO;
import com.cq.robotweb.domain.tulingReq.UserInfoDTO;

/**
 * @Author: Chen Qiang
 * @Date: 2019-08-27 15:54
 * @description
 */
public class TulingHttpRequester {

    /**
     * 输入类型:0-文本(默认)、1-图片、2-音频
     */
    private Integer reqType;

    /**
     * 输入信息
     */
    private PerceptionDTO perception;

    /**
     * 用户参数
     */
    private UserInfoDTO userInfo;

    public Integer getReqType() {
        return reqType;
    }

    public void setReqType(Integer reqType) {
        this.reqType = reqType;
    }

    public PerceptionDTO getPerception() {
        return perception;
    }

    public void setPerception(PerceptionDTO perception) {
        this.perception = perception;
    }

    public UserInfoDTO getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoDTO userInfo) {
        this.userInfo = userInfo;
    }
}
