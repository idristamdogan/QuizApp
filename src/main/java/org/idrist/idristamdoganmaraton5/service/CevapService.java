package org.idrist.idristamdoganmaraton5.service;

import org.idrist.idristamdoganmaraton5.Dto.request.CevapSaveRequestDto;
import org.idrist.idristamdoganmaraton5.constant.Status;
import org.idrist.idristamdoganmaraton5.entity.Cevap;
import org.idrist.idristamdoganmaraton5.entity.Soru;
import org.idrist.idristamdoganmaraton5.exception.ErrorType;
import org.idrist.idristamdoganmaraton5.exception.SpringProjeException;
import org.idrist.idristamdoganmaraton5.mapper.CevapMapper;
import org.idrist.idristamdoganmaraton5.repository.CevapRepository;
import org.idrist.idristamdoganmaraton5.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.idrist.idristamdoganmaraton5.constant.Status.FALSE;
import static org.idrist.idristamdoganmaraton5.constant.Status.TRUE;

@Service
public class CevapService extends ServiceManager <Cevap, Long> {
    private final CevapRepository cevapRepository;
    private final SoruService soruService;

    public CevapService(CevapRepository cevapRepository, SoruService soruService) {
        super(cevapRepository);
        this.cevapRepository = cevapRepository;
        this.soruService = soruService;
    }

    public String cevapSave(CevapSaveRequestDto dto, Long soruID){
        Optional<Soru> soru1 = soruService.findById(soruID);


        if(soru1.isEmpty()){
            throw new SpringProjeException(ErrorType.SORU_NOT_FOUND, "Boyle bir SORU bulunamadi.");
        }

                String  cevap1=dto.cevap();

                Status status=dto.status();
                Cevap cevap=Cevap.builder().cevap(cevap1).status(status).soru(soru1.get()).build();

                cevapRepository.save(cevap);



        return "Kayit Basarili";
    }




}
