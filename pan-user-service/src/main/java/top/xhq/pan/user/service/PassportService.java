package top.xhq.pan.user.service;

import top.xhq.pan.request.base.RestAPIResultDTO;
import top.xhq.pan.response.UserInfoDTO;

public interface PassportService {


    /**
     * 用户登录数据处理
     *
     * @author: xhq
     * @date: 2020/8/9
     */
    RestAPIResultDTO<String> loginHandle(String username, String password, String publicKey) throws Exception;

    /**
     * 用户推出数据处理
     *
     * @author: xhq
     * @date: 2020/8/9
     */
    RestAPIResultDTO<String> logoutHandle(String token);

    /**
     * 获取用户信息数据处理
     *
     * @author: xhq
     * @date: 2020/8/9
     */
    RestAPIResultDTO<UserInfoDTO> getUserInfoHandle(String userId);
}
