package com.projects.swagger_doc.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Tag(name = "Test Controller", description = "Test APIs")
public class TestController {

    @GetMapping("/say-hello")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/say-hello/{name}")
    public String sayHello2(@PathVariable String name){
        return "Hello " + name;
    }


}
