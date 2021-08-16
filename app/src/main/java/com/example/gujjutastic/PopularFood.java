package com.example.gujjutastic;

import java.io.Serializable;

public class PopularFood implements Serializable {


      private String name;
     private String des;
   private String price;
   private Integer imageUrl;
   private int numberInCart;

    public PopularFood(String name, String price, String des,Integer imageUrl) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.des = des;
    }

    public PopularFood(String title, Integer pic, String description, String fee, int numberInCart) {
        this.name = title;
        this.imageUrl = pic;
        this.des = description;
        this.price = fee;
        this.numberInCart = numberInCart;
    }

    public int getNumberInCart() { return numberInCart; }

    public void setNumberInCart(int numberInCart) { this.numberInCart = numberInCart; }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getPrice() { return price; }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDes() { return des; }

    public void setDes(String des) { this.des = des; }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }


}


