/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS04.Exercise1;

import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class FloatOneDimentionalArray {

    public static void main(String[] args) {
        float[] array = new float[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (5 + i) * 5;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Phan tu thu " + i + " cua mang la: " + array[i]);
        }

        Scanner s = new Scanner(System.in);
        int count = 0;
        System.out.print("Nhap vao gia tri muon tim kiem: ");
        float x = s.nextFloat();
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                System.out.println("Tim thay phan tu " + x + " tai vi tri " + (i + 1));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong co phan tu nay.");
        }
    }
}
