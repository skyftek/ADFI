/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS04.Exercise3;

import java.util.Arrays;

/**
 *
 * @author skyftek
 */
public class StringOneDimentionalArray {
    
    public static void main(String[] args) {
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = "Value " + (i + 1);
        }
        
        System.out.println("Chieu dai cua mang la: " + array.length);
        System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < array.length; i++) {
            array[i] += " ping";
        }
        System.out.println("Gia tri moi cua cac phan tu co trong mang la: ");
        System.out.println(Arrays.toString(array));
    }
}
