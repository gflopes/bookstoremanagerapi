package com.gustavolopes.bookstoremanager.service;

import com.gustavolopes.bookstoremanager.dto.BookDTO;
import com.gustavolopes.bookstoremanager.dto.MessageResponseDTO;
import com.gustavolopes.bookstoremanager.entity.Book;
import com.gustavolopes.bookstoremanager.mapper.BookMapper;
import com.gustavolopes.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {
        Book savedBook = bookRepository.save(BookMapper.INSTANCE.toModel(bookDTO));
        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();
    }
}
