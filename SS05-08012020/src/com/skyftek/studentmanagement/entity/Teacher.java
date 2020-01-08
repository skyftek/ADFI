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
public class Teacher extends Person {

    private String m_class;
    private int m_sph; // salary per hour
    private float m_hours;

    public Teacher() {
    }

    public Teacher(String m_class, int m_sph, float m_hours) {
        this.m_class = m_class;
        this.m_sph = m_sph;
        this.m_hours = m_hours;
    }

    public Teacher(String m_class, int m_sph, float m_hours, String name, int gender, Date dob, String address) {
        super(name, gender, dob, address);
        this.m_class = m_class;
        this.m_sph = m_sph;
        this.m_hours = m_hours;
    }

    public String getM_class() {
        return m_class;
    }

    public void setM_class(String m_class) {
        this.m_class = m_class;
    }

    public int getM_sph() {
        return m_sph;
    }

    public void setM_sph(int m_sph) {
        this.m_sph = m_sph;
    }

    public float getM_hours() {
        return m_hours;
    }

    public void setM_hours(float m_hours) {
        this.m_hours = m_hours;
    }

    @Override
    public void inputInfo(Scanner scanner) {
        super.inputInfo(scanner);
        System.out.println("- Input Class teaches: ");
        this.m_class = scanner.nextLine();
        System.out.println("- Input Salary per hour: ");
        this.m_sph = scanner.nextInt();
        System.out.println("- Input Total teaching hours: ");
        this.m_hours = scanner.nextFloat();
    }

    @Override
    public void showInfo() {
        float salary;
        String scan = this.m_class.substring(0, 1);
        switch (scan) {
            case "T":
            case "V":
            case "A":
                salary = (m_sph + 50000) * m_hours;
                break;
            case "L":
            case "H":
            case "S":
                salary = (m_sph - 20000) * m_hours;
                break;
            default:
                salary = m_sph * m_hours;
                break;
        }
        super.showInfo();
        System.out.println("Class teaches: " + this.m_class + " | Total teaching hours: " + this.m_hours);
        System.out.println("Salary: " + salary);
        System.out.println("(Salary per hour: " + this.m_sph + ")");
    }
}
