package com.example.Library.mapper;

import com.example.Library.dto.CopyDto;
import com.example.Library.model.Copy;
import org.modelmapper.ModelMapper;

public class CopyMapper {

    static ModelMapper mapper = new ModelMapper();

    public static Copy convertToEntity(CopyDto copyDto){
        return mapper.map(copyDto, Copy.class);
    }

    public static CopyDto convertToDto(Copy copy){
        return mapper.map(copy, CopyDto.class);
    }


}
