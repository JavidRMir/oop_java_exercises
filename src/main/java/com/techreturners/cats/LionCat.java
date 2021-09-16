package com.techreturners.cats;

public class LionCat extends Felis {

    public LionCat() {
        super.setCatType("wild");
        super.setAverageHeight(1100);
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }
}
