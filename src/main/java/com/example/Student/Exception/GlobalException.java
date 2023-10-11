package com.example.Student.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
@ExceptionHandler(AgeNotFoundException.class)
public ResponseEntity<Object>agehandle(AgeNotFoundException a){
	return new ResponseEntity<>(a.getMessage(),HttpStatus.NOT_FOUND);

	
}
}
