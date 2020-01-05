/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS02;

import java.util.Scanner;

/**
 *
 * @author skyftek
 */
public class Exercise2 {

    enum Month {
        JAN(1, 31), FEB(2, 28), MAR(3, 31), APR(4, 30), MAY(5, 31), JUN(6, 30), JUL(7, 31), AUG(8, 31), SEP(9, 30), OCT(10, 31), NOV(11, 30), DEC(12, 31);

        int month, day;

        private Month() {
        }

        private Month(int month, int day) {
            this.month = month;
            this.day = day;
        }

        public static Month getMonthByValue(int value) {
            for (Month month : Month.values()) {
                if (month.month == value) {
                    return month;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Exercise2 e = new Exercise2();
        System.out.print("- Nhap vao thang bat ky bang so: ");
        int month = s.nextInt();
        System.out.print("- Nhap vao nam bat ky: ");
        int year = s.nextInt();
        switch (month) {
            case 1:
                e.view(month, year);
                break;
            case 2:
                e.view(month, year);
                break;
            case 3:
                e.view(month, year);
                break;
            case 4:
                e.view(month, year);
                break;
            case 5:
                e.view(month, year);
                break;
            case 6:
                e.view(month, year);
                break;
            case 7:
                e.view(month, year);
                break;
            case 8:
                e.view(month, year);
                break;
            case 9:
                e.view(month, year);
                break;
            case 10:
                e.view(month, year);
                break;
            case 11:
                e.view(month, year);
                break;
            case 12:
                e.view(month, year);
                break;
            default:
                System.out.println("So lieu khong chinh xac.");
                System.out.println("Ket thuc chuong trinh.");
        }
    }

    public void view(int month, int year) {
        if (month == 2) {
            int day = 28;
            if (year % 4 == 0 && year % 100 != 0) {
                day = 29;
            } else if (year % 100 == 0 && year % 400 == 0) {
                day = 29;
            }
            System.out.println("Thang " + month + " co " + day + " ngay.");
        } else {
            Month m = Month.getMonthByValue(month);
            System.out.println("Thang " + m.month + " co " + m.day + " ngay.");
        }
        System.out.println("Ket thuc chuong trinh.");
    }
}
