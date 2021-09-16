package com.techreturners.cats;

interface Cat {

    void goToSleep();
    void wakeUp();

    default String run() {
        return "I run really fast";
    }

}
