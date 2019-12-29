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

    /*
        Nhập vào tháng, năm bất kỳ.
        In ra số ngày tương ứng với tháng, năm đó.
        Sử dụng kiểu ENUM, switch để xây dựng chương trình.
     */
    enum Month {
        JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTORBER(10), NOVEMBER(11), DECEMBER(12);

        int value;

        Month(int value) {
            this.value = value;
        }

        public static Month getMonthByValue(int value) {
            for (Month m : Month.values()) {
                if (m.value == value) {
                    return m;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ten thang: ");
        String month = scanner.nextLine();
        System.out.print("Nhap vao nam bat ky: ");
        int year = scanner.nextInt();
        switch (month) {
            case "1":
            case "january":
            case "JANUARY":
                System.out.println(Month.JANUARY + ", " + year + ": 31 ngay");
                break;
            case "2":
            case "february":
            case "FEBRUARY":
                int day = 28;
                if (year % 4 == 0 && year % 100 != 0) {
                    day = 29;
                } else if (year % 100 == 0 && year % 400 == 0) {
                    day = 29;
                }
                System.out.println(Month.FEBRUARY + ", " + year + ": " + day + " ngay");
                break;
            case "3":
            case "march":
            case "MARCH":
                System.out.println(Month.MARCH + ", " + year + ": 31 ngay");
                break;
            case "4":
            case "april":
            case "APRIL":
                System.out.println(Month.APRIL + ", " + year + ": 30 ngay");
                break;
            case "5":
            case "may":
            case "MAY":
                System.out.println(Month.MAY + ", " + year + ": 31 ngay");
                break;
            case "6":
            case "june":
            case "JUNE":
                System.out.println(Month.JUNE + ", " + year + ": 30 ngay");
                break;
            case "7":
            case "july":
            case "JULY":
                System.out.println(Month.JULY + ", " + year + ": 31 ngay");
                break;
            case "8":
            case "august":
            case "AUGUST":
                System.out.println(Month.AUGUST + ", " + year + ": 31 ngay");
                break;
            case "9":
            case "september":
            case "SEPTEMBER":
                System.out.println(Month.SEPTEMBER + ", " + year + ": 30 ngay");
                break;
            case "10":
            case "october":
            case "OCTOBER":
                System.out.println(Month.OCTORBER + ", " + year + ": 31 ngay");
                break;
            case "11":
            case "november":
            case "NOVEMBER":
                System.out.println(Month.NOVEMBER + ", " + year + ": 30 ngay");
                break;
            case "12":
            case "december":
            case "DECEMBER":
                System.out.println(Month.DECEMBER + ", " + year + ": 31 ngay");
                break;
            default:
                System.out.println("Ban nhap khong chinh xac!");
                System.out.println("Ket thuc chuong trinh.");
        }
    }
}
