package com.company.lesson_30;

import java.io.*;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String text = bf.readLine();
        OutputStream outputStream = new FileOutputStream(text);
        while (true){
            String s = bf.readLine();
            if(s.equals("exit")){
                break;
            }
                outputStream.write((s + "\r\n").getBytes());
        }
    }
}
