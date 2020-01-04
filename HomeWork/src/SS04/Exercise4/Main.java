/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS04.Exercise4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class Main {

    int id = 0;
    Student student = new Student();
    ArrayList<Student> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        int choose;
        do {
            System.out.println("\n");
            System.out.println("***Chuong trinh quan ly thong tin sinh vien***");
            System.out.println("1. Xem danh sach sinh vien");
            System.out.println("2. Them moi sinh vien");
            System.out.println("3. Cap nhat thong tin sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Tim kiem sinh vien");
            System.out.println("6. Danh sach sinh vien co nam sinh > 1993");
            System.out.println("7. Danh sach sinh vien nam co nam sinh >= 1995");
            System.out.println("0. Thoat");
            System.out.println("----- ----- -----");
            System.out.print("Chon: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    m.view();
                    break;
                case 2:
                    m.add();
                    break;
                case 3:
                    System.out.println("Comming soon..");
                    System.out.println("Chuc nang dang duoc xay dung. Vui long quay lai sau!");
                    break;
                case 4:
                    System.out.println("Comming soon..");
                    System.out.println("Chuc nang dang duoc xay dung. Vui long quay lai sau!");
                    break;
                case 5:
                    System.out.println("Comming soon..");
                    System.out.println("Chuc nang dang duoc xay dung. Vui long quay lai sau!");
                    break;
                case 6:
                    m.view1993();
                    break;
                case 7:
                    m.view1995();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Khong co chuc nang vua chon.");
            }
        } while (choose != 0);
    }

    public void view() {
        if (arr.isEmpty()) {
            System.out.println("Chua co du lieu.");
        } else {
            for (Student arr1 : arr) {
                arr1.showInfo();
            }
        }
    }

    public void add() {
        Scanner s = new Scanner(System.in);
        System.out.println("- Nhap vao ten sinh vien: ");
        String stu_name = s.nextLine();
        System.out.println("- Nhap vao tuoi sinh vien: ");
        int stu_age = s.nextInt();
        s.nextLine();
        System.out.println("- Nhap vao dia chi sinh vien: ");
        String stu_address = s.nextLine();
        System.out.println("- Nhap vao nam sinh cua sinh vien: ");
        int stu_dob = s.nextInt();
        s.nextLine();
        System.out.println("- Nhap vao gioi tinh cua sinh vien: ");
        String value = s.nextLine();
        int stu_gender;
        if (value.equals("Nam") || value.equals("nam")) {
            stu_gender = 1;
        } else {
            stu_gender = 0;
        }
        System.out.println("- Nhap vao so dien thoai cua sinh vien: ");
        String stu_phoneNumber = s.nextLine();
        System.out.println("- Nhap vao link Facebook cua sinh vien: ");
        String stu_facebook = s.nextLine();
        id++;
        student = new Student(id, stu_name, stu_age, stu_address, stu_dob, stu_gender, stu_phoneNumber, stu_facebook);
        arr.add(student);
    }

    public void view1993() {
        int count = 0;
        if (arr.isEmpty()) {
            System.out.println("Chua co du lieu.");
        } else {
            for (Student arr1 : arr) {
                int year = arr1.getStu_dob();
                if (year > 1993) {
                    arr1.showInfo();
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Chua co du lieu.");
            }
        }
    }

    public void view1995() {
        int count = 0;
        if (arr.isEmpty()) {
            System.out.println("Chua co du lieu.");
        } else {
            for (Student arr1 : arr) {
                int year = arr1.getStu_dob();
                if (year >= 1995) {
                    arr1.showInfo();
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Chua co du lieu.");
            }
        }
    }
}
