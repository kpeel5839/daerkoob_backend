package com.project.daerkoob.controller;

import com.project.daerkoob.domain.Book;
import com.project.daerkoob.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("findBook")
    public List<Book> findBook(String title ,String display) throws Exception {
        List<Book> bookList = bookService.returnBook(title , display);
        for(Book book : bookList){
            bookService.save(book);
        } //일단 조회하면 저장하는 기능은 구현
        return bookList;
    }
}
