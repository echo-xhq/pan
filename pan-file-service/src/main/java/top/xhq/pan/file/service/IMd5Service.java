package top.xhq.pan.file.service;

import top.xhq.pan.request.base.RestAPIResultDTO;

public interface IMd5Service {
    /**
     * MD5校验数据处理
     *
     * @author: xhq
     * @date: 2021/11/1
     */
    RestAPIResultDTO<String> md5CheckHandle(String fid, String md5);
}
