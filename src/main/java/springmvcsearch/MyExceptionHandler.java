package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

//Centralized Exception Handler

@ControllerAdvice
public class MyExceptionHandler {
  
	  //Handling exceptions
	   @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	   @ExceptionHandler({NullPointerException.class})  //will run for NullPointerException exceptions
	   public String exceptionHandlerNull() {
		   return "errorpage";
	   }
	   @ExceptionHandler(value = NumberFormatException.class)  //will run for NumberFormatException exceptions
	   public String exceptionHandlerNumber() {
		   return "errorpage";
	   }
	   
	   // @ExceptionHandler({NullPointerException.class,NumberFormatException.class}) will run for mentioned exceptions
	   
	   //for all types of exceptions
	   @ExceptionHandler({Exception.class})  //will run for all exceptions
	   public String exceptionHandler() {
		   return "errorpage";
	   }
}
