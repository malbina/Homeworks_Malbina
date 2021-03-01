package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
       int [] array = new int[10];
        Random random= new Random();
        boolean check=true;
        ArrayList<Integer> arrList =new ArrayList<>();
        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i =0;i< array.length;i++){
            array[i]= random.nextInt(2);
            if(check) {
                System.out.printf("Array: \n");
                check=false;
            }
            System.out.printf("a[%d] = %d\n",i+1,array[i]);
        }
        int [] newArr = sort(array);
        System.out.println("Sorted array: ");
        for(int k =0;k< newArr.length;k++){
            System.out.printf("a[%d] =%d\n",k+1,newArr[k]);
        }
      int sizeOfList = 10;
        for(int i =0;i<sizeOfList;i++){
            arrList.add(i, random.nextInt(2));
        }
        System.out.println("ArrayList: "+arrList);
        System.out.println("Sorted ArrayList: "+sort(arrList));

        for(int i =0;i<sizeOfList;i++){
            linkedList.add(i, random.nextInt(2));
        }
        System.out.println("LinkedList: "+linkedList);
        System.out.println("Sorted LinkedList: "+sort(linkedList));


    }
    public static int [] sort (int [] array){
        for(int i =0;i< array.length;i++){
            for(int j =0;j< array.length-i-1;j++){
                int nextIndex = j+1;
                if(array[j]>array[nextIndex]){
                    int temp=array[j];
                    array[j]=array[nextIndex];
                    array[nextIndex]=temp;
                }
            }
        }return array;
    }

    public static ArrayList sort (ArrayList<Integer>ints){
       for(int i =0;i<ints.size();i++){
           for(int j =0;j<ints.size()-i-1;j++){
           if(ints.get(j)>ints.get(j+1)) {
               int t = ints.get(j);
               ints.set(j, ints.get(j + 1));
               ints.set(j + 1, t);
              }
           }
       }return ints;
       }

  public static LinkedList sort (LinkedList<Integer> ints){
      LinkedList<Integer> newInts = new LinkedList<>();
        for(Integer list : ints){
            if(list==0)
                newInts.addFirst(list);
            else newInts.addLast(list);
        }return newInts;
  }

}
