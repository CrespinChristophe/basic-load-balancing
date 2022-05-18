package be.technifutur.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GatewayController {

    private final RestTemplate restTemplate;

    public GatewayController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/print")
    public String fromPrintService(){

        return restTemplate.getForObject("http://print-service/print", String.class);

    }

    @GetMapping("/texte")
    public String fromTexteService(){

        return restTemplate.getForObject("http://texte-service/print", String.class);

    }


}
