package com.example.Library.mapper;

import com.example.Library.dto.BorrowingDto;
import com.example.Library.model.Borrowing;
import org.modelmapper.ModelMapper;

public class BorrowingMapper {

    static ModelMapper mapper = new ModelMapper();

    public static Borrowing convertToEntity(BorrowingDto borrowingDto){
        return mapper.map(borrowingDto, Borrowing.class);
    }

    public static BorrowingDto convertToDto(Borrowing borrowing){
        return mapper.map(borrowing, BorrowingDto.class);
    }


}
