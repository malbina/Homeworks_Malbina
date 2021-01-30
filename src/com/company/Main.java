package com.company;

public class Main {

    public static void main(String[] args) {
        Farm farm1 = new Farm("Краснодарская 1,Бишкек,Кыргызстан","Усубалиев Кайрат Асановчи",5,2,3,"Райская ферма");
        Farm farm2 = new Farm("Тыныстова 1/2,Бишкек,Кыргызстан","Аматалиева Гульзат Мыктыбекова",1,1,1,"Долина животных");
        farm1.printInfo();
        farm2.printInfo();

    }
}
