package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
   @RequestMapping("/home")
   public String home() {
	   System.out.println("going to home view..");
	   //throwing exception for testing 
//	   String s = null;
//	   s.length();
	   return "home";
   }
   
   @RequestMapping("/search")
   public RedirectView search(@RequestParam("querybox") String query) {
	   RedirectView redirectView = new RedirectView();
	   String url = "https://www.google.com/search?q="+query;
	   redirectView.setUrl(url);
	   return redirectView;
   }
   
   @RequestMapping("/user/{userId}/username/{username}")
   public String getUserDetail(@PathVariable("userId") int userId,@PathVariable("username") String username) {
	   System.out.println("UserId = "+userId);
	   System.out.println("username = "+username);
	   return "home";
   }
   
//   //Handling exceptions
//   @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//   @ExceptionHandler({NullPointerException.class})  //will run for NullPointerException exceptions
//   public String exceptionHandlerNull() {
//	   return "errorpage";
//   }
//   @ExceptionHandler(value = NumberFormatException.class)  //will run for NumberFormatException exceptions
//   public String exceptionHandlerNumber() {
//	   return "errorpage";
//   }
//   
//   // @ExceptionHandler({NullPointerException.class,NumberFormatException.class}) will run for mentioned exceptions
//   
//   //for all types of exceptions
//   @ExceptionHandler({Exception.class})  //will run for all exceptions
//   public String exceptionHandler() {
//	   return "errorpage";
//   }
}
