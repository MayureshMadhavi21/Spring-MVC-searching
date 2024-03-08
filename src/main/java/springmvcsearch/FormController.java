package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcmodel.Student;

@Controller
public class FormController {
   
	@RequestMapping("/form")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping(path="/handleForm",method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student, BindingResult result) {
		if(result.hasErrors()) {
		   return "form";
		}
		System.out.println(student);
		return "success";
	}
	
}
