package com.capgemini.project.exceptions;

/** Custom exception to handle data validation related exception
 * @author SHaque
 *
 */
public class DataValidationException extends RuntimeException
{
    public DataValidationException(String message)
    {
        super(message);
    }
}
