package com.mefju.springboot.Restapp;

import com.mefju.springboot.Entity.Karnet;
import com.mefju.springboot.JpaRepo.KarnetJPA;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class UserController
{
    private final KarnetJPA karnetJPA;

    public UserController(KarnetJPA karnetJPA1) {
        karnetJPA = karnetJPA1;
    }

    @GetMapping("/Show")
    public String listKarnet(Model theModel)
    {
        List<Karnet> theKarnet = karnetJPA.findAll();
        theModel.addAttribute("Karnet",theKarnet);
        return "List-Karnet";
    }
    @GetMapping("/Menu")
    public String Menu()
    {
        return "index";
    }

    @GetMapping("/")
    public String MenuAnony()
    {
        return "indexanonymous";
    }
}
