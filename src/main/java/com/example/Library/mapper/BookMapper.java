package com.example.Library.mapper;

import com.example.Library.dto.BookDto;
import com.example.Library.model.Book;
import org.modelmapper.ModelMapper;

public class BookMapper{

    static ModelMapper mapper = new ModelMapper();

    public static Book convertToEntity(BookDto bookDto){
        return mapper.map(bookDto, Book.class);
    }

    public static BookDto convertToDto(Book book){
        return mapper.map(book, BookDto.class);
    }


}
