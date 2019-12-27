/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class TypesOfVariables {

    // 2 cach khai bao enum
    enum Season {
        SPRING(1), SUMMER(2), FALL(3), WINTER(4);

        int value;

        Season(int value) {
            this.value = value;
        }
    }

    enum Season2 {
        SPRING, SUMMER, FALL, WINTER;
    }

    public static void main(String[] args) {
        // Bien nguyen thuy kieu so nguyen
        byte numByte = 1;
        short numShort = 1;
        int num = 123;
        long longNum = 11111L;
        System.out.println("num = " + longNum);
        // Ket qua: num = 11111

        // Ep kieu ro rang
        num = (int) longNum;
        System.out.println(num);
        // Ket qua: 11111

        num = 5;

        // Ep kieu an du
        longNum = num;
        System.out.println(longNum);
        // Ket qua: 5

        // Bien nguyen thuy kieu so thuc
        float numFloat = 0f;
        double numDouble = 0;

        // Bien character
        char c = 'A';

        // Bien true/false
        boolean type = false;

        System.out.println("String \"hello world\"");
        // Ket qua: String "hello world"

        // Bien hang final - bien chi gan gia tri 1 lan duy nhat khi khoi tao
        // Bien "num" co the gan lai gia tri nhieu lan
        num = 1000;
        // Khai bao bien hang "numFinal"
        final int numFinal = 10;

//        numFinal = 100; [Loi] Vi bien hang khong the khai bao lai
        // Goi den bien PI tu class HinhTron
        float s = HinhTron.PI * 4;
        System.out.println(s);
        // Ket qua: 12.56

        // Mau enum
        Season season = Season.SUMMER;
        System.out.println("Season = " + season);
        // Ket qua: SUMMER

        Season2 season2 = Season2.SUMMER;
        if (season2.toString().equals("SUMMER")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // Ket qua: True

        // Lay du lieu tu ban phim nhap vao
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 1 số: ");
        //  Bat gia tri la so nhap vao tu ban phim
        //  Chi nhan gia tri la so, khong nhan cac ky tu khac
        int input = scanner.nextInt();
        //  In ra man hinh gia tri so vua nhap vao
        System.out.println("So da nhap vao: " + input);

        //  Bat gia tri khi su dung Enter
        scanner.nextLine();
        //  In ra gia tri trong de cach 1 dong
        System.out.println("");

        System.out.print("Nhap vao ky tu hoac chuoi: ");
        //  Bat gia tri la ky tu hoac chuoi nhap vao
        String inputString = scanner.nextLine();

        if (inputString != null) {
            System.out.println("Ban da khong nhap gi ca.");
        } else {
            //  In ra man hinh ky tu hoac chuoi nhap vao
            System.out.println("Chuoi da nhap vao: " + inputString);
        }
    }
}
