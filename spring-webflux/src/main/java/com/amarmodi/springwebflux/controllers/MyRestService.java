package com.amarmodi.springwebflux.controllers;

import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyRestService {

    @GetMapping(value="/my-resources", produces="application/json")
    List<Resource> listResources(){
        return null;
    }
}
