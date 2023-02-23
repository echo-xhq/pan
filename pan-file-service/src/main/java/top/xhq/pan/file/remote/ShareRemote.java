package top.xhq.pan.file.remote;

import org.springframework.cloud.openfeign.FeignClient;
import top.xhq.pan.serviceapi.service.ShareService;

@FeignClient(value = "share-service")
public interface ShareRemote extends ShareService {
}
