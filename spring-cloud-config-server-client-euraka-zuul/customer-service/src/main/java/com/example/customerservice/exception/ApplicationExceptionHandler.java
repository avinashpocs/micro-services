 package com.example.customerservice.exception;



import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<AppilcationError> handleInvalidData(UserNotFoundException ex,WebRequest webReq){
		
		AppilcationError errors = new AppilcationError(ex.getMessage(),new Date(),webReq.getDescription(false));
		
		return new ResponseEntity<AppilcationError>(errors, HttpStatus.NOT_FOUND);
	}
}