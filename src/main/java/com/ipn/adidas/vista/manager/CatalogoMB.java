package com.ipn.adidas.vista.manager;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dml
 */
@ManagedBean
@SessionScoped
public class CatalogoMB implements Serializable
{
    private static final long serialVersionUID = 1L;
	
    private String name;
    
    private String sayWelcome;
    
    @PostConstruct
    public void init(){
        System.out.println("Post Constructor");
    }
    
    public String getSayWelcome(){
        //check if null?
        if("".equals(name) || name == null ){
             return "";
        }else{
             return "Ajax message : Welcome " + name;
        }
    }

    public void setSayWelcome(String sayWelcome) {
        this.sayWelcome = sayWelcome;
    }

    public String getName() {
            return name;
    }
    public void setName(String name) {
            this.name = name;
    }
}

