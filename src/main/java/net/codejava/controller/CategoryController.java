package net.codejava.controller;

import net.codejava.model.Category;
import net.codejava.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/category")
    public String category(Model model){
        Iterable<Category> categories=categoryRepository.findAll();
        model.addAttribute("category",categories);
        return "category";
    }
}
