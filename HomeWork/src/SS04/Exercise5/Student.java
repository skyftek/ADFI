/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS04.Exercise5;

/**
 *
 * @author skyftek
 */
public class Student {

    int stu_id;
    String stu_name;
    int stu_age;
    int stu_mark1;
    int stu_mark2;
    int stu_mark3;
    float stu_mark_average;

    public Student() {
    }

    public Student(int stu_id, String stu_name, int stu_age, int stu_mark1, int stu_mark2, int stu_mark3, float stu_mark_average) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_age = stu_age;
        this.stu_mark1 = stu_mark1;
        this.stu_mark2 = stu_mark2;
        this.stu_mark3 = stu_mark3;
        this.stu_mark_average = stu_mark_average;
    }

    public Student(int stu_id, String stu_name, int stu_age, int stu_mark1, int stu_mark2, int stu_mark3) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_age = stu_age;
        this.stu_mark1 = stu_mark1;
        this.stu_mark2 = stu_mark2;
        this.stu_mark3 = stu_mark3;
    }

    public int getStu_id() {
        return stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public int getStu_age() {
        return stu_age;
    }

    public int getStu_mark1() {
        return stu_mark1;
    }

    public int getStu_mark2() {
        return stu_mark2;
    }

    public int getStu_mark3() {
        return stu_mark3;
    }

    public float getStu_mark_average() {
        return stu_mark_average;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public void setStu_age(int stu_age) {
        this.stu_age = stu_age;
    }

    public void setStu_mark1(int stu_mark1) {
        this.stu_mark1 = stu_mark1;
    }

    public void setStu_mark2(int stu_mark2) {
        this.stu_mark2 = stu_mark2;
    }

    public void setStu_mark3(int stu_mark3) {
        this.stu_mark3 = stu_mark3;
    }

    public void setStu_mark_average(int stu_mark_average) {
        this.stu_mark_average = stu_mark_average;
    }

    public void showInfo() {
        String info = "MaSV: " + this.stu_id + " | TenSV: " + this.stu_name + " | Tuoi: " + this.stu_age + " | Diem Toan: " + this.stu_mark1 + " | Diem Ly: " + this.stu_mark2 + " | Diem Hoa: " + this.stu_mark3 + " | DTB: ";
        float mark_average = (this.stu_mark1 + this.stu_mark2 + this.stu_mark3) / 3;
        info += mark_average;
        System.out.println(info);
    }
}
