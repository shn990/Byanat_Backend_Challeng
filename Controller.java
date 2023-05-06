package com.challenge.challenge;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class Controller {
    @GetMapping(value = "/towers")
    public List<Object> getTowers(){
        String url = "https://byanat.wiremockapi.cloud/api/v1/towers";
        RestTemplate restTemplate = new RestTemplate();

        Object[] towers = restTemplate.getForObject(url, Object[].class);

        return Arrays.asList(towers);
    }
    
}
