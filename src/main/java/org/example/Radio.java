package org.example;

public class Radio {
    public int volume;
    public int getVolume() {
        return volume;
    }

    public int numberStation;

    public int getNumberStation() {
        return numberStation;
    }
    public void setVolume(int newVolume) {
        if (newVolume < 100) {
            newVolume = newVolume + 1;
        } else {
            newVolume = 100;
        }
        volume = newVolume;
    }

    public void setReduceVolume(int newVolume) {
        if (newVolume > 0) {
            newVolume = newVolume - 1;
        } else {
            newVolume = 0;
        }
        volume = newVolume;
    }

    public void setIncreaseNumberStation(int newNumberStation) {
        if (newNumberStation < 9) {
            newNumberStation = newNumberStation +1;
        } else {
            newNumberStation = 0;
        }
        numberStation = newNumberStation;
    }

    public void setReduceNumberStation(int newNumberStation) {
        if (newNumberStation > 0) {
            newNumberStation = newNumberStation - 1;
        } else {
            newNumberStation = 9;
        }
        numberStation = newNumberStation;
    }

}

