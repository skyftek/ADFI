/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SS04.Exercise4;

/**
 *
 * @author skyftek
 */
public class Student {

    int stu_id;
    String stu_name;
    int stu_age;
    String stu_address;
    int stu_dob;
    int stu_gender;
    String stu_phoneNumber;
    String stu_facebook;

    public Student() {
    }

    public Student(int stu_id, String stu_name, int stu_age, String stu_address, int stu_dob, int stu_gender, String stu_phoneNumber, String stu_facebook) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_age = stu_age;
        this.stu_address = stu_address;
        this.stu_dob = stu_dob;
        this.stu_gender = stu_gender;
        this.stu_phoneNumber = stu_phoneNumber;
        this.stu_facebook = stu_facebook;
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

    public String getStu_address() {
        return stu_address;
    }

    public int getStu_dob() {
        return stu_dob;
    }

    public int getStu_gender() {
        return stu_gender;
    }

    public String getStu_phoneNumber() {
        return stu_phoneNumber;
    }

    public String getStu_facebook() {
        return stu_facebook;
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

    public void setStu_address(String stu_address) {
        this.stu_address = stu_address;
    }

    public void setStu_dob(int stu_dob) {
        this.stu_dob = stu_dob;
    }

    public void setStu_gender(int stu_gender) {
        this.stu_gender = stu_gender;
    }

    public void setStu_phoneNumber(String stu_phoneNumber) {
        this.stu_phoneNumber = stu_phoneNumber;
    }

    public void setStu_facebook(String stu_facebook) {
        this.stu_facebook = stu_facebook;
    }

    public void showInfo() {
        String info = "MaSV: " + this.stu_id + " | TenSV: " + this.stu_name + " | Tuoi: " + this.stu_age + " | Dia chi: " + this.stu_address + " | Nam sinh: " + this.stu_dob + " | Gioi tinh: ";
        if (this.stu_gender == 1) {
            info += "Nam";
        } else {
            info += "Nu";
        }
        info += " | SDT: " + this.stu_phoneNumber + " | Facebook: " + this.stu_facebook;
        System.out.println(info);
    }
}
