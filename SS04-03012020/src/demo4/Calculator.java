/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo4;

import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class Calculator {

    private int num1;
    private int num2;

    public Calculator() {
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculator(double num1, double num2) {
        this((int) num1, (int) num2);
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("- Nhap vao so thu nhat: ");
        this.num1 = sc.nextInt();
        System.out.print("- Nhap vao so thu hai: ");
        this.num2 = sc.nextInt();
    }

    public int add() {
        return this.num1 + this.num2;
    }

    public int sub() {
        return this.num1 - this.num2;
    }

    public int mul() {
        return this.num1 * this.num2;
    }

    public int div() {
        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("Khong duoc dat gia tri 0.");
            return 0;
        } else {
            return this.num1 / this.num2;
        }
    }
}
