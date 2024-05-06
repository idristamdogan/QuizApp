package org.idrist.idristamdoganmaraton5.Dto.response;

import java.util.List;

public record StatusuzSoruFindAllResponseDto(String soru, List<StatusuzCevapFindAllResponseDto>cevaplar) {
}
