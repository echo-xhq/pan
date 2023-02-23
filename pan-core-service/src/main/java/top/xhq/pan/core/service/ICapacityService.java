package top.xhq.pan.core.service;

import top.xhq.pan.request.base.RestAPIResultDTO;

/**
 * 容量接口
 *
 * @author: xhq
 * @date: 2021/10/29
 */
public interface ICapacityService {
    /**
     * 容量查询数据处理
     *
     * @author: xhq
     * @date: 2019/9/24
     */
    RestAPIResultDTO<String> useCapacityHandle(String uid);

    /**
     * 初始化容量数据处理
     *
     * @author: xhq
     * @date: 2019/9/25
     */
    RestAPIResultDTO<Integer> initCapacityHandle(String uid);
}
