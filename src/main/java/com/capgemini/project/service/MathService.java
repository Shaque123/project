package com.capgemini.project.service;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.capgemini.project.exceptions.DataValidationException;
import com.capgemini.project.model.InputData;
import com.capgemini.project.model.ResultData;

/**
*
* Service class responsible for performing mathematical calculation
*
*/
/**
 * @author SHaque
 *
 */
@Service
public class MathService
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    /** The method computes the square root of the sum of squares of the 3 highest numeric inputs
     * @param inputData contains array of integer
     * @return ResultData containing the result of the calculation
     */
    public ResultData performCalculation(InputData inputData)
    {
        if(inputData == null)
            throw new DataValidationException("Null input");
        int [] data = inputData.getInputData();

        if(data == null || data.length < 3)
        {
            return new ResultData("Invalid input size"); 
        }
           
        //sorts the list and take first three element and find sum of squares
        int sum = IntStream.of(data).sorted().skip(data.length -3 ).map(x -> x * x).sum(); 
        String result =df.format(Math.sqrt(sum));
        return new ResultData(result);
    }
}
