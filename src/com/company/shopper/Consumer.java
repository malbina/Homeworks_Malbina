package com.company.shopper;

import com.company.product.Product;
import com.company.Shop.Alibaba;
import com.company.Shop.Amazon;
import com.company.Shop.Ozon;

public class Consumer {
    private String nameAndSurname;
    private String address;
    private Amazon amazon;
   private Ozon ozon;
   private Alibaba alibaba;
   private Product product;


    public void sayOptShop(Product product){
        if (product.getPrice()>10000){
            System.out.println("You schould buy by ");
        }else System.out.println("Your product's price is not more then 10000, so you can buy anywhere");
    }
    public void chooseOptShop (Amazon amazon,Ozon ozon,Alibaba alibaba,Product product) {

        if (product.getPrice() > 10000) {
            if (amazon.getRiskOfLosing() < ozon.getRiskOfLosing() && amazon.getRiskOfLosing() < alibaba.getRiskOfLosing()) {
                System.out.println("Buy by Amazon, because the risk of losing product is only "+amazon.getRiskOfLosing()+" %");
            } else if (ozon.getRiskOfLosing() < alibaba.getRiskOfLosing() && ozon.getRiskOfLosing() < alibaba.getRiskOfLosing()) {
                System.out.println("Buy by Ozon,because the risk of losing product is only "+ozon.getRiskOfLosing()+" %");
            } else if (alibaba.getRiskOfLosing()< amazon.getRiskOfLosing() && alibaba.getRiskOfLosing()<ozon.getRiskOfLosing()){
                System.out.println("Buy by Alibaba,because the risk of losing product is only "+alibaba.getRiskOfLosing()+" %");
            }
        }else System.out.println("Your Products Price is not more then 10000 , so you can buy anywhere");
    }

    public Consumer(String nameAndSurname, String address) {
        this.nameAndSurname = nameAndSurname;
        this.address = address;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
