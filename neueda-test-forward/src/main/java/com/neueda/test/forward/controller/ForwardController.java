package com.neueda.test.forward.controller;

import com.neueda.test.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ForwardController {

    @Autowired
    private UrlRepository urlRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView getUrl(@PathVariable("id") String id) {
        return new ModelAndView("redirect:" + urlRepository.get(id));
    }
}
