package be.technifutur.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/print")
public class PrintServiceController {

    private final DiscoveryClient discoveryClient;
    private final RestTemplate restTemplate;

    public PrintServiceController(DiscoveryClient discoveryClient, RestTemplate restTemplate) {
        this.discoveryClient = discoveryClient;
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public String getPrint(){

        String responseBody = restTemplate.getForObject("http://texte-service/texte", String.class);

        return "Get to texte-service\n response ==> " + responseBody;

    }

}
