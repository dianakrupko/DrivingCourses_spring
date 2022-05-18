package net.codejava.controller;

import net.codejava.model.Category;
import net.codejava.model.Courses;
import net.codejava.repository.CategoryRepository;
import net.codejava.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoursesController {
    @Autowired
    private CoursesRepository coursesRepository;

    @GetMapping("/courses")
    public String courses(Model model){
        Iterable<Courses> courses=coursesRepository.findAll();
        model.addAttribute("category",courses);
        return "courses";
    }
}
