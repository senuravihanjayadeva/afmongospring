package com.bandilasalmongo.demo.controller;

import com.bandilasalmongo.demo.model.Calculator;
import com.bandilasalmongo.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CalculatorController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/api/calculateprice")
    public Double getCalculatedPrice(@RequestBody Calculator calculator){

         return categoryService.getCalculatedPrice(calculator.getCategoryID()) * calculator.getDuration();

    }

}
