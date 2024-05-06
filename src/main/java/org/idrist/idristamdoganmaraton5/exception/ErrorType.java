package org.idrist.idristamdoganmaraton5.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorType {
    SORU_NOT_FOUND(5001,"Boyle bir SORU bulunamadi. ", HttpStatus.NOT_FOUND),


    WRONG_STATUS_TYPE(5004,"Böyle bir statu bulunamadı", HttpStatus.UNAUTHORIZED),

    SORU_OR_POST_NOT_FOUND(5006,"Soru or Post not found", HttpStatus.NOT_FOUND);

    private Integer code;
    private String message;
    private HttpStatus httpStatus;
}