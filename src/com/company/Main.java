package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

           FileReader fr = new FileReader("songSia.txt");
           Scanner sc = new Scanner(fr);
           for (int i = 1; sc.hasNextLine(); i++) {
               System.out.println(sc.nextLine());
           }
           fr.close();

        FileWriter fw = new FileWriter("CheapThrills.txt");
        fw.write("Исполнитель: Sia\n");
        fw.write("Название песни: Cheap Thrills\n");
        fw.write("Жанр песни: Pop\n");
        fw.write("Tекст песни:\n" +
                "Come on, come on, turn the radio on\n" +
                "It's Friday night, and it won't be long\n" +
                "Gotta do my hair, put my make-up on\n" +
                "It's Friday night, and it won't be long\n" +
                "'Til I hit the dance floor, hit the dance floor\n" +
                "I got all I need");


        fw.close();





    }
}
