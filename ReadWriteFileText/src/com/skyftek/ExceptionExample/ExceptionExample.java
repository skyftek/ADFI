package com.skyftek.ExceptionExample;

import java.io.IOException;
import java.util.Scanner;

class ExceptionExample {
    void method() throws IOException {
        System.out.println("THROWS EXCEPTION");
    }
    void method2() throws IOException {
        throw new IOException("throw Exception");
    }
    void method_trycatch(){
        int[] arr = {10, 12, 14};
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen");
        try {
            int num = scan.nextInt();
            System.out.println("arr[3] = "+ arr[3]);
            // khoi code code co the xay ra ngoai
            System.out.println("Vao try");
        }catch (Exception e){
            // khoi code xu ly ngoai le
            System.out.println("Vao catch");
            e.printStackTrace();
        }
    }
    void method_trycatchfinally(){
        int[] arr = {10, 12, 14};
        try {
            System.out.println("arr[3] = "+ arr[3]);
            System.out.println("Vao try");
        }catch (Exception e){
            System.out.println("Vao catch");
            e.printStackTrace();
        } finally{
            System.out.println("End in Final");
        }
    }
    void method_tryfinally(){
        int[] arr = {10, 12, 14};
        try {
            System.out.println("arr[3] = "+ arr[3]);
            System.out.println("Vao try");
        } finally{
            System.out.println("End in Final");
        }
    }
    public static void main(String args[]){
        ExceptionExample obj = new ExceptionExample();
        System.out.println("");
    }

}