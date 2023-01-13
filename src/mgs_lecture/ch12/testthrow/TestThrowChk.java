package mgs_lecture.ch12.testthrow;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrowChk {
    public static void method() throws FileNotFoundException {
        FileReader file = new FileReader("abc.txt");
        BufferedReader fileInput = new BufferedReader(file);
        throw new FileNotFoundException();
    }

    // main method
    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("나머지 코드...");
    }
}