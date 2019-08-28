package com.cq.robotweb.controller;

import com.cq.robotweb.domain.tulingReq.InputTextDTO;
import com.cq.robotweb.domain.tulingReq.PerceptionDTO;
import com.cq.robotweb.domain.tulingReq.UserInfoDTO;
import com.cq.robotweb.requester.TulingHttpRequester;
import com.cq.robotweb.response.ServiceResponse;
import com.cq.robotweb.service.TulingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Chen Qiang
 * @Date: 2019-08-27 19:29
 * @description
 */
@RestController
public class ChatController {

    private String APIKEY="dd01872652e546b3af55ab49d2a592fe";
    private String SECRET="e88ab91129554819";
    private String USERID="500426";

    @Resource
    private TulingService tulingService;

    @RequestMapping("chat")
    public ServiceResponse chat(@RequestParam String content){
        try {
            PerceptionDTO perceptionDTO=new PerceptionDTO();
            InputTextDTO inputTextDTO=new InputTextDTO();
            inputTextDTO.setText(content);

            perceptionDTO.setInputText(inputTextDTO);

            UserInfoDTO userInfoDTO=new UserInfoDTO(APIKEY,USERID);
            userInfoDTO.setSecret(SECRET);

            TulingHttpRequester request=new TulingHttpRequester();
            request.setReqType(0);
            request.setUserInfo(userInfoDTO);
            request.setPerception(perceptionDTO);
            return tulingService.chat(request);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ServiceResponse.failed;
    }


}
