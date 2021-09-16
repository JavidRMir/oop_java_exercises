package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends Felis{

    public DomesticCat() {
        super.setCatType("domestic");
        super.setAverageHeight(23);
    }


    @Override
    public String eat() {
        String[] catSounds = {"Purrrrrrr", "It will do I suppose"};
        Random random = new Random();
        return catSounds[random.nextInt(catSounds.length)];
    }
}
