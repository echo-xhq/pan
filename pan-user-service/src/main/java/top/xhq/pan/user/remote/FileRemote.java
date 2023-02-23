package top.xhq.pan.user.remote;

import org.springframework.cloud.openfeign.FeignClient;
import top.xhq.pan.serviceapi.service.FileService;

/**
 * 文件调用API
 *
 * @author: xhq
 * @date: 2019/9/26
 */
@FeignClient(value = "file-service")
public interface FileRemote extends FileService {
}
