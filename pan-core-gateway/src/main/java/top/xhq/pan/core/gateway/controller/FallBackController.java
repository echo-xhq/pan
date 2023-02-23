package top.xhq.pan.core.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xhq.pan.enums.ResultCodeEnum;
import top.xhq.pan.request.base.RestAPIResultDTO;

/**
 * 服务调用失败返回
 * 
 * @author: xhq
 * @date: 2021/11/21
 */
@RestController
@RequestMapping("/fallback")
public class FallBackController {
    @RequestMapping("")
    public RestAPIResultDTO<String> fallback() {
        return RestAPIResultDTO.Error(null, ResultCodeEnum.UNAVAILABLE);
    }
}
