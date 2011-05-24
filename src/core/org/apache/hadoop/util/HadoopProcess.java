package org.apache.hadoop.util;

import java.io.InputStream;
import java.io.OutputStream;

import org.apache.log4j.Logger;

public class HadoopProcess extends Process
{
    private static final Logger logger = Logger.getLogger(HadoopProcess.class);
    
    
    
    
    public void destroy()
    {
        // TODO Auto-generated method stub

    }

    public int exitValue()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    public InputStream getErrorStream()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public InputStream getInputStream()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public OutputStream getOutputStream()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public int waitFor() throws InterruptedException
    {
        // TODO Auto-generated method stub
        return 0;
    }

}
