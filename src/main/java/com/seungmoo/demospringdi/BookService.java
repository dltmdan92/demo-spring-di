package com.seungmoo.demospringdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    // 스프링의 DI는 어떻게 이루어 지는가?? (리플렉션)
    @Autowired
    BookRepository bookRepository;

}
