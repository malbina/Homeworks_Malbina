package com.company.caller;

import com.company.Shop.Alibaba;
import com.company.Shop.Amazon;
import com.company.Shop.Ozon;
import com.company.product.Product;
import com.company.shopper.Consumer;

public class Main {

    public static void main(String[] args) {
    Consumer consumer = new Consumer("Malbina Ramilova","04994 Düsseldorf,Hegnerstr.1");
    Product product= new Product("Iphone 8",20000);
    Amazon amazon =  new Amazon();
    Ozon ozon = new Ozon();
    Alibaba alibaba= new Alibaba();
        System.out.println("_________________________________________________________________");
   consumer.chooseOptShop(amazon,ozon,alibaba,product);
        System.out.println("___________________________________________________________________");
   amazon.order(product);
        System.out.println("____________________________________________________________________");
   amazon.delivery(consumer,product);
        System.out.println("_______________________________________");

    }
}
