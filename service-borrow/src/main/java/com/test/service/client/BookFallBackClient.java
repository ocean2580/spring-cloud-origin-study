package com.test.service.client;

import com.test.Book;
import org.springframework.stereotype.Component;

@Component
public class BookFallBackClient implements BookClient{
    @Override
    public Book findBookById(int bid) {
        return null;
    }
}
