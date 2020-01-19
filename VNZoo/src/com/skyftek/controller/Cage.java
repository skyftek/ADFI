package com.skyftek.controller;

import com.skyftek.entity.Animal;

import java.util.ArrayList;

public class Cage {
    private int id_cage;
    private ArrayList<Animal> list = new ArrayList<>();

    public void addAnimal(Animal animal) {
        list.add(animal);
    }

    public void deleteAnimal() {
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }

    public void displayAnimal(){
        System.out.println("Ma chuong: " + this.id_cage);
        for(int i = 0; i < list.size(); i++){
            list.get(i).showInfo();
        }
    }

    public void displayMore(){
        System.out.println("Ma chuong: " + this.id_cage);
        for(int i = 0; i < list.size(); i++){
            list.get(i).speak();
            list.get(i).eat();
            list.get(i).descript();
        }
    }

    public Cage() {
    }

    public Cage(int id_cage, ArrayList<Animal> list) {
        this.id_cage = id_cage;
        this.list = list;
    }

    public int getId_cage() {
        return id_cage;
    }

    public void setId_cage(int id_cage) {
        this.id_cage = id_cage;
    }

    public ArrayList<Animal> getList() {
        return list;
    }

    public void setList(ArrayList<Animal> list) {
        this.list = list;
    }
}
