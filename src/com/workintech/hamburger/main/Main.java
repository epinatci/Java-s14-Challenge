package com.workintech.hamburger.main;

import com.workintech.hamburger.enums.BreadRollType;
import com.workintech.hamburger.enums.DrinkType;
import com.workintech.hamburger.enums.Type;
import com.workintech.hamburger.model.*;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", 3.56, BreadRollType.WRAP);

        hamburger.addAddition("Tomato", 0.27);

        hamburger.addAddition("Lettuce", 0.75);

        hamburger.addAddition("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, BreadRollType.SANDWICH);

        healthyBurger.addAddition("Egg", 5.43);

        healthyBurger.addHealthyAddition("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger(new Drink(DrinkType.COKE),new Cips(Type.CURLY));

        db.addAddition("Should not do this", 50.53);

        db.itemizeHamburger();
    }
}