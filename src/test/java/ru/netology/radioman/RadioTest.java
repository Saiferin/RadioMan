package ru.netology.radioman;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private  Radio newRadio = new Radio();

    @Test
    public void numberStationEntered() {
        int enteredNumberStation = 7;
        int expected = 7;
        newRadio.setCurrentNumberStation(enteredNumberStation);
        int actual = newRadio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "NumberStationForward,0,1",
            "NumberStationForward,5,6",
            "NumberStationForward,9,0",
    })
    public void numberStationNext(String name, int currentNumberStation, int expected) {
        newRadio.setCurrentNumberStation(currentNumberStation);
        newRadio.numberStationNext();
        int actual = newRadio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "volumeUp_0,0,1",
            "volumeUp_5,5,6",
            "volumeUp_max,10,10"

    })
    public void volumeStationUp(String name, int currentSoundVolume, int expected) {
        newRadio.setCurrentSoundVolume(currentSoundVolume);
        newRadio.volumeStationUp();
        int actual = newRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "volumeDown_10,10,9",
            "volumeDown_6,6,5",
            "volumeDown_min,0,0"
    })
    public void volumeStationDoun(String name, int currentSoundVolume, int expected) {
        newRadio.setCurrentSoundVolume(currentSoundVolume);
        newRadio.volumeStationDown();
        int actual = newRadio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }
}