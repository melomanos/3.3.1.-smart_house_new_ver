package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldIncreaseCurrentTemperatureInRange() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        int currentTemperature = 23;
        int expected = 24;

        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureInRange() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(20);
        int currentTemperature = 23;
        int expected = 22;

        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureOverRange() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        int currentTemperature = 35;
        int expected = 30;

        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureOverRange() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(20);
        int currentTemperature = 40;
        int expected = 25;

        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureUnderRange() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        int currentTemperature = 10;
        int expected = 16;

        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureUnderRange() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(20);
        int currentTemperature = 15;
        int expected = 20;

        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();

        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}