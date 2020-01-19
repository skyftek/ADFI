package com.skyftek.management;

import com.skyftek.controller.Cage;
import com.skyftek.controller.Zoo;
import com.skyftek.entity.Cat;
import com.skyftek.entity.Dog;
import com.skyftek.entity.Tiger;
import javafx.scene.chart.CategoryAxis;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();
        int choose;
        do {
            System.out.println("\n\n");
            System.out.println("***CHUONG TRINH QUAN LY DONG VAT***");
            System.out.println("1. Them chuong");
            System.out.println("2. Xoa chuong");
            System.out.println("3. Them con ho vao chuong");
            System.out.println("4. Them con cho vao chuong");
            System.out.println("5. Them con meo vao chuong");
            System.out.println("6. Xoa con vat khoi chuong");
            System.out.println("7. Xem tat ca con vat trong danh sach");
            System.out.println("8. Thong tin them");
            System.out.println("0. Thoat");
            System.out.println("---");
            System.out.print("Chon: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    Cage cage0 = new Cage();
                    System.out.println("Nhap vao ma chuong moi:");
                    cage0.setId_cage(scanner.nextInt());
                    zoo.addCage(cage0);
                    break;
                case 2:
                    zoo.deleteCage(scanner);
                    break;
                case 3:
                    Tiger tiger = new Tiger();
                    tiger.inputInfo(scanner);
                    zoo.updateCage(scanner, tiger);
                    break;
                case 4:
                    Dog dog = new Dog();
                    dog.inputInfo(scanner);
                    zoo.updateCage(scanner, dog);
                    break;
                case 5:
                    Cat cat = new Cat();
                    cat.inputInfo(scanner);
                    zoo.updateCage(scanner, cat);
                    break;
                case 6:
                    ArrayList<Cage> list_cage = zoo.getList();
                    for(int i = 0; i < list_cage.size(); i++){
                        list_cage.get(i).deleteAnimal();
                    }
                    break;
                case 7:
                    ArrayList<Cage> list_cage2 = zoo.getList();
                    for(int i = 0; i < list_cage2.size(); i++){
                        list_cage2.get(i).displayAnimal();
                    }
                    break;
                case 8:
                    ArrayList<Cage> list_cage3 = zoo.getList();
                    for(int i = 0; i < list_cage3.size(); i++){
                        list_cage3.get(i).displayMore();
                    }
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Chuc nang khong duoc ho tro. Vui long lua chon lai!");
            }
        } while (choose != 0);
    }
}
