package com.seungmoo.demospringdi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookServiceTest {

    // 스프링 DI는 어떻게 이루어 지는가??? (리플렉션)
    @Autowired BookService bookService;

    @Test
    void di() {
        Assertions.assertNotNull(bookService.bookRepository);
    }
}