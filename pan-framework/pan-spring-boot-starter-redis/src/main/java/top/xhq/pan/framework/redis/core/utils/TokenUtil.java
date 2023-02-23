package top.xhq.pan.framework.redis.core.utils;

import top.xhq.pan.utils.CookieUtils;

public class TokenUtil {
    public static String getToken() {
        return CookieUtils.getCookie("token");
    }
}
