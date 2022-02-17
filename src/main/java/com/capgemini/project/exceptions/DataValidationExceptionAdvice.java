package com.capgemini.project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DataValidationExceptionAdvice
{   
      @ResponseBody
      @ExceptionHandler(DataValidationException.class)
      @ResponseStatus(HttpStatus.BAD_REQUEST)
      String dataValidationErrorHandler(DataValidationException ex) 
      {
        return ex.getMessage();
      }
    
}
