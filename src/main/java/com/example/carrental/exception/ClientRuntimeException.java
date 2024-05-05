package com.example.carrental.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CLIENT)
public class ClientRuntimeException extends RuntimeException {

    public ClientRuntimeException() {
    }

    public ClientRuntimeException(String message) {
        super(message);
    }

    public ClientRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClientRuntimeException(Throwable cause) {
        super(cause);
    }

    public ClientRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
