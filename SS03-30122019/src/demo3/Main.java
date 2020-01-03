/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Student stu1 = new Student("Van anh", 18);
        stu1.display();
        stu1.setAge(17);
        stu1.setName("Lu'");
        System.out.println(stu1.getName() + " - " + stu1.getAge());
        System.out.println("className = " + Student.className);

        Student stu2 = new Student();
        stu2.color = "red";
        stu2.eye = "brown";
        stu2.body = "slim";
        System.out.println(stu2.eye);
    }
}
