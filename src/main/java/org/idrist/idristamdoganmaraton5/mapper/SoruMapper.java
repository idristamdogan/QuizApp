package org.idrist.idristamdoganmaraton5.mapper;

import org.idrist.idristamdoganmaraton5.Dto.request.SoruSaveRequestDto;
import org.idrist.idristamdoganmaraton5.Dto.response.SoruFindAllResponseDto;
import org.idrist.idristamdoganmaraton5.Dto.response.StatusuzSoruFindAllResponseDto;
import org.idrist.idristamdoganmaraton5.entity.Soru;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SoruMapper {
    SoruMapper INSTANCE = Mappers.getMapper(SoruMapper.class);

    Soru soruSaveRequestDtoToSoru(SoruSaveRequestDto soruSaveRequestDto);

    SoruFindAllResponseDto soruFindAllResponseDto(Soru soru);

    StatusuzSoruFindAllResponseDto statusuzSsoruFindAllResponseDto(Soru soru);


}
