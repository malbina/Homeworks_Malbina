package com.company.Shop;

import com.company.shopper.Consumer;
import com.company.product.Product;

public class Ozon extends Shop {
    public Ozon(){
        super(30,5,5,20);
    }
    @Override
    public void sell(Product product) {
        System.out.println("Ozon sells "+product.getName()+"for"+product.getPrice());

    }
    @Override
    public void delivery(Consumer consumer, Product product) {
        System.out.println("Happy shopping by Ozon! \nDelivery\nName of product:"+product.getName()+"\nThe Price:"+product.getPrice()+" Som"+
                "\nDelivery location: "+consumer.getAddress()+"\nRecipient's name:"+consumer.getNameAndSurname() +"\nDelivery payment for 1 Kg: "+getDeliveryPaymentfor1Kg()+" Som"+"\nPayment: "+(product.getPrice()+getDeliveryPaymentfor1Kg())+" Som");
    }

    @Override
    public void order(Product product) {
        System.out.println("\nYou order by Ozon: "+"\nName of Product: "+product.getName()+ "\nPrice: "+product.getPrice()+" Som");
    }





}
