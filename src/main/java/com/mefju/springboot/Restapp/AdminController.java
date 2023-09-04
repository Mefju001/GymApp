package com.mefju.springboot.Restapp;

import com.mefju.springboot.Entity.Karnet;
import com.mefju.springboot.Entity.User;
import com.mefju.springboot.JpaRepo.KarnetJPA;
import com.mefju.springboot.JpaRepo.UserJPA;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class AdminController {
    private final KarnetJPA karnetJPA;

    private final UserJPA userJPA;

    public AdminController(KarnetJPA karnetJPA1, UserJPA userJPA) {
        karnetJPA = karnetJPA1;
        this.userJPA = userJPA;
    }
    @GetMapping("/MenuAdmin")
    public String Menu()
    {
        return "index-Admin";
    }

    @GetMapping("/ShowAdmin")
    public String listKarnet(Model theModel)
    {
        List<Karnet> theKarnet = karnetJPA.findAll();
        theModel.addAttribute("Karnet",theKarnet);
        return "List-Karnet-Admin";
    }
    @GetMapping("/ShowUser")
    public String listUser(Model theModel)
    {
        List<User> user = userJPA.findAll();
        theModel.addAttribute("User",user);
        return "List-User";
    }
    @GetMapping("/ShowFormForAdd")
    public String ShowFormForAdd(Model theModel)
    {
        Karnet theKarnet = new Karnet();
        theModel.addAttribute("karnet",theKarnet);
        return "Formularz";
    }
    @PostMapping("/save")
    public String addKarnet(@ModelAttribute("Karnet") Karnet karnet)
    {
        karnetJPA.save(karnet);
        return "redirect:/ShowAdmin";
    }
    @GetMapping("/ShowFormForUpdate")
    public String addKarnet(@RequestParam("id") int id, Model theModel)
    {
        Optional<Karnet> karnet = karnetJPA.findById(id);
        theModel.addAttribute("karnet",karnet);
        return "Formularz";
    }
    @GetMapping("/Delete")
    public String Delete(@RequestParam("id") int id)
    {
        karnetJPA.deleteById(id);
        return "redirect:/ShowAdmin";
    }
}
