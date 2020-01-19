/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyftek.personmanagement.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author skyftek
 */
public abstract class Person {

    private String name;
    private Date dob;
    private String address;

    public Person() {
    }

    public Person(String name, Date dob, String address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo(Scanner scanner) {
        scanner.nextLine();
        System.out.println("- Input name: ");
        this.name = scanner.nextLine();
        System.out.println("- Input date of birth (dd/MM/yyyy): ");
        String s_dob = scanner.nextLine();
        try {
            this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(s_dob);
        } catch (ParseException ex) {
            System.err.println("Invalid data. (\"" + s_dob + "\")");
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("- Input address: ");
        this.address = scanner.nextLine();
    }

    public void showInfo() {
        String info = "Name: " + this.name + " | Date of birth: " + this.dob + " | Address: " + this.address;
        System.out.println(info);
    }

    public abstract void eat();

    public abstract String descript(String description);
}
