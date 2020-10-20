package ru.netology;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Radio {
    private int maxStation = 10;
    private int minStation;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseCurrentStation() {

        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            this.currentStation++;
        }
    }

    public void decreaseCurrentStation() {

        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            this.currentStation--;
        }
    }

    public void increaseCurrentVolume() {

        if (currentVolume == maxVolume) {
            System.out.println("Volume is max");
        } else {
            this.currentVolume++;
        }
    }

    public void decreaseCurrentVolume() {

        if (currentVolume == minVolume) {
            System.out.println("Volume is min");
        } else {
            this.currentVolume--;
        }
    }
}
