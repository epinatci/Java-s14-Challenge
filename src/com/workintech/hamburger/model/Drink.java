package com.workintech.hamburger.model;

import com.workintech.hamburger.enums.DrinkType;

public class Drink {
    private DrinkType type;

    public Drink(DrinkType type) {
        this.type = type;
    }

    public DrinkType getType() {
        return type;
    }
}
