package org.idrist.idristamdoganmaraton5.controller;

import lombok.RequiredArgsConstructor;
import org.idrist.idristamdoganmaraton5.Dto.request.SoruSaveRequestDto;
import org.idrist.idristamdoganmaraton5.Dto.response.SoruFindAllResponseDto;
import org.idrist.idristamdoganmaraton5.service.SoruService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.idrist.idristamdoganmaraton5.constant.EndPoints.*;
import static org.idrist.idristamdoganmaraton5.constant.Status.*;

@RestController
@RequestMapping(ROOT + SORU)
@RequiredArgsConstructor
public class SoruController {
    private final SoruService soruService;

    @PostMapping(SAVE)
    @CrossOrigin("*")
    public ResponseEntity<String> soruSaveDto(SoruSaveRequestDto dto){
        soruService.soruSaveDto(dto);
        return ResponseEntity.ok("Kayit Basarili");
    }
    @GetMapping(FINDALL)
    @CrossOrigin("*")
    public ResponseEntity<List<SoruFindAllResponseDto>> soruFindAllResponseDtos(){
        return ResponseEntity.ok(soruService.soruFindAllResponseDtos());
    }



}
