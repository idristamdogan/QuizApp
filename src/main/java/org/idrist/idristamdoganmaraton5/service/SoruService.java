package org.idrist.idristamdoganmaraton5.service;


import org.idrist.idristamdoganmaraton5.Dto.request.SoruSaveRequestDto;
import org.idrist.idristamdoganmaraton5.Dto.response.SoruFindAllResponseDto;
import org.idrist.idristamdoganmaraton5.entity.Soru;
import org.idrist.idristamdoganmaraton5.mapper.SoruMapper;
import org.idrist.idristamdoganmaraton5.repository.SoruRepository;
import org.idrist.idristamdoganmaraton5.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SoruService extends ServiceManager<Soru, Long> {
    private final SoruRepository soruRepository;

    public SoruService(SoruRepository soruRepository) {
        super(soruRepository);
        this.soruRepository = soruRepository;
    }

    public void soruSaveDto(SoruSaveRequestDto soruSaveRequestDto){
        soruRepository.save(SoruMapper.INSTANCE.soruSaveRequestDtoToSoru(soruSaveRequestDto));
    }

    public List<SoruFindAllResponseDto> soruFindAllResponseDtos(){
        List<SoruFindAllResponseDto> soruFindAllResponseDtos = new ArrayList<>();
        findAll().forEach(soru -> {
            soruFindAllResponseDtos.add(SoruMapper.INSTANCE.soruFindAllResponseDto(soru));

        });
        return soruFindAllResponseDtos;
    }
}
