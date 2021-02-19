package com.company;

import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[]args)  throws IOException {
        File file =new File("Homework28.txt");
       try{
           isFileMoreThan100Mb(file);
       }
       catch (IllegalStateException ilexp){
           ilexp.printStackTrace();
       }

       try {
           FileReader fr = new FileReader("Homework");
           Scanner sc = new Scanner(fr);
           while (sc.hasNextLine()) System.out.println(sc.nextLine());
       }
       catch (FileNotFoundException ex){
           System.out.println(" Ошибка! Файл не найден!");
           ex.printStackTrace();
       }
        FileWriter fw =new FileWriter("newHomework28.txt");

        FileReader fr = new FileReader("Homework28.txt");
       Scanner sc = new Scanner(fr);
       while(sc.hasNextLine()){
           String line =sc.nextLine();
           line=line.replaceAll("\\s","");
           fw.write(line);
       }
       fw.close();
       fr.close();









    }
    public static void isFileMoreThan100Mb (File file){
        if(file.length()>100){
            throw new IllegalStateException("Код больше 100 байт");
        }
    }
}
