package com.test.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/hello")
public class RequestMapperingController {

    @RequestMapping(
            value = {"/testRequestMapping", "/test"}
    )
    public String success() {
        return "success";
    }

    @RequestMapping(
            value = {"/test", "/testRequestMapping"},
            method = RequestMethod.GET
    )
    public String testRequstMappingMethod() {
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping() {
        return "success";
    }

    @RequestMapping(value = "/testPut", method = RequestMethod.PUT)
    public String testPut(){
        return "success";
    }

    @RequestMapping(
            value = "/testParamsAndHeaders",
            params = {"username", "password!=123456"},
            headers = {"Host=localhost:8081"}
    )
    public String testParamsAndHeaders() {
        return "success";
    }

    @RequestMapping(
            value = "/**/testAnt"
    )
    public String testAnt() {
        return "success";
    }

    @RequestMapping(
            value = "/testPath/{id}"
    )
    public String testPath(@PathVariable("id") Integer id) {
        System.out.println(id);
        return "success";
    }
}
