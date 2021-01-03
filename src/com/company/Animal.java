package com.company;

public class Animal {

        int age;
        String name;
        String breed;
        double weight;
        String typeOfAnimal;


        public void setAge ( int age){
            if (age>0) this.age = age;
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

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
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
            System.out.println(" Имя питомца : " +name+ "\n Bид животного:"+typeOfAnimal+"\n Возраст: " + age+"\n Порода:"+ breed+"\n Вес:"+weight);
        }

    }


