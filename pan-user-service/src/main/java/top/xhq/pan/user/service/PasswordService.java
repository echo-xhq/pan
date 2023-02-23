package top.xhq.pan.user.service;

import top.xhq.pan.request.ForgetPhoneSendRequest;
import top.xhq.pan.request.ModifyPassRequest;
import top.xhq.pan.request.base.RestAPIResultDTO;

public interface PasswordService {
    /**
     * 忘记密码短信服务数据处理
     *
     * @author: xhq
     * @date: 2019/9/26
     */
    RestAPIResultDTO<String> forgetPhoneSendHandle(ForgetPhoneSendRequest request);

    /**
     * 手机号/用户名校验数据处理
     *
     * @author: xhq
     * @date: 2019/9/26
     */
    RestAPIResultDTO<String> checkPhoneSendHandle(String username);

    /**
     * 忘记密码的修改数据处理
     *
     * @author: xhq
     * @date: 2019/9/26
     */
    RestAPIResultDTO<String> modifyPassHandle(ModifyPassRequest request);
}
