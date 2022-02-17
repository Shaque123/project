package com.capgemini.project.service;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.project.exceptions.DataValidationException;
import com.capgemini.project.model.InputData;
import com.capgemini.project.model.ResultData;

public class MathServiceTest
{
    MathService service = new MathService();
    InputData data;
    
    @Before
    public void inintialiseInputData()
    {
         data = new InputData();
    }
   
    @Test
    public void testInvalidInput()
    {
        int [] input = {1,2};
        data.setInputData(input);
        ResultData resultData = this.service.performCalculation(data);
        
        assertEquals("Invalid input size",resultData.getResultData());
    }
    @Test( expected = DataValidationException.class )
    public void testNullRequestData() {
        service.performCalculation(null);
    }
    @Test
    public void testPerformCalculation()
    {
        int [] input = {1,2,3,4};
        data.setInputData(input);
        ResultData resultData = service.performCalculation(data);
        assertEquals("5.39",resultData.getResultData());
    }
    
}
