/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo4;

import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        calculator.setNum1(10);
//        calculator.setNum2(5);
        Scanner sc = new Scanner(System.in);

        System.out.println(calculator.add(1, 2, 3, 4, 5, 6, 7, 8));

        int choose;
        do {
            System.out.println("***Calculator***");
            System.out.println("1. Tinh tong 2 so");
            System.out.println("2. Tinh hieu 2 so");
            System.out.println("3. Tinh tich 2 so");
            System.out.println("4. Tinh thuong 2 so");
            System.out.println("0. Ket thuc chuong trinh");
            System.out.println("---");
            System.out.print("Chon: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    calculator.enter();
                    System.out.printf("- Tong cua 2 so la: %d + %d = %d \n", calculator.getNum1(), calculator.getNum2(), calculator.add());
                    System.out.println("----- ----- ----- -----\n\n");
                    break;
                case 2:
                    calculator.enter();
                    System.out.printf("- Hieu cua 2 so la: %d - %d = %d \n", calculator.getNum1(), calculator.getNum2(), calculator.sub());
                    System.out.println("----- ----- ----- -----\n\n");
                    break;
                case 3:
                    calculator.enter();
                    System.out.printf("- Tich cua 2 so la: %d * %d = %d \n", calculator.getNum1(), calculator.getNum2(), calculator.mul());
                    System.out.println("----- ----- ----- -----\n\n");
                    break;
                case 4:
                    calculator.enter();
                    System.out.printf("- Thuong cua 2 so la: %d / %d = %d \n", calculator.getNum1(), calculator.getNum2(), calculator.div());
                    System.out.println("----- ----- ----- -----\n\n");
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Khong co chuc nang ban lua chon.");
                    System.out.println("----- ----- ----- -----\n\n");
            }
        } while (choose != 0);
    }
}
