package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) { this.currentTemperature = currentTemperature; }

    public void increaseCurrentTemperature() {

        if (currentTemperature >= maxTemperature) {
            currentTemperature = maxTemperature;
        } else if (currentTemperature < minTemperature) {
            currentTemperature = minTemperature;
        } else {
            this.currentTemperature++;
        }
    }

    public void decreaseCurrentTemperature() {

        if (currentTemperature > maxTemperature) {
            currentTemperature = maxTemperature;
        } else if (currentTemperature <= minTemperature) {
            currentTemperature = minTemperature;
        } else {
            this.currentTemperature--;
        }
    }
}


