/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

/**
 *
 * @author Admin
 */
public class Conditional2 {

    enum Season3 {
        SPRING, SUMMER, FALL, WINTER;
    }
    
    public static void main(String[] args) {
        String spring = Season3.SUMMER.toString();
        System.out.println("spring = " + spring);
        switch (spring){
            case "SPRING":
                System.out.println("SPRING");
                break;
            case "SUMMER":
                System.out.println("SUMMER");
                break;
            case "FALL":
                System.out.println("FALL");
                break;
            case "WINTER":
                System.out.println("WINTER");
                break;
            default:
                System.out.println("Other!");
        }
    }
}
