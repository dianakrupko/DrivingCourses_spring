package net.codejava.controller;

import net.codejava.model.Category;
import net.codejava.model.Transport;
import net.codejava.repository.CategoryRepository;
import net.codejava.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransportController {

    @Autowired
    private TransportRepository transportRepository;

    @GetMapping("/transport")
    public String category(Model model){
        Iterable<Transport> transports=transportRepository.findAll();
        model.addAttribute("transport",transports);
        return "transport";
    }
}

