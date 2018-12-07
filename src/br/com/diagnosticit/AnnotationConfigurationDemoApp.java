/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author cristianoca
 */
public class AnnotationConfigurationDemoApp {

    public static void main( String[] args ){
        
        AnnotationConfigApplicationContext context = new 
            AnnotationConfigApplicationContext(SportConfig.class);
        
        Coach tenisCoach = context.getBean( "tennisCoach", TennisCoach.class );
        System.out.println(tenisCoach.getFortune());
        context.close();
                
    }
}
