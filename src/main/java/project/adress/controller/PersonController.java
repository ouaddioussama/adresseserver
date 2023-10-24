package project.adress.controller;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.adress.model.Person;

@RestController
@RequestMapping("/person")
public class PersonController {


    @GetMapping(path = "/data",produces = "application/json")
    public ResponseEntity<Person> getAdresse(){

        Person person = Person.builder().name("oussama").firstname("ouaddi").build();

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(person);
    }


    @PostMapping(path = "/postperson",produces = "application/json")
    public ResponseEntity<Person> postPerson(@RequestBody Person person){

        System.out.printf("received data"+person);


        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(person);
    }



}
