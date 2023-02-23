package top.xhq.pan.exception;

import top.xhq.pan.enums.ResultCodeEnum;
import top.xhq.pan.request.base.RestAPIResultDTO;

/**
 * 自定义异常
 *
 * @author: xhq
 * @date: 2021/11/13
 */
public class CustomException extends RuntimeException {
    protected RestAPIResultDTO restAPIResultDTO;

    public CustomException() {
        super();
    }

    public CustomException(int code, String message) {
        this.restAPIResultDTO = RestAPIResultDTO.Error(message, code);
    }

    public CustomException(ResultCodeEnum resultCodeEnum) {
        this.restAPIResultDTO = RestAPIResultDTO.Error(resultCodeEnum.getDesc(), resultCodeEnum);
    }

    public CustomException(String message) {
        this.restAPIResultDTO = RestAPIResultDTO.Error(message);
    }

    public RestAPIResultDTO getRestAPIResult() {
        return restAPIResultDTO;
    }

    public void setHttpResultDTO(RestAPIResultDTO restAPIResultDTO) {
        this.restAPIResultDTO = restAPIResultDTO;
    }
}
