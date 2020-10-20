package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldUseConstructorIncreaseCurrentStationInRange() {
        Radio radio = new Radio(10, 0, 7, 0, 0, 0);

        int expected = 8;

        radio.increaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldUseConstructorDecreaseCurrentStationInRange() {
        Radio radio = new Radio(10, 0, 5, 0, 0, 0);

        int expected = 4;

        radio.decreaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldUseConstructorIncreaseCurrentStationOverMax() {
        Radio radio = new Radio(10, 0, 10, 0, 0, 0);

        int expected = 0;

        radio.increaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldUseConstructorDecreaseCurrentStationUnderMin() {
        Radio radio = new Radio(10, 0, 0, 0, 0, 0);

        int expected = 10;

        radio.decreaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentVolumeInRange() {
        Radio radio = new Radio(10, 0, 0, 100, 0, 7);

        int expected = 8;

        radio.increaseCurrentVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeInRange() {
        Radio radio = new Radio(10, 0, 0, 100, 0, 5);

        int expected = 4;

        radio.decreaseCurrentVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeOverMax() {
        Radio radio = new Radio(10, 0, 0, 100, 0, 100);

        int expected = 100;

        radio.increaseCurrentVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeUnderMin() {
        Radio radio = new Radio(10, 0, 0, 100, 0, 0);

        int expected = 0;

        radio.decreaseCurrentVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }
}
