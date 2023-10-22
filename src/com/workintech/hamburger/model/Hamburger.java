package com.workintech.hamburger.model;

import com.workintech.hamburger.enums.BreadRollType;

public class Hamburger implements Addable {

    private String name;
    private String meat;
    private double price;
    private BreadRollType breadRollType;

    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String name, double price, BreadRollType breadRollType) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
        this.meat = "Normal";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(BreadRollType breadRollType) {
        this.breadRollType = breadRollType;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public void setAddition1(Addition addition1) {
        this.addition1 = addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public void setAddition2(Addition addition2) {
        this.addition2 = addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public void setAddition3(Addition addition3) {
        this.addition3 = addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public void setAddition4(Addition addition4) {
        this.addition4 = addition4;
    }

    @Override
    public void addAddition(String name, double price) {
        if(addition1==null){
            addition1 = new Addition(name,price);
        } else if (addition2 == null) {
            addition2 = new Addition(name, price);
        } else if (addition3 == null) {
            addition3 = new Addition(name, price);
        }else if (addition4 == null) {
            addition4 = new Addition(name, price);
        }else {
            System.out.println("Burger is full");
        }
    }

    public void itemizeHamburger(){
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("BreadRollType: " + breadRollType.name() + "\n");

        if (getAddition1() != null){
            builder.append("Addition1: " + getAddition1().getName() + "\n");
            setPrice(price + getAddition1().getPrice());
        }

        if (getAddition2() != null){
            builder.append("Addition2: " + getAddition2().getName() + "\n");
            setPrice(price + getAddition2().getPrice());
        }

        if (getAddition3() != null){
            builder.append("Addition3: " + getAddition3().getName() + "\n");
            setPrice(price + getAddition3().getPrice());
        }

        if (getAddition4() != null){
            builder.append("Addition4: " + getAddition4().getName() + "\n");
            setPrice(price + getAddition4().getPrice());
        }

        System.out.println(builder);
        System.out.println("Total Price: " + getPrice());

        System.out.println("*******************************************");

    }
}
