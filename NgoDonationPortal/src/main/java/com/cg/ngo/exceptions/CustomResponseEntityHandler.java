package com.cg.ngo.exceptions;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomResponseEntityHandler extends ResponseEntityExceptionHandler {
	
	// NEEDYPEOPLE MODULE//
	@ExceptionHandler
	public ResponseEntity<Object> handleDuplicateNeedyPersonException(DuplicateNeedyPersonException ex,WebRequest request){
		DuplicateNeedyPersonExceptionResponse duplicateNeedyPersonException=new DuplicateNeedyPersonExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object> (duplicateNeedyPersonException,HttpStatus.BAD_REQUEST);
	}
//	@ExceptionHandler
//	public ResponseEntity<Object> handleNoSuchNeedyPersonException(NoSuchNeedyPersonException ex,WebRequest request){
//		NoSuchNeedyPersonExceptionResponse NoSuchneedyPersonException=new NoSuchNeedyPersonExceptionResponse(ex.getMessage());
//		return new ResponseEntity<Object> (NoSuchneedyPersonException,HttpStatus.BAD_REQUEST);
//	}
	
	
	//ADMIN MODULE//
	@ExceptionHandler(NoSuchEmployeeException.class)
	public ResponseEntity<Object> handleNoSuchEmployeeException(NoSuchEmployeeException exception, WebRequest request){
		NoSuchEmployeeExceptionResponse noSuchEmployeeExceptionResponse = new NoSuchEmployeeExceptionResponse(LocalDate.now(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity<Object>(noSuchEmployeeExceptionResponse,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(DuplicateEmployeeException.class)
	public ResponseEntity<Object> handleDuplicateEmployeeException(DuplicateEmployeeException exception, WebRequest request){
		DuplicateEmployeeExceptionResponse duplicateEmployeeExceptionResponse =  new DuplicateEmployeeExceptionResponse(LocalDate.now(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity<Object>(duplicateEmployeeExceptionResponse,HttpStatus.BAD_REQUEST);
	}	
	@ExceptionHandler(DistributionIdNotFoundException.class)
	public ResponseEntity<Object> handleDistributionIdNotFoundException(DistributionIdNotFoundException exception, WebRequest request){
		DistributionIdNotFoundExceptionResponse distributionIdNotFoundExceptionResponse = new DistributionIdNotFoundExceptionResponse(LocalDate.now(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity<Object>(distributionIdNotFoundExceptionResponse,HttpStatus.NOT_FOUND);
	}
	
	//EMPLOYEE MODULE//
	@ExceptionHandler(NoSuchNeedyPersonException.class)
	public ResponseEntity<ErrorDetails> handleException(NoSuchNeedyPersonException exception, WebRequest request) {
		ErrorDetails details = new ErrorDetails(exception.getMessage(), LocalDate.now(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception exception, WebRequest request) {
		ErrorDetails details = new ErrorDetails(exception.getMessage(), LocalDate.now(), request.getDescription(false));
		return new ResponseEntity<Object>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
