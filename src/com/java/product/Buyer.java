package com.java.product;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    
    void buy(Product p) { //Tv, Computer, Audio
        if(money < p.price) {
        	System.out.println("금액이 부족합니다.");
        	return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p.toString() + "구매완료");
    }
    
}

//Product p = new Tv() // 2개 
//Tv t = new Tv()      // 2개

//p.price
//t.price
