package spring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController { 
	
	private StudentDAOImpl sd;
	
	public StudentDAOImpl getSd() {
		return sd;
	}

	public void setSd(StudentDAOImpl sd) {
		this.sd = sd;
	}

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homeHandler(Model model) {
		model.addAttribute("student", new Student());
		return "index";
	}

	@RequestMapping(value="/submitForm", method = RequestMethod.GET)
	public String formHandler(@ModelAttribute("student") Student student) {
		sd.insertStudent(student);
		return "redirect index";
	}

}
