/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS02;

import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class Exercise3 {

    /*
        Viết chương trình giải phương trình bậc hai: ax2 + bx + c = 0;
        Trong đó a, b, c là 3 số nguyên nhập từ bàn phím. Tìm x và hiển thị kết quả.
        Sử dụng thư viện: Math.sqrt() để tính căn bậc 2 dương của 1 số.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 2: ax2 + bx + c = 0 (*)");
        System.out.print("- Nhap vao a: ");
        int a = scanner.nextInt();
        System.out.print("- Nhap vao b: ");
        int b = scanner.nextInt();
        System.out.print("- Nhap vao c: ");
        int c = scanner.nextInt();
        int delta = b * b - 4 * a * c;
        if (a + b + c == 0) {
            System.out.println("Phuong trinh (*) co 2 nghiem phan biet la: ");
            System.out.println("x1 = 1");
            System.out.println("x2 = " + c / a);
        } else if (a - b + c == 0) {
            System.out.println("Phuong trinh (*) co 2 nghiem phan biet la: ");
            System.out.println("x1 = -1");
            System.out.println("x2 = " + -1 * c / a);
        } else if (delta < 0) {
            System.out.println("Phuong trinh (*) vo nghiem.");
        } else if (delta == 0) {
            int x = -1 * b / (2 * a);
            System.out.println("Phuong trinh (*) co nghiem kep: x1 = x2 = " + x);
        } else {
            float x1 = (float) ((-1 * b + Math.sqrt(delta)) / (2 * a));
            float x2 = (float) ((-1 * b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phuong trinh (*) co 2 nghiem phan biet la: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
