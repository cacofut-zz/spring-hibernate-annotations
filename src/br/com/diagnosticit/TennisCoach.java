/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

/**
 *
 * @author cristiano
 */
@Component
public class TennisCoach implements Coach{
    
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("constructor TennisCoach");
    }   
  
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
        
    @Override
    public String getDailyWork() {
        return "Treinar muitas raquetadas";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("método setter TennisCoach");
    }
    
    public void initTennisCoach(){
        System.out.println("Iniciando Bean " + this.getClass().getName());
    }
    
    public void destroyTennisCoach(){
        System.out.println("Destruindo Bean " + this.getClass().getName());
    }
    
}
