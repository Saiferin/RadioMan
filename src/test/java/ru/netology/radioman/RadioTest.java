package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void numberStationEntered() {
        int enteredNumberStation = 7;
        int expected = 7;
        Radio station = new Radio();
        station.setCurrentNumberStation(enteredNumberStation);
        int actual = station.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "NumberStationForward,0,1",
            "NumberStationForward,5,6",
            "NumberStationForward,9,0",
    })
    public void numberStationNext(String name, int currentNumberStation, int expected) {
        Radio station = new Radio();
        station.setCurrentNumberStation(currentNumberStation);
        station.numberStationNext();
        int actual = station.getCurrentNumberStation();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "volumeUp_0,0,1",
            "volumeUp_5,5,6",
            "volumeUp_max,10,10"

    })
    public void volumeStationUp(String name, int currentSoundVolume, int expected) {
        Radio station = new Radio();
        station.setCurrentSoundVolume(currentSoundVolume);
        station.volumeStationUp();
        int actual = station.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "volumeDown_10,10,9",
            "volumeDown_6,6,5",
            "volumeDown_min,0,0"
    })
    public void volumeStationDoun(String name, int currentSoundVolume, int expected) {
        Radio station = new Radio();
        station.setCurrentSoundVolume(currentSoundVolume);
        station.volumeStationDown();
        int actual = station.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }
}

