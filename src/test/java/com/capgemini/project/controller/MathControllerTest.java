package com.capgemini.project.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.runners.MockitoJUnitRunner;

import com.capgemini.project.model.InputData;
import com.capgemini.project.model.ResultData;
import com.capgemini.project.service.MathService;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class MathControllerTest
{
    
    @Mock MathService mathService;
      
    @Mock ResultData resultData;
    
    @InjectMocks
    MathController mathController;

    @Test
    public void performCalculation()
    {
        
         
        int input[] = { 1,2,3,4 };
        InputData data = new InputData();
        data.setInputData(input);
        
        Mockito.when(mathService.performCalculation(data)).thenReturn(resultData);
        assertEquals(resultData, mathController.performCalculation(data)); 
    }
}
