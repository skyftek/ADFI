/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyftek.personmanagement.entity;

/**
 *
 * @author skyftek
 */
public abstract class Girl extends Person {

    public Girl() {
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }

    @Override
    public void eat() {
        System.out.println("I like meat.");
    }

    @Override
    public String descript(String description) {
        return description;
    }
}
