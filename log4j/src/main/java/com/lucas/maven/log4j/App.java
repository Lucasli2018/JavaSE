package com.lucas.maven.log4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Log log=LogFactory.getLog(App.class);
    	log.info("终于可以写日志啦~");
    }
}
