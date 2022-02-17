package com.capgemini.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.project.model.InputData;
import com.capgemini.project.model.ResultData;
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
    /** This is controller method that handles post request to calculate the sqr root 
     * of the sum of squares of the 3 highest numeric inputs.
     * @param inputData Array of Integer as JSON array format
     * @return ResultData as JSON array format
     */
    @PostMapping("/calculate")
    public ResultData performCalculation(@RequestBody InputData inputData) 
    {
        return mathService.performCalculation(inputData);
       
    }

}
