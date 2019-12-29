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
public class Exercise1 {

    /*
        Viết chương trình tính tiền cho bài toán ra quán chơi game
        - Nhập vào giờ bắt đầu (int) và giờ kết thúc (int)
        - Kiểm tra điều kiện, nếu giờ bắt đầu >= giờ kết thúc thì hiển thị màn hình, nhập không đúng
        - Nếu số giờ chơi < 18h thì giá chơi: 30000/1h, còn ngược lại thì 25000/1h. 
        - HIển thị số giờ chơi và thông báo số tiền
        Sử dụng cú pháp If để xây dựng chương trình.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao gio bat dau: ");
        int start = scanner.nextInt();
        System.out.print("Nhap vao gio ket thuc: ");
        int end = scanner.nextInt();

        if (start >= end || start < 0) {
            System.out.println("Nhap khong dung!");
        } else {
            int time = end - start;
            int money;
            if (time < 18) {
                money = time * 30000;
                System.out.println("- So gio choi cua ban la: " + time);
                System.out.println("- So tien thanh toan: " + money);
            } else {
                money = time * 25000;
                System.out.println("- So gio choi cua ban la: " + time);
                System.out.println("- So tien thanh toan: " + money);
            }
        }
    }
}
