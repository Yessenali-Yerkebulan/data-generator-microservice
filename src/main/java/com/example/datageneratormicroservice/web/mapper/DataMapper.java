package com.example.datageneratormicroservice.web.mapper;

import com.example.datageneratormicroservice.model.Info;
import com.example.datageneratormicroservice.web.dto.InfoDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Info, InfoDto>{
}
