package project.adress.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AdresseController {


    @GetMapping(path = "/data",produces = "application/json")
    public String getAdresse(){
       return "this is my adresse from server" ;
    }


}
