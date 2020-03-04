package com.example.demo.controller;

import com.example.demo.model.Apples;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @GetMapping(value = "/api/data")
    public ResponseEntity<List<Apples>> getApples(){




        // TODO
        return new ResponseEntity<>( Arrays.asList(new Apples("macintosh", 15), new Apples("antonovkasas", 17)), HttpStatus.OK);
    }


}
