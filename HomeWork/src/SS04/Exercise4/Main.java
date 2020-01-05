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
                    m.update();
                    break;
                case 4:
                    m.remove();
                    break;
                case 5:
                    m.search();
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

    public void update() {
        if (arr.isEmpty()) {
            System.out.println("Chua co du lieu.");
        } else {
            Scanner s = new Scanner(System.in);
            System.out.println("- Nhap vao ma sinh vien: ");
            int stu_id = s.nextInt();
            for (int i = 0; i < arr.size(); i++) {
                student = arr.get(i);
                if (student.stu_id == stu_id) {
                    System.out.println("Tim thay thong tin sinh vien co MaSV la " + stu_id);
                    student.showInfo();

                    updateInfo(student, i);
                } else {
                    System.out.println("Khong tim thay thong tin sinh vien co MaSV la " + stu_id);
                }
            }
        }
    }

    public void updateInfo(Student stu, int index) {
        int choose;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("\n");
            System.out.println("-> Thay doi thong tin sinh vien");
            System.out.println("1. Thay doi ten");
            System.out.println("2. Thay doi tuoi");
            System.out.println("3. Thay doi dia chi");
            System.out.println("4. Thay doi nam sinh");
            System.out.println("5. Thay doi gioi tinh");
            System.out.println("6. Thay doi SDT");
            System.out.println("7. Thay doi Facebook");
            System.out.println("---");
            System.out.println("8. Luu thong tin thay doi");
            System.out.println("0. Huy");
            System.out.println("--- --- ---");
            System.out.print("Chon: ");
            choose = s.nextInt();
            switch (choose) {
                case 1:
                    s.nextLine();
                    System.out.println("- Nhap vao ten moi: ");
                    String new_name = s.nextLine();
                    stu.setStu_name(new_name);
                    break;
                case 2:
                    System.out.println("- Nhap vao tuoi moi: ");
                    int new_age = s.nextInt();
                    stu.setStu_age(new_age);
                    break;
                case 3:
                    s.nextLine();
                    System.out.println("- Nhap vao dia chi moi: ");
                    String new_address = s.nextLine();
                    stu.setStu_address(new_address);
                    break;
                case 4:
                    System.out.println("- Nhap vao nam sinh moi: ");
                    int new_dob = s.nextInt();
                    stu.setStu_dob(new_dob);
                    break;
                case 5:
                    s.nextLine();
                    System.out.println("- Nhap vao gioi tinh moi: ");
                    String value = s.nextLine();
                    int new_gender;
                    if (value.equals("Nam") || value.equals("nam")) {
                        new_gender = 1;
                    } else {
                        new_gender = 0;
                    }
                    stu.setStu_gender(new_gender);
                    break;
                case 6:
                    s.nextLine();
                    System.out.println("- Nhap vao SDT moi: ");
                    String new_phoneNumber = s.nextLine();
                    stu.setStu_phoneNumber(new_phoneNumber);
                    break;
                case 7:
                    s.nextLine();
                    System.out.println("- Nhap vao link Facebook moi: ");
                    String new_facebook = s.nextLine();
                    stu.setStu_facebook(new_facebook);
                    break;
                case 8:
                    arr.set(index, student);
                    System.out.println("Cap nhat thong tin thanh cong.");
                    break;
                case 0:
                    System.out.println("Da huy cap nhat thong tin.");
                    break;
                default:
                    System.out.println("Vui long lua chon chinh xac thong tin muon thay doi!");

            }
        } while (choose != 0);
    }

    public void remove() {
        if (arr.isEmpty()) {
            System.out.println("Chua co du lieu.");
        } else {
            Scanner s = new Scanner(System.in);
            System.out.println("- Nhap vao ma sinh vien: ");
            int stu_id = s.nextInt();
            for (int i = 0; i < arr.size(); i++) {
                student = arr.get(i);
                if (student.stu_id == stu_id) {
                    System.out.println("Tim thay thong tin sinh vien co MaSV la " + stu_id);
                    student.showInfo();
                    System.out.print("Ban co dong y xoa thong tin sinh vien co MaSV la " + stu_id + " khong? (Y/N)");
                    s.nextLine();
                    String confirm = s.nextLine();
                    if (confirm.equals("Y") || confirm.equals("y")) {
                        arr.remove(i);
                        System.out.println("Ban da xoa thong tin sinh vien tai vi tri MaSV = " + stu_id);
                    } else {
                        System.out.println("Ban da huy thao tac.");
                    }
                } else {
                    System.out.println("Khong tim thay thong tin sinh vien co MaSV la " + stu_id);
                }
            }
        }
    }

    public void search() {
        if (arr.isEmpty()) {
            System.out.println("Chua co du lieu.");
        } else {
            Scanner s = new Scanner(System.in);
            System.out.println("- Nhap vao ten sinh vien muon tim kiem: ");
            String stu_name = s.nextLine();
            for (int i = 0; i < arr.size(); i++) {
                student = arr.get(i);
                System.out.println("- Tim thay ket qua: ");
                if (student.stu_name.equals(stu_name)) {
                    student.showInfo();
                } else {
                    System.out.println("Khong tim thay thong tin sinh vien co ten la " + stu_name);
                }
            }
        }
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
