package com.neueda.test.createurl.controller;

import com.neueda.test.createurl.service.CreateUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreateUrlController {

    @Autowired
    private CreateUrlService service;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String saveUrl(@RequestBody String url) {
        return service.save(url);
    }
}
