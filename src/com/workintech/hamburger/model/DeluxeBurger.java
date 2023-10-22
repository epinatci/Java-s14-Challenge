package com.workintech.hamburger.model;

import com.workintech.hamburger.enums.BreadRollType;

public class DeluxeBurger extends Hamburger{

    private Drink drink;
    private Cips cips;

    public DeluxeBurger(Drink drink, Cips cips) {
        super("DELUXE_BURGER", 19.10, BreadRollType.DOUBLE_BURGER );
        setMeat("DOUBLE");
        this.cips = cips;
        this.drink = drink;
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("Deluxe burger için yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("DRINK: " + drink.getType().name() + "\n" );
        builder.append("CIPS: " + cips.getType().name() + "\n" );
        System.out.println(builder.toString());
        super.itemizeHamburger();
    }
}
