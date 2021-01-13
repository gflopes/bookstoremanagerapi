package com.gustavolopes.bookstoremanager.mapper;

import com.gustavolopes.bookstoremanager.dto.BookDTO;
import com.gustavolopes.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class BookMapper {

    public static final BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    public abstract Book toModel(BookDTO bookDTO);

    public abstract BookDTO toDTO(Book book);

}
