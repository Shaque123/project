package com.capgimini.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.project.model.InputData;
import com.capgemini.project.service.MathService;
/**
*
* Controller class for capturing request
*
*/
@RestController
public class MathController
{
    
    private MathService mathService;
    @Autowired
    public MathController(MathService mathService)
    {        
        this.mathService = mathService;
    }
    @PostMapping("/calculate")
    double performCalculation(@RequestBody InputData inputData) 
    {
        double result = mathService.performCalculation(inputData);
        return result;
    }

}
