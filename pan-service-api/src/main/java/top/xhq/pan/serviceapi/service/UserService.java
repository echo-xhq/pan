package top.xhq.pan.serviceapi.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import top.xhq.pan.response.UserInfoDTO;
import top.xhq.pan.request.base.RestAPIResultDTO;

public interface UserService {
    @RequestMapping(value = "getuserinfo", method = RequestMethod.POST)
    RestAPIResultDTO<UserInfoDTO> getUserInfo(@RequestParam("userId") String userId);
}
