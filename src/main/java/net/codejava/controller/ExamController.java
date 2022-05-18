package net.codejava.controller;

import net.codejava.model.Category;
import net.codejava.model.Exam;
import net.codejava.repository.CategoryRepository;
import net.codejava.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExamController {
    @Autowired
    private ExamRepository examRepository;

    @GetMapping("/exam")
    public String exam(Model model){
        Iterable<Exam> exams=examRepository.findAll();
        model.addAttribute("exam" ,exams);
        return "exam";
    }
}
