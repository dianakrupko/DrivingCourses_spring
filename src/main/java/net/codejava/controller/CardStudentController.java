package net.codejava.controller;

import net.codejava.model.CardStudent;
import net.codejava.model.Category;
import net.codejava.repository.CardStudentRepository;
import net.codejava.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardStudentController {
    @Autowired
    private CardStudentRepository cardStudentRepository;

    @GetMapping("/cardstudent")
    public String cardstudent(Model model){
        Iterable<CardStudent> cardStudents=cardStudentRepository.findAll();
        model.addAttribute("cardstudent",cardStudents);
        return "cardStudent";
    }
}
