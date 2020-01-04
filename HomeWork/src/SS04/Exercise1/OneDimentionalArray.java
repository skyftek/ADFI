/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS04.Exercise1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class OneDimentionalArray {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang: ");
        n = s.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (5 + i) * 7;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.printf("Tong cua cac phan tu trong mang co %d phan tu la: %d\n", n, sum);

        System.out.print("Danh sach cac phan tu co trong mang: ");
        System.out.println(Arrays.toString(array));
    }
}
