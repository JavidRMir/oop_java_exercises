package com.techreturners.cats;

public class CheetahCat extends Felis {

    public CheetahCat() {
        super.setCatType("wild");
        super.setAverageHeight(94);
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }


}
