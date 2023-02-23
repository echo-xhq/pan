package top.xhq.pan.user.remote;

import org.springframework.cloud.openfeign.FeignClient;
import top.xhq.pan.serviceapi.service.EdgeService;

/**
 * 边缘服务API
 *
 * @author: xhq
 * @date: 2019/9/26
 */
@FeignClient(value = "edge-service")
public interface EdgeRemote extends EdgeService {
}
