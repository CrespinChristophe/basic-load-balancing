package be.technifutur.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
public class TextService1Controller {

    @GetMapping
    public String response(){
        return "communication reussie de service1";
    }

}
