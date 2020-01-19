/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyftek.personmanagement.entity;

import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public abstract class Boy extends Person {

    public Boy() {
    }
    
    @Override
    public void inputInfo(Scanner scanner){
        super.inputInfo(scanner);
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }

    @Override
    public void eat() {
        System.out.println("I like fish.");
    }

    @Override
    public String descript(String description) {
        return description;
    }
}
