package dev.wakandaacademy.produdoro.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.log4j.Log4j2;

@RestControllerAdvice
@Log4j2
public class RestResponseEntityExceptionHandler {
	public ResponseEntity<ErrorApiResponse> handlerGenericException(Exception ex){
		log.error("Exception: ",ex);
		
	}

}
