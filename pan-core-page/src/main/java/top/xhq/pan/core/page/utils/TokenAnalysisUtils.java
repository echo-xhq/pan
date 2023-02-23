package top.xhq.pan.core.page.utils;

import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Component;
import top.xhq.pan.response.UserInfoDTO;
import top.xhq.pan.utils.JSONUtils;
import top.xhq.pan.utils.JWTUtils;

/**
 * Token分析工具类
 *
 * @author: xhq
 * @date: 2019/9/27
 */
@Component
public class TokenAnalysisUtils {
    public UserInfoDTO tokenAnalysis(String token) {
        Claims claims = JWTUtils.parseJWT(token, "nimadetou".getBytes());
        String subject = claims.getSubject();
        UserInfoDTO userInfoDTO = JSONUtils.parseObject(subject, UserInfoDTO.class);
        return userInfoDTO;
    }
}
