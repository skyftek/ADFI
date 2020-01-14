package com.skyftek.readwritefiletxt.management;

import com.skyftek.readwritefiletxt.controller.Function;
import com.skyftek.readwritefiletxt.entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> stu_list = new ArrayList<Student>();

    public static void main(String[] args) {
        int choose;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n***Student Management***");
            System.out.println("1. New Student");
            System.out.println("2. Display Student list");
            System.out.println("3. Save to Student.txt");
            System.out.println("4. Read from Student.txt");
            System.out.println("0. Exit");
            System.out.println("---");
            System.out.print("Choose: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("\n---\n1. New Student");
                    Student student = new Student();
                    student.inputInfo(scanner);
                    stu_list.add(student);
                    break;
                case 2:
                    System.out.println("\n---\n2. Display Student list");
                    for (Student s : stu_list) {
                        System.out.println(s.toString());
                    }
                    break;
                case 3:
                    System.out.println("\n---\n3. Save to Student.txt");
                    Function f_write = new Function();
                    f_write.writeNewFile(stu_list);
                    break;
                case 4:
                    System.out.println("\n---\n4. Read from Student.txt");
                    Function f_read = new Function();
                    f_read.readExistFile();
                    break;
                case 0:
                    System.out.println("\n---\n0. Exit");
                    break;
                default:
                    System.out.println(">> This option is not supported.\nPlease try again!");
            }
        } while (choose != 0);
    }
}
