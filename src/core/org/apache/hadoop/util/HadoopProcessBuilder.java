package org.apache.hadoop.util;

import java.util.List;


/*
 * Implements the java.lang.ProcessBuilder API but allows
 * for a user defined Process Implementation
 */
public class HadoopProcessBuilder 
{
    private final ProcessBuilder delegate;
    
    public HadoopProcessBuilder(List<String> command)
    {
        delegate = new ProcessBuilder(command);
    }
    
    public HadoopProcessBuilder(String... command)
    {
        delegate = new ProcessBuilder(command);
    }
    
    public Process start()
    {
        return null;
        
    }
}
