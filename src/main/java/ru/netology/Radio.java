package ru.netology;

public class Radio {
    private int maxStation;
    private int minStation;
    private int currentStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentStation() {

        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            this.currentStation++;
        }
    }

    public void decreaseCurrentStation() {

        if (currentStation == minStation) {
            currentStation = 9;
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
