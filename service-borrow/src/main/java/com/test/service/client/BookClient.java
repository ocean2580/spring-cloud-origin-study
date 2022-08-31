package com.test.service.client;

import com.test.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("bookservice")
public interface BookClient {

    // 对应的 controller 方法
    @GetMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid);
}
