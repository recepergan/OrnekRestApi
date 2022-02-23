package com.rcpergan.demo.controller;

import com.rcpergan.demo.dto.request.DoLoginDtoRequest;
import com.rcpergan.demo.repository.entity.Person;
import com.rcpergan.demo.service.PersonService;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    //http:localhost:8080/person/merhaba
    @GetMapping("/merhaba")
    public ResponseEntity<String> Merhaba() {

        return ResponseEntity.ok("İlk Spring REST Apisi");
    }


    //http:localhost:8080/person/save
    @PostMapping("/save")
    public ResponseEntity<Void> save(String name,String tckimlik) {
        personService.save(Person.builder()
                .tckimlik(tckimlik)
                .name(name)
                .build());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Person>> findall() {
        return ResponseEntity.ok(personService.findAll());
    }




}
