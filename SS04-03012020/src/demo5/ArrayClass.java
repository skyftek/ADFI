/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo5;

import demo4.Calculator;
import java.util.ArrayList;

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

        // khai bao mang arraylist cho cap phat dong
        ArrayList al = new ArrayList();
        al.add("Van anh lu'");
        al.add(2);
        al.add(true);
        System.out.println("Do dai cua ArrayList = " + al.size());
        // ket qua: Do dai cua ArrayList = 3

        // duyet phan tu co trong ArrayList
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // them phan tu tu doi tuong Calculator
        Calculator cal = new Calculator();
        al.add(cal);

        Object obj = al.get(0);

        // khai bao mang dong kieu Calculator
        ArrayList<Calculator> alcal = new ArrayList<>();

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
