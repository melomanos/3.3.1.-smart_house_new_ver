package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldIncreaseCurrentStationInRange() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        int currentStation = 7;
        int expected = 8;

        radio.setCurrentStation(currentStation);
        radio.increaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationInRange() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        int currentStation = 5;
        int expected = 4;

        radio.setCurrentStation(currentStation);
        radio.decreaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationOverMax() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        int currentStation = 9;
        int expected = 0;

        radio.setCurrentStation(currentStation);
        radio.increaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationUnderMin() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        int currentStation = 0;
        int expected = 9;

        radio.setCurrentStation(currentStation);
        radio.decreaseCurrentStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentVolumeInRange() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        int currentVolume = 7;
        int expected = 8;

        radio.setCurrentVolume(currentVolume);
        radio.increaseCurrentVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeInRange() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        int currentVolume = 5;
        int expected = 4;

        radio.setCurrentVolume(currentVolume);
        radio.decreaseCurrentVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeOverMax() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        int currentVolume = 10;
        int expected = 10;

        radio.setCurrentVolume(currentVolume);
        radio.increaseCurrentVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        int currentVolume = 0;
        int expected = 0;

        radio.setCurrentVolume(currentVolume);
        radio.decreaseCurrentVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }
}
