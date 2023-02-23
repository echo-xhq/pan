package top.xhq.pan.user.remote;

import org.springframework.cloud.openfeign.FeignClient;
import top.xhq.pan.serviceapi.service.CoreService;

/**
 * 核心服务API
 *
 * @author: xhq
 * @date: 2019/9/26
 */
@FeignClient(value = "core-service")
public interface CoreRemote extends CoreService {
}
