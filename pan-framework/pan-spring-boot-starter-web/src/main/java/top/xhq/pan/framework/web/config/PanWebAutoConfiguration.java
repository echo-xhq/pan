package top.xhq.pan.framework.web.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import top.xhq.pan.framework.web.handle.GlobalExceptionHandler;

@EnableFeignClients(basePackages = "top.*")
public class PanWebAutoConfiguration{

    @Bean
    public GlobalExceptionHandler globalExceptionHandler() {
        return new GlobalExceptionHandler();
    }
}
