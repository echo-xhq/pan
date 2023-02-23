package top.xhq.pan.share.remote;

import org.springframework.cloud.openfeign.FeignClient;
import top.xhq.pan.serviceapi.service.UserService;

@FeignClient(value = "user-service")
public interface UserRemote extends UserService {
}
