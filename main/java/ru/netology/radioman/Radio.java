package ru.netology.radioman;

import java.security.PrivateKey;

public class Radio {
    private int currentNumberStation;
    private int currentSoundVolume;

    public void setCurrentNumberStation(int currentNumberStation) {
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void numberStationNext() {
        if (currentNumberStation == 9) {
            this.currentNumberStation = 0;
            return;
        }
        currentNumberStation++;

    }


    public void volumeStationUp() {
        if (currentSoundVolume >= 10) {
            currentSoundVolume = 10;
        } else {
            currentSoundVolume++;
        }

    }

    public void volumeStationDown() {
        if (currentSoundVolume <= 0) {
            currentSoundVolume = 0;
        } else {
            currentSoundVolume--;
        }
    }
}