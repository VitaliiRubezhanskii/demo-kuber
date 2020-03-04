package com.example.demo.controller;

import com.example.demo.model.Apples;
import com.example.demo.service.ApplesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ApplesRepository applesRepository;

    @GetMapping(value = "/api/data")
    public ResponseEntity<List<Apples>> getApples(){
        return new ResponseEntity<>(applesRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public void saveApples(){
        Arrays.asList(new Apples("macintosh", 15), new Apples("antonovka", 17)).forEach(applesRepository::save);

    }
}
