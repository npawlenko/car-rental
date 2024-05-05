package com.example.carrental.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.SERVER)
public class ServerRuntimeException extends RuntimeException {
    public ServerRuntimeException() {
    }

    public ServerRuntimeException(String message) {
        super(message);
    }

    public ServerRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServerRuntimeException(Throwable cause) {
        super(cause);
    }

    public ServerRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
