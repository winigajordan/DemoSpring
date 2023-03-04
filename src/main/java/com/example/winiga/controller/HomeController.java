package com.example.winiga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {

        /**
         * On veut passer des informations du controller vers la vue
         * Spring MVC propose une classe Model
         * Toute information qui doit apparaitre dans une vue doit etre
         * ecrite dans le model avec la méthode de la classe Model
         * nommée addAttribute("pareamtre1",info)
         * Info represente le nom réel de l'information
         * parametre1 le nom de l'info sous lequel la vue récupère l'info
         * parametre1 peut avoir le meme nom que info ou pas
         */
        String libelle = "JEE";
        int vhor = 35;
        String responsable = "M. SONKO";
        model.addAttribute("libelle", libelle);
        model.addAttribute("volume", vhor);
        model.addAttribute("responsable", responsable);

        return "test";
    }
}
