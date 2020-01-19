package com.skyftek.entity;

import java.util.Scanner;

public abstract class Animal {
    private String name;
    private int age;
    private String description;

    public void inputInfo(Scanner scanner){
        scanner.nextLine();
        System.out.println("- Nhap vao ten dong vat:");
        this.name = scanner.nextLine();
        System.out.println("- Nhap vao tuoi:");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("- Nhap mo ta:");
        this.description = scanner.nextLine();
    }

    public void showInfo(){
        String info = "Animal {Ten: " + this.name + ", Tuoi: " + this.age + ", Mo ta: " + this.description + "}";
        System.out.println(info);
    }

    public abstract void speak();
    public abstract void eat();
    public abstract void descript();

    public Animal() {
    }

    public Animal(String name){
        this.name = name;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
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
}
