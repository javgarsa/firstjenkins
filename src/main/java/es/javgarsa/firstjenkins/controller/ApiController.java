package es.javgarsa.firstjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    int id;

    @GetMapping("/first")
    public void setId()
    {
        id=1;
    }
}
