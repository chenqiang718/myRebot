package com.cq.robotweb.domain.tulingReq;

import lombok.Data;
import lombok.NonNull;

/**
 * @Author: Chen Qiang
 * @Date: 2019-08-27 16:15
 * @description
 */
@Data
public class UserInfoDTO {
    /**
     * 机器人标识
     */
    @NonNull
    private String apiKey;
    /**
     * 用户唯一标识
     */
    @NonNull
    private String userId;
    /**
     * 群聊唯一标识
     */
    private String groupId;
    /**
     * 群内用户昵称
     */
    private String userIdName;

    /**
     * 密钥
     */
    private String secret;
}
