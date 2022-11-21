package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int paperBagPrice;
    private int basePrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg) basePrice = 300;
        else basePrice = 400;
    }

    public int getPrice(){
        this.price += basePrice + extraCheesePrice + extraToppingsPrice + paperBagPrice;
        return this.price;
    }

    public void addExtraCheese(){
        this.extraCheesePrice = 80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg){
            this.extraToppingsPrice = 70;
        }
        else {
            this.extraToppingsPrice = 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.paperBagPrice = 20;
    }

    public String getBill(){
        // your code goes here
        this.price = basePrice + extraCheesePrice + extraToppingsPrice + paperBagPrice;
        bill = "Base Price Of The Pizza: " + this.basePrice + "\n";
        if (extraCheesePrice > 0) bill += "Extra Cheese Added: " + this.extraCheesePrice + "\n";
        if (extraToppingsPrice > 0) bill += "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
        if (paperBagPrice > 0) bill += "Paperbag Added: " + this.paperBagPrice + "\n";
        bill += "Total Price: " + price;

        extraCheesePrice = 0;
        extraToppingsPrice = 0;
        paperBagPrice = 0;

        return this.bill;
    }
}
