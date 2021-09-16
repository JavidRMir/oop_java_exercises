package com.techreturners.cats;

public class DomesticCat extends Felis{

    public DomesticCat() {
        super.setCatType("domestic");
        super.setAverageHeight(23);
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }
}
