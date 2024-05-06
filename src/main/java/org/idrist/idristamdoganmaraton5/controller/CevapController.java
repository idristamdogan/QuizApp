package org.idrist.idristamdoganmaraton5.controller;


import lombok.RequiredArgsConstructor;
import org.idrist.idristamdoganmaraton5.Dto.request.CevapSaveRequestDto;
import org.idrist.idristamdoganmaraton5.service.CevapService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.idrist.idristamdoganmaraton5.constant.EndPoints.*;

@RestController
@RequestMapping(ROOT + CEVAP)
@RequiredArgsConstructor
public class CevapController {

    private final CevapService cevapService;


    @PostMapping(SAVE)
    @CrossOrigin("*")
    public ResponseEntity<String> cevapSave(CevapSaveRequestDto dto, Long soruID) {
       return ResponseEntity.ok(cevapService.cevapSave(dto, soruID));
    }
}
