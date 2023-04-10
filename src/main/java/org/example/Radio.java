package org.example;

public class Radio {
    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int numberStation;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;

    int totalStations = 10;

    int getMaxVolume() {
        return maxVolume;
    }

    int getMinVolume() {
        return minVolume;
    }

    int getVolume() {
        return volume;
    }

    int getNumberStation() {
        return numberStation;
    }

    public void setVolume(int newVolume) {
        if (newVolume > maxVolume) {
            newVolume = maxVolume;
        }
        volume = newVolume;
    }

    public void setReduceVolume(int newVolume) {
        if (newVolume < minVolume) {
            newVolume = minVolume;
        }
        volume = newVolume;
    }

    public void setIncreaseNumberStation(int newNumberStation) {
        if (newNumberStation > maxNumberStation) {
            newNumberStation = maxNumberStation;
        }
        numberStation = newNumberStation;
    }

    public void setReduceNumberStation(int newNumberStation) {
        if (newNumberStation < minNumberStation) {
            newNumberStation = minNumberStation;
        }
        numberStation = newNumberStation;
    }

    public Radio(int totalStations) {
        this.minNumberStation = 0;
        this.maxNumberStation = 29;
    }

    public Radio() {
    }

    public void volumeUp() {
        int target = volume + 1;
        if (target > maxVolume) {
            target = maxVolume;
        }
        volume = target;
    }

    public void volumeDown() {
        int target = volume - 1;
        if (target < minVolume) {
            target = minVolume;
        }
        volume = target;
    }

    public void NumberStationUp() {
        int target = numberStation + 1;
        if (target > maxNumberStation) {
            target = minNumberStation;
        }
        numberStation = target;

    }

    public void NumberStationDown() {
        int target = numberStation - 1;
        if (target < minNumberStation) {
            target = maxNumberStation;
        }
        numberStation = target;

    }

}

