package com.gustavolopes.bookstoremanager.repository;

import com.gustavolopes.bookstoremanager.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
