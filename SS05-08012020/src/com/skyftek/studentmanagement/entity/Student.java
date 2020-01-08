/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyftek.studentmanagement.entity;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class Student extends Person {

    private int id = 0;
    private float mark_avg;
    private String email;

    public Student() {
    }

    public Student(int id, float mark_avg, String email) {
        this.id = id;
        this.mark_avg = mark_avg;
        this.email = email;
    }

    public Student(int id, float mark_avg, String email, String name, int gender, Date dob, String address) {
        super(name, gender, dob, address);
        this.id = id;
        this.mark_avg = mark_avg;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMark_avg() {
        return mark_avg;
    }

    public void setMark_avg(float mark_avg) {
        this.mark_avg = mark_avg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo(Scanner scanner) {
        super.inputInfo(scanner);
        id++;
        System.out.println("- Input mark average: ");
        this.mark_avg = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("- Input email: ");
        this.email = scanner.nextLine();
    }

    @Override
    public void showInfo() {
        System.out.print("ID: " + this.id + " | ");
        super.showInfo();
        System.out.println("Mark average: " + this.mark_avg + " | Email: " + this.email);
        if (mark_avg <= 5) {
            System.out.println("Ranked: D");
        } else if (7 >= mark_avg && mark_avg > 5) {
            System.out.println("Ranked: C");
        } else if (9 >= mark_avg && mark_avg > 7) {
            System.out.println("Ranked: B");
        } else if (mark_avg > 9) {
            System.out.println("Ranked: A");
        }
    }
}
