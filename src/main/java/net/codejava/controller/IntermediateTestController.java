package net.codejava.controller;

import net.codejava.model.Instructor;
import net.codejava.model.IntermediateTest;
import net.codejava.repository.InstructorRepository;
import net.codejava.repository.IntermediateTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntermediateTestController {

    @Autowired
    private IntermediateTestRepository intermediateTestRepository;

    @GetMapping("/intermediateTest")
    public String intermediateTest(Model model){
        Iterable<IntermediateTest> intermediateTests=intermediateTestRepository.findAll();
        model.addAttribute("intermediateTest",intermediateTests);
        return "intermediateTest";
    }
}
