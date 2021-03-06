package com.spring.applibrary.service.concrete;

import com.spring.applibrary.dal.BookRepository;
import com.spring.applibrary.model.Book;
import com.spring.applibrary.service.abstracts.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookManager implements BookService {

    private final BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteById(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findByKeyword(String keyword) {
        return bookRepository.findByKeyword(keyword);
    }

    @Override
    public Optional<Book> findById(int id) {
        return bookRepository.findById(id);
    }
    
    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }
}
