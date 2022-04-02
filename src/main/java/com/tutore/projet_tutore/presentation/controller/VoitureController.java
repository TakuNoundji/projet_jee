package com.tutore.projet_tutore.presentation.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VoitureController {

    @GetMapping("/liste_voiture")
    public String listeVoiture(){

        return "listeVoiture";
    }


    @GetMapping("/inscription")
    public String inscription(){

        return "inscription";
    }

    @GetMapping("/ajoutvoiture")
    public String ajoutvoiture(){

        return "ajoutvoiture";
    }

    @GetMapping("/reserver")
    public String reserver(){

        return "reserver";
    }
    @GetMapping("/liste1")
    public String liste1(){

        return "liste1";
    }

    @GetMapping("/profil")
    public String profil(){

        return "profil";
    }

    @GetMapping("/reservations")
    public String reservations(){

        return "reservations";
    }
    @GetMapping("/connexion")
    public String connexion(){

        return "connexion";

    }

    @GetMapping("/detail")
    public String detail(){

        return "detail";
    }




}



