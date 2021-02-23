package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> songOfText = new ArrayList<>();
        songOfText.add("Ветер с моря дул");songOfText.add("Нагонял беду");
        songOfText.add("И сказал ты мне");songOfText.add("Больше не приду");
        for(int i =0;i <songOfText.size();i++){
          String line=  songOfText.get(i);
            songOfText.add(i++,line);
        }
        System.out.println("Coздался лист и повторилось два раза первое предложение");
        System.out.println(songOfText);
        ArrayList<String > newSongText = new ArrayList<>();
         for(int i=0;i<songOfText.size();i++){
            if(songOfText.get(i).length()>=15){
              String line = songOfText.get(i);
              newSongText.add(line);
            }
         }
        System.out.println("Предложение >= 15 символов перенеслись в другой список.");
        System.out.println(newSongText);
        System.out.println(" Тут удалилось предложение и сказал ты мне один раз ");
         newSongText.remove("И сказал ты мне");
        System.out.println(newSongText);

        // Задание B
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Integer> newInts = new ArrayList<>();
        Random rand = new Random();

        int listSize =50;
        for(int i =0;i<listSize;i++){
            ints.add(i,rand.nextInt((100-1)+1)+1);
        }
        System.out.println("Создался массив из рандомных чисел от 1 до 100");
        System.out.println(ints);

        for(int i =0;i<ints.size();i++){
            int element = ints.get(i);
            if(element%2==0){
               newInts.add(element);
               ints.remove(i);

            }

        }
        System.out.println("Разделили старый массив на четный массив :\n"+newInts);
        System.out.println("В старом массиве остались только нечетные числа:\n"+ints);






}
}