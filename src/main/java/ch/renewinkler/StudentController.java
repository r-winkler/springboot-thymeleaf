package ch.renewinkler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @Autowired
    StudentManager studentManager;

    @RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
    public void saveStudent(@ModelAttribute Student student, BindingResult errors, Model model) {
        studentManager.add(student);
    }


}
