/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyftek.studentmanagement.entity;

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
public class Person {

    private String name;
    private int gender;
    private Date dob;
    private String address;

    public Person() {
    }

    public Person(String name, int gender, Date dob, String address) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
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
        System.out.println("- Input a name: ");
        this.name = scanner.nextLine();
        boolean check = false;
        do {
            System.out.println("- Input gender: ");
            String s_gender = scanner.nextLine();
            switch (s_gender) {
                case "male":
                case "Male":
                    this.gender = 1;
                    check = true;
                    break;
                case "female":
                case "Female":
                    this.gender = 0;
                    check = true;
                    break;
                case "other":
                case "Other":
                    this.gender = 2;
                    check = true;
                    break;
                default:
                    System.out.println("Invalid data. (\"" + s_gender + "\")");
            }
        } while (check != true);
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
        String s_gender;
        switch (this.gender) {
            case 1:
                s_gender = "Male";
                break;
            case 0:
                s_gender = "Female";
                break;
            default:
                s_gender = "Other";
                break;
        }
        String info = "Name: " + this.name + " | Gender: " + s_gender + " | Date of Birth: " + this.dob + " | Address: " + this.address;
        System.out.println(info);
    }
}
