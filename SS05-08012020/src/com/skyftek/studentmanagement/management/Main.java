/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyftek.studentmanagement.management;

import com.skyftek.studentmanagement.entity.Person;
import com.skyftek.studentmanagement.entity.Student;
import com.skyftek.studentmanagement.entity.Teacher;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> arr_p = new ArrayList<>();
        ArrayList<Student> arr_s = new ArrayList<>();
        ArrayList<Teacher> arr_t = new ArrayList<>();

        int choose;
        do {
            System.out.println("\n");
            System.out.println("***Person Management***");
            System.out.println("1. New Teacher");
            System.out.println("2. New Student");
            System.out.println("3. New Person");
            System.out.println("4. View Person list");
            System.out.println("5. View Student list");
            System.out.println("6. View Teacher list");
            System.out.println("7. Exit");
            System.out.println("---");
            System.out.print("Choose: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    Teacher teacher = new Teacher();
                    teacher.inputInfo(scanner);
                    arr_t.add(teacher);
                    break;
                case 2:
                    Student student = new Student();
                    student.inputInfo(scanner);
                    arr_s.add(student);
                    break;
                case 3:
                    Person person = new Person();
                    person.inputInfo(scanner);
                    arr_p.add(person);
                    break;
                case 4:
                    for (int i = 0; i < arr_p.size(); i++) {
                        arr_p.get(i).showInfo();
                    }
                    break;
                case 5:
                    for (int i = 0; i < arr_s.size(); i++) {
                        arr_s.get(i).showInfo();
                    }
                    break;
                case 6:
                    for (int i = 0; i < arr_t.size(); i++) {
                        arr_t.get(i).showInfo();
                    }
                    break;
                case 7:
                    System.out.println("End.");
                    break;
                default:
                    System.err.println("Not support.");
            }
        } while (choose != 7);
    }
}
