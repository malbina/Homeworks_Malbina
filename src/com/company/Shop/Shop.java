package com.company.Shop;

import com.company.shopper.Consumer;
import com.company.product.Product;

public class Shop {
  private  double deliveryPaymentfor1Kg;
  private  int deliveryDuration;
  private  double tax;
  private  double riskOfLosing;
  private Product product;

   public Shop (){}

    public Shop(double deliveryPaymentfor1Kg, int deliveryDuration, double tax, double riskOfLosing) {
        this.deliveryPaymentfor1Kg = deliveryPaymentfor1Kg;
        this.deliveryDuration = deliveryDuration;
        this.tax = tax;
        this.riskOfLosing = riskOfLosing;
    }
    public void sell (Product product){
        System.out.println("Shop\n Sell\n Name of product:"+product.getName()+"\nThe Price: "+product.getPrice());
    }
    public void delivery (Consumer consumer , Product product)
    { System.out.println("Shop\nDelivery\n Name of product:"+product.getName()+"\nThe Price:"+product.getPrice()+
       "\nDelivery location: "+consumer.getAddress()+"\nRecipient's name"+consumer.getNameAndSurname()+"\nDelivery payment for 1 Kg "+getDeliveryPaymentfor1Kg()+"\nPayment: "+(product.getPrice()+getDeliveryPaymentfor1Kg()));
    }
    public void order (Product product) {
        System.out.println("\nYou order: "+"\nName of Product: "+product.getName()+ "\nPrice: "+product.getPrice());
    }

    public double getDeliveryPaymentfor1Kg() {
        return deliveryPaymentfor1Kg;
    }

    public void setDeliveryPaymentfor1Kg(double deliveryPaymentfor1Kg) {
        this.deliveryPaymentfor1Kg = deliveryPaymentfor1Kg;
    }

    public int getDeliveryDuration() {
        return deliveryDuration;
    }

    public void setDeliveryDuration(int deliveryDuration) {
        this.deliveryDuration = deliveryDuration;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getRiskOfLosing() {
        return riskOfLosing;
    }

    public void setRiskOfLosing(double riskOfLosing) {
        this.riskOfLosing = riskOfLosing;
    }
}
