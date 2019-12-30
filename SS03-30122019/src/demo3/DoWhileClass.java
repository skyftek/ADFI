/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class DoWhileClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean status = false;
        System.out.println("**Chuong trinh kiem tra so nhap vao la so le**");
        do {
            System.out.println("- Nhap vao 1 so bat ky: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println("Vui long nhap lai!");
            } else {
                System.out.printf("%d la so le.\n", num);
                status = true;
            }
        } while (status == false);
    }
}
