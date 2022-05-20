package be.technifutur.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "texte-service")
public interface TexteClient {

    // Envoie: GET http://teste-service/feign
    @GetMapping(path = "/feign")
    public String texte();

}
