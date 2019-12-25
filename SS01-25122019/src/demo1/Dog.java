package demo1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Dog {
    String name;
    int age;
    
    public void run(){
        System.out.println("A Dog run!");
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        Cat cat = new Cat();
        cat.eat();
        cat.name = "Mun";
        System.out.println("She is " + cat.name + ".");
    }
}
