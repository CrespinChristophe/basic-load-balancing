package be.technifutur.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/texte")
public class TextService1Controller {

    @GetMapping
    public String response(){
        return "communication reussie avec text-service1";
    }

}
