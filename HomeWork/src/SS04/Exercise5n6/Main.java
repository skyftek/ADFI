/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS04.Exercise5n6;

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
            System.out.println("***Chuong trinh quan ly diem sinh vien***");
            System.out.println("1. Xem danh sach sinh vien");
            System.out.println("2. Them moi thong tin sinh vien");
            System.out.println("3. Xoa sinh vien");
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
                    m.remove(m);
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
        System.out.println("- Nhap vao diem Toan: ");
        int stu_mark1 = s.nextInt();
        System.out.println("- Nhap vao diem Ly: ");
        int stu_mark2 = s.nextInt();
        System.out.println("- Nhap vao diem Hoa: ");
        int stu_mark3 = s.nextInt();
        id++;
        student = new Student(id, stu_name, stu_age, stu_mark1, stu_mark2, stu_mark3);
        arr.add(student);
    }

    public void remove(Main m) {
        int count = 0;
        if (arr.isEmpty()) {
            System.out.println("Chua co du lieu.");
        } else {
            Scanner s = new Scanner(System.in);
            System.out.println("- Nhap vao MaSV muon xoa: ");
            int stu_id = s.nextInt();
            for (int i = 0; i < arr.size(); i++) {
                student = arr.get(i);
                if (student.stu_id == stu_id) {
                    count++;
                    System.out.println("Tim thay thong tin sinh vien co MaSV la " + stu_id);
                    student.showInfo();
                    System.out.print("Ban co dong y xoa thong tin sinh vien co MaSV la " + stu_id + " khong? (Y/N)");
                    s.nextLine();
                    String confirm = s.nextLine();
                    if (confirm.equals("Y") || confirm.equals("y")) {
                        arr.remove(i);
                        System.out.println("Ban da xoa thong tin sinh vien tai vi tri MaSV = " + stu_id);
                        System.out.println("---");
                        System.out.println("Danh sach sinh vien sau khi duoc cap nhat: ");
                        m.view();
                        count--;
                    } else {
                        System.out.println("Ban da huy thao tac.");
                    }
                }
                if (count > 0) {
                    System.out.println("Khong tim thay thong tin sinh vien co MaSV la " + stu_id);
                }
            }
        }
    }
}
