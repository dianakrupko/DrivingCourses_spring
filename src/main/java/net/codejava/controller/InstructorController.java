package net.codejava.controller;

import net.codejava.model.Category;
import net.codejava.model.Instructor;
import net.codejava.repository.CategoryRepository;
import net.codejava.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InstructorController {
    @Autowired
    private InstructorRepository instructorRepository;

    @GetMapping("/instructor")
    public String instructor(Model model){
        Iterable<Instructor> instructors=instructorRepository.findAll();
        model.addAttribute("instructor",instructors);
        return "instructor";
    }
}
