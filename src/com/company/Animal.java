package com.company;

public class Animal {

        int age;
        String name;
        String breed;
        double weight;

        public Animal () {}

        public Animal ( int age,String name,String breed, double weight ){
            this.age = age ;
            this.name = name;
            this.breed = breed;
            this.weight = weight;

        }
        public void setAge ( int age){
            this.age = age;
        }
        public void setName (String name){
            this.name = name;
        }

        public void setBreed ( String breed){
            this.breed = breed;
        }
        public void  setWeight ( double weight){
            this.weight = weight;
        }
        public int getAge (){
            return age;
        }
        public String getName (){
            return name;
        }
        public String getBreed (){
            return breed;
        }
        public double getWeight (){
            return weight;
        }

        public void sayAboutMe (){
            System.out.println(" Имя питомца : " +name+ "\n Возраст: " + age+"\n Порода"+ breed+"\n Вес:"+weight);
        }

    }


