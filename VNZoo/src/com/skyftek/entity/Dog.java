package com.skyftek.entity;

import java.util.Scanner;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Tieng keu: Gau gau...");
    }

    @Override
    public void eat() {
        System.out.println("Thuc an: Cho an com");
    }

    @Override
    public void descript() {
        System.out.println("Thong tin them: Giu nha.");
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
