package com.techreturners.cats;

interface Cat {

    public void goToSleep();
    public void wakeUp();

    default public String eat() {
        // implementing classes can override
        return "";
    }

    default public void run() {
        // implementing classes can override
    }

}
