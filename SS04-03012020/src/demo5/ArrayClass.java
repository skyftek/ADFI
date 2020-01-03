/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo5;

import java.util.Arrays;

/**
 *
 * @author skyftek
 */
public class ArrayClass {

    public static void main(String[] args) {
        int n = 4;
        int sum = 0;
        // khai bao mang co n phan tu
        int[] numbers = new int[n];
        // khoi tao gia tri cho mang
        for (int i = 0; i < n; i++) {
            numbers[i] = i * 10;
        }
        // hien thi cac phan tu cua mang
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu [" + i + "] = " + numbers[i]);
        }
        // hoac
        for (int number : numbers) {
            System.out.println("Gia tri phan tu = " + number);
            sum += number;
        }
        System.out.println("Tong la: " + sum);

        // tinh tong su dung ham sum
        ArrayClass ar = new ArrayClass();
        ar.sum(numbers);
    }

    // ham tinh tong cac phan tu trong mang
    public void sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Tong 2 la: " + sum);
    }
}
