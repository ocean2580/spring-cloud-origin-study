package com.test.service.client;

import com.test.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "userservice"    //声明为userservice服务的HTTP请求客户端
        , fallback = UserFallbackClient.class)  //fallback参数指定为我们刚刚编写的实现类

public interface UserClient {

    //路径保证和其他微服务提供的一致即可
    @GetMapping("/user/{uid}")
    User getUserById(@PathVariable("uid") int uid);  //参数和返回值也保持一致
}