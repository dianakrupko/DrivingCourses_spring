package net.codejava.controller;

import net.codejava.model.Category;
import net.codejava.model.Student;
import net.codejava.repository.CategoryRepository;
import net.codejava.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/student")
    public String student(Model model){
        Iterable<Student> students=studentRepository.findAll();
        model.addAttribute("student",students);
        return "student";
    }
}

