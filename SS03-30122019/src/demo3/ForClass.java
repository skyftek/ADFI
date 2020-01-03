/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

import java.util.ArrayList;

/**
 *
 * @author skyftek
 */
public class ForClass {

    public static void main(String[] args) {
        int num = 1;
        int sum = 20;

        for (num = 1; num < sum; num++, sum--) {
            if (num < sum) {
                System.out.println("num = " + num + " nho hon sum = " + sum);
            } else if (num == sum) {
                System.out.println("num = " + num + " bang voi sum = " + sum);
            } else {
                System.out.println("num = " + num + " lon hon sum = " + sum);
            }
        }

        String s = "Hello World";
        int length = s.length();
        System.out.println("Do dai cua chuoi " + s + " la: " + length);
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            System.out.println("index = " + (i + 1) + " => " + c);
        }

        ArrayList ar = new ArrayList<String>();
        ar.add("Dung");
        ar.add("Van anh");
        ar.add("lu'");

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i).toString());
        }

        // Hoac
        for (Object value : ar) {
            System.out.println(value.toString());
        }
    }
}
