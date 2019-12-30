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
public class WhileClass {

    public static void main(String[] args) {
        boolean status = false;
        System.out.println("***Chuong trinh kiem tra so nhap vao la so le***");
        while (status == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("- Nhap vao 1 so bat ky: ");
            int input = scanner.nextInt();
            if (input % 2 == 1) {
                System.out.printf("%d la so le.", input);
                status = true;
            } else {
                System.out.println("Vui long thu lai!");
            }
        }
    }
}
