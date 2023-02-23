package top.xhq.pan.serviceapi.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import top.xhq.pan.request.base.RestAPIResultDTO;

import java.io.IOException;

public interface FileService {
    @RequestMapping(value = "upload", method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    RestAPIResultDTO<String> upload(@RequestPart MultipartFile file) throws IOException;
}
