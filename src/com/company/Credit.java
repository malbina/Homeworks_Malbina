package com.company;

public class Credit {
    private String id;
    private double sum;
    private int duration;
    private double interestRate;
    private static int numOfCredits;
    private static double sumOfCredits;
    private static double aveSum;


    public Credit(String id, double sum, int duration, double interestRate) {
        this.id = id;
        this.sum = sum;
        this.duration = duration;
        this.interestRate = interestRate;
        numOfCredits++;
        sumOfCredits+=sum;
        aveSum=sumOfCredits/numOfCredits;

    }
    public static void getCreditInfo (){
        System.out.println("Number of credits: "+getNumOfCredits()+"\nSum of all credits: "+getSumOfCredits()+"\nAverage amount of credits: "+getAveSum());
    }

    public static int getNumOfCredits (){
        return numOfCredits;
    }
    public static double getSumOfCredits(){
        return sumOfCredits;
    }
    public static double getAveSum (){
        return aveSum;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}