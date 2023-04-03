package org.example;

public class Radio {
    private int volume;

    int getVolume() {
        return volume;
    }

    private int numberStation;

    int getNumberStation() {
        return numberStation;
    }

    public void setVolume(int newVolume) {

        if (newVolume > 100) {
            newVolume = 100;
        }
        volume = newVolume;
    }

    public void setReduceVolume(int newVolume) {
        if (newVolume < 0) {
            newVolume = 0;
        }
        volume = newVolume;
    }

    public void setIncreaseNumberStation(int newNumberStation) {
        if (newNumberStation > 9) {
            newNumberStation = 9;
        }
        numberStation = newNumberStation;
    }

    public void setReduceNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
           newNumberStation = 0;
        }
        numberStation = newNumberStation;
    }

    public void volumeUp() {
        int target = volume + 1;
        if (target > 100) {
            target = 100;
        }
        volume = target;

    }

    public void volumeDown() {
        int target = volume - 1;
        if (target < 0) {
            target = 0;
        }
        volume = target;
    }

    public void NumberStationUp() {
        int target = numberStation + 1;
        if (target > 9) {
            target = 0;
        }
        numberStation = target;

    }

    public void NumberStationDown() {
        int target = numberStation - 1;
        if (target < 0) {
            target = 9;
        }
        numberStation = target;

    }


}

