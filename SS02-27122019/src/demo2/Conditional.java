/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Conditional {

    public static void main(String[] args) {
        // Nhap vao 3 so: So luong ban, Moc so sanh, Thuong
        // Neu So luong ban >= 2 * Moc so sanh thi hien thi "Excellance" va Thuong = Moc so sanh * 2
        // Neu So luong ban >= 1 * Moc so sanh thi hien thi "Good" va Thuong = Moc so sanh
        // Neu So luong ban < 1 * Moc so sanh thi hien thi "Bad" va Thuong = 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("---Kiem tra thuong tet nam nay---");
        System.out.print("Nhap so tien Moc so sanh: ");
        int target = scanner.nextInt();
        System.out.print("Nhap So tien ban duoc: ");
        int sale = scanner.nextInt();
        int bonus;

        if (sale >= (2 * target)) {
            System.out.println("Excellance!!!");
            bonus = target * 2;
            System.out.println("Thuong = " + bonus);
        } else if (sale >= target) {
            System.out.println("Good!");
            bonus = target;
            System.out.println("Thuong = " + bonus);
        } else {
            System.out.println("Bad.");
            bonus = 0;
            System.out.println("Thuong = " + bonus);
        }
        System.out.println("OK. Nguoi tiep theo.");

        // hoac
        // Kiem tra sale >= target * 2 hay khong. Neu dung thi bonus = target * 2.
        // Neu sai thi tiep tuc kiem tra sale >= target hay khong. Neu dung thi bonus = target.
        // Neu sai thi bonus = 0.
        bonus = (sale >= target * 2) ? target * 2 : ((sale >= target) ? target : 0);
        System.out.println(bonus);
    }
}
