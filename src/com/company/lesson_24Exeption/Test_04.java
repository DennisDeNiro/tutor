package com.company.lesson_24Exeption;

import java.io.*;

public class Test_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstFile = reader.readLine();
        String secondtFile = reader.readLine();

        InputStream inputStream = new FileInputStream(firstFile);
        OutputStream outputStream = new FileOutputStream(secondtFile);

        int count =0;
        while(inputStream.available()>0){
            int data = inputStream.read();
            outputStream.write(data);
            count++;
        }
        System.out.println(count);
    }
}
