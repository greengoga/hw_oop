package ru.netology.hw_oop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio rem = new Radio();

        rem.setCurrentStation(3);

        int expected = 3;
        int actual = rem.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationTo0() {
        Radio rem = new Radio();

        rem.setCurrentStation(9);
        rem.nextStation();

        int expected = 0;
        int actual = rem.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationTo9() {
        Radio rem = new Radio();

        rem.setCurrentStation(0);
        rem.prevStation();

        int expected = 9;
        int actual = rem.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVol() {
        Radio rem = new Radio();

        rem.setCurrentVolume(21);

        int expected = 21;
        int actual = rem.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVol() {
        Radio rem = new Radio();

        rem.setCurrentVolume(21);
        rem.increaseVolume();

        int expected = 22;
        int actual = rem.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVol() {
        Radio rem = new Radio();

        rem.setCurrentVolume(21);
        rem.decreaseVolume();

        int expected = 20;
        int actual = rem.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio rem = new Radio();

        rem.setCurrentStation(3);
        rem.nextStation();

        int expected = 4;
        int actual = rem.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio rem = new Radio();

        rem.setCurrentStation(3);
        rem.prevStation();

        int expected = 2;
        int actual = rem.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void StationIs0() {
        Radio rem = new Radio();

        rem.setCurrentStation(0);

        int expected = 0;
        int actual = rem.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationIs9() {
        Radio rem = new Radio();

        rem.setCurrentStation(10);

        int expected = 0;
        int actual = rem.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationBelow0() {
        Radio rem = new Radio();

        rem.setCurrentStation(-1);

        int expected = 0;
        int actual = rem.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolIsBelow0() {
        Radio rem = new Radio();

        rem.setCurrentVolume(-1);

        int expected = 0;
        int actual = rem.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolIs100() {
        Radio rem = new Radio();

        rem.setCurrentVolume(101);

        int expected = 0;
        int actual = rem.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolAboveMax() {
        Radio rem = new Radio();

        rem.setCurrentVolume(100);
        rem.increaseVolume();

        int expected = 100;
        int actual = rem.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolBelowMin() {
        Radio rem = new Radio();

        rem.setCurrentVolume(0);
        rem.decreaseVolume();

        int expected = 0;
        int actual = rem.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}