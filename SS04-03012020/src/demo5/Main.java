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
public class Main {

    public static void main(String[] args) {

        // khai bao mang so thuc co 4 phan tu
        float[] f = new float[4];
        // khoi tao du lieu
        f[0] = 1;
        f[1] = 2;
        f[2] = 3;
        f[3] = 4;

        // khai bao mang so nguyen co 10 phan tu;
        int[] numbers = new int[10];
        // khoi tao du lieu
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        // in ra man hinh mang numbers
        System.out.println(Arrays.toString(numbers));
        // ket qua: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        // khai bao mang abr
        int[] abr = {1, 30, 50};
        abr[0] = 10;
        // in ra man hinh mang abr
        System.out.println(Arrays.toString(abr));
        // ket qua: [10, 30, 50]
    }
}
