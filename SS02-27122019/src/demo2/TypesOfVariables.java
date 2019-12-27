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
        
        Season (int value){
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
        
        // Bien nguyen thuy kieu so thuc
        float numFloat = 0f;
        double numDouble = 0;
    
        // Bien character
        char c = 'A';
        
        // Bien true/false
        boolean type = false;
        
        System.out.println("String \"hello world\"");
        // Ket qua: String "hello world"
        
        num = 1000;
        
        final int numFinal = 10;
        
//        numFinal = 100; [Loi] Vi bien hang khong the khai bao lai

        float s = HinhTron.PI * 4;
        System.out.println(s);
        // Ket qua: 12.56

        // mau enum
        Season season = Season.SUMMER;
        System.out.println("Season = " + season);
        // Ket qua: SUMMER
        
        Season2 season2 = Season2.SUMMER;
        if(season2.toString().equals("SUMMER")){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // Ket qua: True
        
        // Lay du lieu tu ban phim nhap vao
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 1 số: ");
        //  bat gia tri la so nhap vao tu ban phim
        //  chi nhan gia tri la so, khong nhan cac ky tu khac
        int input = scanner.nextInt();
        //  in ra man hinh gia tri so vua nhap vao
        System.out.println("So da nhap vao: " + input);
        
        scanner.nextLine();
        System.out.println("");
        
        System.out.print("Nhap vao ky tu hoac chuoi: ");
        //  bat gia tri la ky tu hoac chuoi nhap vao
        String inputString = scanner.nextLine();
        
        System.out.println("Chuoi da nhap vao: " + inputString);
    }
}
