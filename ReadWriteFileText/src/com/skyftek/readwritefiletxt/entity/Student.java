package com.skyftek.readwritefiletxt.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private int student_id;
    private String student_name;
    private Date student_dob;
    private float student_mark;
    private String student_ranked;

    public Student() {
    }

    public Student(int student_id, String student_name, Date student_dob, float student_mark, String student_ranked) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_dob = student_dob;
        this.student_mark = student_mark;
        this.student_ranked = student_ranked;
    }

    public void inputInfo(Scanner scanner){
        scanner.nextLine();
        System.out.println("- Input Student name:");
        this.student_name = scanner.nextLine();
        System.out.println("- Input Date of birth (dd/MM/yyyy):");
        String dob = scanner.nextLine();
        try {
            this.student_dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
            System.out.println("- Input Student mark:");
            this.student_mark = scanner.nextFloat();
            if(this.student_mark > 10 || this.student_mark < 0){
                System.err.println(">> Invalid Data. - " + this.student_mark);
            }
        } catch (ParseException e) {
            System.err.println(">> Invalid Data. - \"" + dob + "\"");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        if(this.student_mark >= 9.75){
            student_ranked = "A";
        } else if(this.student_mark >= 8.75){
            student_ranked = "A-";
        } else if(this.student_mark >= 8){
            student_ranked = "B+";
        } else if(this.student_mark >= 7.25){
            student_ranked = "B";
        } else if(this.student_mark >= 6.25){
            student_ranked = "B-";
        } else if(this.student_mark >= 5.5){
            student_ranked = "C+";
        } else if(this.student_mark >= 4.75){
            student_ranked = "C";
        } else if(this.student_mark >= 3.75){
            student_ranked = "C-";
        } else if(this.student_mark >= 3){
            student_ranked = "D+";
        } else if(this.student_mark >= 2.75){
            student_ranked = "D";
        } else if(this.student_mark >= 1.75){
            student_ranked = "D-";
        } else if(this.student_mark < 1.75){
            student_ranked = "F";
        }

//        LocalDate localDate = LocalDate.now();
//        String today = DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate);

        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_dob=" + student_dob +
                ", student_mark=" + student_mark +
                ", student_ranked='" + student_ranked + '\'' +
                '}';
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Date getStudent_dob() {
        return student_dob;
    }

    public void setStudent_dob(Date student_dob) {
        this.student_dob = student_dob;
    }

    public float getStudent_mark() {
        return student_mark;
    }

    public void setStudent_mark(float student_mark) {
        this.student_mark = student_mark;
    }

    public String getStudent_ranked() {
        return student_ranked;
    }

    public void setStudent_ranked(String student_ranked) {
        this.student_ranked = student_ranked;
    }
}
