package com.Template.rest;

import com.Template.service.Template1Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/template1")
public class Template1RestController {
    private final Template1Service service;

    public Template1RestController(Template1Service service) {
        this.service = service;
    }

    @GetMapping("filterItem")
    public ResponseEntity<Object> getAllFilterItem(){
        try {
            var filterItem = service.filter();
            return ResponseEntity.status(HttpStatus.OK).body(filterItem);
        }catch (Exception exception){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("There is runtime error");
        }
    }
}
