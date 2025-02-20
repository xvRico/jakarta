/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.error1jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;


@Named
@SessionScoped
public class Bean implements Serializable {
    
    protected int num;
    protected int den;
    private String result;
    
    public int  getNum(){
        return num;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public int  getDen(){
        return den;
    }
    
    public void setDen(int den){
        this.den = den;
    } 
    
    public String  getResult(){
        return result;
    }
    
    public void setResult(String result){
        this.result = result;
    }
    
    public String perform(){
        if(den==0){
            return "error";
        } else{
            result = String.valueOf((double) num/den);
            return "index";
        }
    }
}
