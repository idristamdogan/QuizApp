package org.idrist.idristamdoganmaraton5.mapper;

import org.idrist.idristamdoganmaraton5.Dto.request.CevapSaveRequestDto;

import org.idrist.idristamdoganmaraton5.Dto.response.CevapFindAllResponseDto;

import org.idrist.idristamdoganmaraton5.entity.Cevap;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CevapMapper {

    CevapMapper INSTANCE = Mappers.getMapper(CevapMapper.class);



    CevapFindAllResponseDto cevapFindAllResponseDto(Cevap cevap);
    Cevap cevapSaveRequestDtoToCevap(CevapSaveRequestDto cevapSaveRequestDto);
}
