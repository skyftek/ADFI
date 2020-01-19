package com.skyftek.entity;

import java.util.Scanner;

public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Tieng keu: Meow meow...");
    }

    @Override
    public void eat() {
        System.out.println("Thuc an: Meo an ca");
    }

    @Override
    public void descript() {
        System.out.println("Thong tin them: Meo bat chuot.");
    }

    @Override
    public void inputInfo(Scanner scanner){
        super.inputInfo(scanner);
    }

    @Override
    public void showInfo(){
        super.showInfo();
    }
}
