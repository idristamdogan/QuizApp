package org.idrist.idristamdoganmaraton5.Dto.response;

import org.idrist.idristamdoganmaraton5.entity.Cevap;

import java.util.List;

public record SoruFindAllResponseDto (String soru,List<CevapFindAllResponseDto>cevaplar) {
}
