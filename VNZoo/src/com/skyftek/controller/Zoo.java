package com.skyftek.controller;

import com.skyftek.entity.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    private ArrayList<Cage> list = new ArrayList<>();

    public void addCage(Cage cage) {
        list.add(cage);
    }

    public void updateCage(Scanner scanner, Animal animal) {
        System.out.println("Nhap vao ma chuong:");
        int id_cage = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            Cage cage = list.get(i);
            if (cage.getId_cage() == id_cage) {
                cage.addAnimal(animal);
            } else {
                System.out.println("Khong tim thay chuong.");
            }
        }
    }

    public void deleteCage(Scanner scanner) {
        System.out.println("Nhap vao ma chuong:");
        int id_cage = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            Cage cage = list.get(i);
            if (cage.getId_cage() == id_cage) {
                list.remove(i);
                System.out.println("Da xoa thanh cong!");
            }
        }
    }

    public ArrayList<Cage> getList() {
        return list;
    }
}
