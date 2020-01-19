/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyftek.skyfzoo.entity;

import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class Animal {

    private String name;
    private int age;
    private String description;

    public Animal() {
    }

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void inputInfo(Scanner scanner) {
        scanner.nextLine();
        System.out.println("- Nhap vao ten loai dong vat: ");
        this.name = scanner.nextLine();
        System.out.println("- Nhap vao tuoi: ");
        this.age = scanner.nextInt();
        System.out.println("- Nhap vao mo ta: ");
        this.description = scanner.nextLine();
    }

    public void showInfo() {
        String info = "Ten dong vat: " + this.name + " | Tuoi: " + this.age + " | Mo ta: " + this.description;
        System.out.println(info);
    }
}
