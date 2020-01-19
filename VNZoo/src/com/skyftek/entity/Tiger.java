package com.skyftek.entity;

import java.util.Scanner;

public class Tiger extends Animal {
    @Override
    public void speak() {
        System.out.println("Tieng keu: Gruuu...");
    }

    @Override
    public void eat() {
        System.out.println("Thuc an: Ho an thit.");
    }

    @Override
    public void descript() {
        System.out.println("Thong tin them: Chua te rung xanh.");
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
