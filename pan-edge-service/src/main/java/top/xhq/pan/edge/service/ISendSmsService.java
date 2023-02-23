package top.xhq.pan.edge.service;

import top.xhq.pan.request.SendSmsRequest;
import top.xhq.pan.request.base.RestAPIResultDTO;

public interface ISendSmsService {
    /**
     * 发送短信数据处理
     *
     * @author: xhq
     * @date: 2019/9/26
     */
    RestAPIResultDTO<String> sendSmsHandle(SendSmsRequest request);

}
