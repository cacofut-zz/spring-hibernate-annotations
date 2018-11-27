/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit;

import org.springframework.stereotype.Component;

/**
 *
 * @author cristiano
 */
@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Hoje é seu dia de sorte feliz";
    }


    
    
    
}
