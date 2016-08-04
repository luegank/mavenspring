package com.luegank.mavenspring;

import org.springframework.context.support.*;
import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext1.xml"); 
       appSpring obj = (appSpring) 	ac.getBean("bean1");
       obj.say();
       //System.out.println( "Hello World!" );
    }
    
    public int add(int a,int b){
    	return a+b;
    } 
    public void blank(){
    	
    }
}
