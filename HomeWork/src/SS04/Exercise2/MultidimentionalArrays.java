/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS04.Exercise2;

import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class MultidimentionalArrays {

    public static void main(String[] args) {
        int n, m;
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Nhap vao so hang cua mang: ");
            n = s.nextInt();
            System.out.print("Nhap vao so cot cua mang: ");
            m = s.nextInt();
            if (n < 1 || m < 1) {
                System.out.println("Vui long khong nhap 0 hoac so am.");
            }
        } while (n < 1 || m < 1);

        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (5 + i + j) * 7;
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Tong cac phan tu co trong mang array[" + n + "][" + m + "] la: " + sum);

        System.out.println("Danh sach cac phan tu nam trong mang array[" + n + "][" + m + "]:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("- array[" + n + "][" + m + "] = " + array[i][j]);
            }
        }
    }
}
