/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evenodd;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class oddEvenBean implements Serializable {
    
    private int value;
    private boolean entered = false;

    public int getValue() {
        return value;
    }

    public boolean getEntered() {
        return entered;
    }

    public void setEntered(boolean entered) {
        this.entered = entered;

    }

    public void setValue(int value) {

        this.value = value;
    }
    
    public String redirect() {
        
        entered = true; 
        
        if (value % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
        
        
    }
}
