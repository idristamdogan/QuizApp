package org.idrist.idristamdoganmaraton5.exception;

import lombok.Getter;

@Getter
public class SpringProjeException extends RuntimeException{
    private ErrorType errorType;

    public SpringProjeException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public SpringProjeException(ErrorType errorType, String customMessage) {
        super(customMessage);
        this.errorType = errorType;
    }
}