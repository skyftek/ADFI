package com.skyftek.readwritefiletxt.controller;

import com.skyftek.readwritefiletxt.entity.Student;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Function {
    public void writeNewFile(ArrayList<Student> stu_list) {
        File f = new File("Student.txt");
        try {
            // Hold old data and continue to write new data to file
            // FileWriter fw = new FileWriter("Student.txt", true);

            // Write to new file "Student.txt"
            FileWriter fw = new FileWriter("Student.txt", false);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Student student : stu_list) {
                bw.write(student.toString());
                bw.newLine();
            }

            bw.close();
            System.out.println(">> Complete adding data to Student.txt!");
        } catch (IOException e) {
            System.err.println(">> Failed to add data to Student.txt");
            e.printStackTrace();
        }
    }

    public void readExistFile(ArrayList<Student> stu_list) {
        try (FileReader fr = new FileReader("Student.txt")) {
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                line = line.substring(8, (line.length() - 1));
                int status = Function.checkExist(stu_list, Function.loadData(line));
                if (status == 0) {
                    stu_list.add(Function.loadData(line));
                }
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.err.println(">> File Not Found!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Student s : stu_list) {
            System.out.println(s.toString());
        }
    }

    public static Student loadData(String line) {
        String[] obj = line.split(", ");
        Student s = new Student();
        int index = obj[0].indexOf('=');
        s.setStudent_id(Integer.parseInt(obj[0].substring(index + 1)));
        index = obj[1].indexOf('=');
        s.setStudent_name(obj[1].substring(index + 1));
        index = obj[2].indexOf('=');
        Date t_dob = null;
        try {
            t_dob = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy").parse(obj[2].substring(index + 1));
        } catch (ParseException e) {
            System.err.println(">> Invalid Data! - dob");
            e.printStackTrace();
        }
        s.setStudent_dob(t_dob);
        index = obj[3].indexOf('=');
        s.setStudent_mark(Float.parseFloat(obj[3].substring(index + 1)));
        index = obj[4].indexOf('=');
        s.setStudent_ranked(obj[4].substring(index + 1));
        return s;
    }

    public static int checkExist(ArrayList<Student> stu_list, Student student) {
        int status = 0;
        for (Student s : stu_list) {
            if ((s.equals(student))) {
                status = 1;
            }
        }
        return status;
    }
}
