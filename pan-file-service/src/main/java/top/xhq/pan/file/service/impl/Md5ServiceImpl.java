package top.xhq.pan.file.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.xhq.pan.constant.RedisConstants;
import top.xhq.pan.file.dao.FileDao;
import top.xhq.pan.file.service.IMd5Service;
import top.xhq.pan.framework.redis.core.utils.RedisUtil;
import top.xhq.pan.request.base.RestAPIResultDTO;

import java.util.concurrent.TimeUnit;

@Service
public class Md5ServiceImpl implements IMd5Service {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private FileDao fileDao;

    @Override
    public RestAPIResultDTO<String> md5CheckHandle(String fid, String md5) {
        redisUtil.setEx(String.format(RedisConstants.FILE_MD5, fid), md5, 259200, TimeUnit.SECONDS);
        Integer count = fileDao.checkMd5Whether(md5);
        if (count > 0) {
            return RestAPIResultDTO.Success("成功");
        } else {
            return RestAPIResultDTO.Error("失败");
        }
    }
}
