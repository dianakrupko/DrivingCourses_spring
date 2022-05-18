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
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CoursesRepository coursesRepository;

    @GetMapping("/category")
    public String category(Model model){
        Iterable<Category> categories=categoryRepository.findAll();
        Iterable<Courses> courses =coursesRepository.findAll();
        model.addAttribute("courses",courses);
        model.addAttribute("category",categories);
        return "category";
    }
}
