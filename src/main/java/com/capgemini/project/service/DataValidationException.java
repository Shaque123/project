package com.capgemini.project.service;

/** Custom exception to handle data validation related exception
 * @author SHaque
 *
 */
public class DataValidationException extends RuntimeException
{
    DataValidationException(String message)
    {
        super(message);
    }
}
