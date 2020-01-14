package com.skyftek.readwritefiletxt.controller;

import com.skyftek.readwritefiletxt.entity.Student;

import java.io.*;
import java.util.ArrayList;

public class Function {
    public void writeNewFile(ArrayList<Student> stu_list) {
        File f = new File("Student.txt");
        if(f.exists() && !f.isDirectory()) {
            try {
                // Write to current file "Student.txt"
                // FileWriter fw = new FileWriter("Student.txt", true);

                // Write to new file "Student.txt"
                FileWriter fw = new FileWriter(new File("Student.txt"));
                BufferedWriter bw = new BufferedWriter(fw);

                for (Student student : stu_list) {
                    bw.write(student.toString());
                    bw.newLine();
                }

                bw.close();
                System.out.println(">> Complete adding data to Student.txt!");
            } catch (IOException e) {
                System.err.println(">> Failed to add data to Student.txt");;
                e.printStackTrace();
            }
        }
    }

    public void readExistFile() {
        try (FileReader fr = new FileReader("Student.txt")) {
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.err.println(">> File Not Found!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
