package top.xhq.pan.edge.service.impl;

import org.springframework.stereotype.Service;
import top.xhq.pan.edge.service.ISendSmsService;
import top.xhq.pan.edge.utils.AbsRestClient;
import top.xhq.pan.edge.utils.JsonReqClient;
import top.xhq.pan.pojo.SmsResult;
import top.xhq.pan.request.SendSmsRequest;
import top.xhq.pan.request.base.RestAPIResultDTO;
import top.xhq.pan.utils.JSONUtils;

@Service
public class SendSmsServiceImpl implements ISendSmsService {
    @Override
    public RestAPIResultDTO<String> sendSmsHandle(SendSmsRequest request) {
        String jsonResult = InstantiationRestAPI().sendSms(request.getSid(), request.getToken(), request.getAppid(), request.getTemplateid(), request.getParam(), request.getMobile(), request.getUid());
        System.out.println("Response content is: " + jsonResult);
        SmsResult result = JSONUtils.parseObject(jsonResult, SmsResult.class);
        if (!result.getMsg().equals("OK")) {
            return RestAPIResultDTO.Error("发送失败");
        }
        return RestAPIResultDTO.Success("发送成功");
    }

    static AbsRestClient InstantiationRestAPI() {
        return new JsonReqClient();
    }
}
