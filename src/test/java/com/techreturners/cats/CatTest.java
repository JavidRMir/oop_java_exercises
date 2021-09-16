package com.techreturners.cats;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class CatTest {

    DomesticCat domesticCat = new DomesticCat();
    LionCat lionCat = new LionCat();
    CheetahCat cheetahCat = new CheetahCat();

    @Test
    public void checkCatIsAwake() {
        assertFalse(domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        domesticCat.goToSleep();
        assertTrue(domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanWakep() {
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse(domesticCat.isAsleep());
    }

    @Test
    public void checkCatSetting() {
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        assertEquals(1100, lionCat.getAverageHeight());
    }

    @Test
    public void feedTheLion() {
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        assertThat(domesticCat.eat(), anyOf(containsString("Purrrrrrr"),
                containsString("It will do I suppose")));
    }


}