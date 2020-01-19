/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyftek.personmanagement.management;

import com.skyftek.personmanagement.entity.Boy;
import com.skyftek.personmanagement.entity.Girl;
import com.skyftek.personmanagement.entity.Person;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class Main {

    private static ArrayList<Person> list = new ArrayList<>();

    public static void main(String[] args) {
        Girl girl = new Girl() {
        };
        girl.setName("Girl");
        girl.eat();

        Scanner scanner = new Scanner(System.in);
        Person person2 = new Boy() {
        };
        person2.inputInfo(scanner);
        Main.list.add(person2);
        person2.showInfo();

        for (Person per : list) {
            System.out.println(per.descript("AAAA"));
        }
    }
}
