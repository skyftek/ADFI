/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

/**
 *
 * @author skyftek
 */
public class Student {

    // khai bao state, truong
    private String name;
    private int age;
    static String className = "T1906E";
    String color;
    protected String eye;
    public String body;

    // ham khoi tao doi tuong
    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Student getInstance() {
        return new Student();
    }

    // ham khoi tao co tham so
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // khai bao ham
    public void display() {
        System.out.println("name: " + name + "; age = " + age);
    }
}
