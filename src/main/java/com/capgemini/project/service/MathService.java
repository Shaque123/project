package com.capgemini.project.service;

import java.text.DecimalFormat;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.capgemini.project.model.InputData;

/**
*
* Service class responsible for performing mathematical calculation
*
*/
@Service
public class MathService
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public double performCalculation(InputData inputData)
    {
        int [] data = inputData.getInputData();
        if(data.length < 3)
            throw new MathematicalException("Length is less than three, cannot do calculation");
        //sorts the list and take first three element and find sum of squares
        int sum = Arrays.stream(data).sorted().limit(3).map(x -> x * x).sum();
        if(sum < 0 )
        {
            throw new MathematicalException("Cannot perform square root of 0");
        }
        double result = Double.valueOf(df.format(Math.sqrt(sum)));
        return result;
    }
}
