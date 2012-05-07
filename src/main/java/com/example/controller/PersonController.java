package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Person;
import com.example.service.PersonService;

import java.util.Map;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    public String listPeople(Map<String, Object> map) {

        map.put("person", new Person());
        map.put("peopleList", personService.findAll().iterator());

        return "people";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @Transactional
    public String addPerson(@ModelAttribute("person") Person person) {

        personService.save(person);

        return "redirect:/people/";
    }

    @RequestMapping("/delete/{personId}")
    @Transactional
    public String deletePerson(@PathVariable("personId") Long personId) {

        personService.delete(personId);

        return "redirect:/people/";
    }
}
