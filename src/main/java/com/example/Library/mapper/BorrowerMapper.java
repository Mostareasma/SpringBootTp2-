package com.example.Library.mapper;

import com.example.Library.dto.BorrowerDto;
import com.example.Library.model.Borrower;
import org.modelmapper.ModelMapper;

public class BorrowerMapper {

    static ModelMapper mapper = new ModelMapper();

    public static Borrower convertToEntity(BorrowerDto borrowerDto){
        return mapper.map(borrowerDto, Borrower.class);
    }

    public static BorrowerDto convertToDto(Borrower borrower){
        return mapper.map(borrower, BorrowerDto.class);
    }


}
