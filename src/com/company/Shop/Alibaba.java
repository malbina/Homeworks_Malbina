package com.company.Shop;

import com.company.shopper.Consumer;
import com.company.product.Product;

public class Alibaba extends Shop {
    public Alibaba (){
        super(10,9,15,14);
    }
    @Override
    public void sell(Product product) {
        System.out.println("Alibaba sells "+product.getName()+"for"+product.getPrice());

    }
    @Override
    public void delivery(Consumer consumer, Product product) {
        System.out.println("Happy shopping by Alibaba! \nDelivery\n Name of product:"+product.getName()+"\nThe Price:"+product.getPrice()+" Som"+
                "\nDelivery location: "+consumer.getAddress()+"\nRecipient's name"+consumer.getNameAndSurname() +"\nDelivery payment for 1 Kg "+getDeliveryPaymentfor1Kg()+" Som"+"\nPayment: "+(product.getPrice()+getDeliveryPaymentfor1Kg())+" Som");
    }

    @Override
    public void order(Product product) {
        System.out.println("\nYou order by Alibaba: "+"\nName of Product: "+product.getName()+ "\nPrice: "+product.getPrice()+" Som");
    }

}
