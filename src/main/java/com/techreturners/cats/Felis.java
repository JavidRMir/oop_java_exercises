package com.techreturners.cats;

public abstract class Felis implements Cat {

    private boolean isSleeping;
    private int averageHeight;
    private String catType;

    public boolean isAsleep() {
        return this.isSleeping;
    }

    public String getSetting() {
        return this.catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public void setAverageHeight(int averageHeight) {
        this.averageHeight = averageHeight;
    }

    public int getAverageHeight() {
        return averageHeight;
    }


    public abstract String eat();

    @Override
    public void goToSleep() {
        this.isSleeping = true;
    }

    @Override
    public void wakeUp() {
        this.isSleeping = false;
    }

}
