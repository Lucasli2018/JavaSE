package com.lucas.maven.helloMaven;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *
 */
public class Greeting 
{
    public static void print(String name)
    {
    	Log log=LogFactory.getLog(Greeting.class);
    	log.info("Hello ,"+name+"!");
    }
    int sum(int ...ns){
    	int x=0;
    	for (int i : ns) {
			x+=i;
		}
    	return x;
    }
}
