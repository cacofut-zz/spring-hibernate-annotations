/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author cristianoca
 */
public class AnnotationDemoApp {

    public static void main( String[] args ){
        
        ClassPathXmlApplicationContext context = new 
            ClassPathXmlApplicationContext("applicationContext.xml");
        
        Coach tenisCoach = context.getBean( "tennisCoach", TennisCoach.class );
        System.out.println(tenisCoach.getFortune());
        context.close();
                
    }
}
