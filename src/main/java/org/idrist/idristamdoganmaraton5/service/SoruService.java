package org.idrist.idristamdoganmaraton5.service;


import org.idrist.idristamdoganmaraton5.Dto.request.SoruSaveRequestDto;
import org.idrist.idristamdoganmaraton5.Dto.response.SoruFindAllResponseDto;
import org.idrist.idristamdoganmaraton5.Dto.response.StatusuzSoruFindAllResponseDto;
import org.idrist.idristamdoganmaraton5.entity.Soru;
import org.idrist.idristamdoganmaraton5.exception.ErrorType;
import org.idrist.idristamdoganmaraton5.exception.SpringProjeException;
import org.idrist.idristamdoganmaraton5.mapper.SoruMapper;
import org.idrist.idristamdoganmaraton5.repository.SoruRepository;
import org.idrist.idristamdoganmaraton5.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    // Bu metot bütün soruları doğru cevapları ile birlikde getirir.Cevapların altında statusu yani doğru yanlış yazar.
    public List<SoruFindAllResponseDto> soruFindAllResponseDtos(){
        List<SoruFindAllResponseDto> soruFindAllResponseDtos = new ArrayList<>();
        findAll().forEach(soru -> {
            soruFindAllResponseDtos.add(SoruMapper.INSTANCE.soruFindAllResponseDto(soru));

        });
        return soruFindAllResponseDtos;
    }
    // Bu metot bütün soruları statusuz getirir.
    public List<StatusuzSoruFindAllResponseDto> CevapsizSoruFindAllResponseDtos(){
        List<StatusuzSoruFindAllResponseDto> CevapsizSoruFindAllResponseDtos = new ArrayList<>();
        findAll().forEach(soru -> {
            CevapsizSoruFindAllResponseDtos.add(SoruMapper.INSTANCE.statusuzSsoruFindAllResponseDto(soru));

        });
      return CevapsizSoruFindAllResponseDtos;
    }


    public SoruFindAllResponseDto soruFindResponseDto(Long soruID){
        Optional<Soru> soru1 = findById(soruID);
        if(soru1.isEmpty()){
            throw new SpringProjeException(ErrorType.SORU_NOT_FOUND, "Boyle bir SORU bulunamadi.");
        }
        return SoruMapper.INSTANCE.soruFindAllResponseDto(soru1.get());
    }

}
