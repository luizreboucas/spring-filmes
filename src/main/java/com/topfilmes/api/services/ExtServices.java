package com.topfilmes.api.services;

import com.topfilmes.api.models.filme.FilmeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class ExtServices {
    @GetMapping("/filmes")
    public List<FilmeDTO> getExtFilmesList(){
        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<FilmeDTO[]> responseEntity = restTemplate.getForEntity(url, FilmeDTO[].class);
        FilmeDTO[] filmeArray = responseEntity.getBody();
        List<FilmeDTO> filmeList = Arrays.asList(filmeArray);
        return filmeList;
    }
}
