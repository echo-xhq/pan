package top.xhq.pan.file.remote;

import org.springframework.cloud.openfeign.FeignClient;
import top.xhq.pan.serviceapi.service.CoreService;

@FeignClient(value = "core-service")
public interface CoreRemote extends CoreService {
}
