package ru.netology.hw_oop.service;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int  defaultStationsQty = 10;
    private int stationsQty = defaultStationsQty;

    public Radio(int stationsQty) {
        this.stationsQty = stationsQty;
    }

    public Radio() { //конструктор по умолч.
        this.stationsQty = defaultStationsQty;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation >= stationsQty) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void nextStation() {
        if (currentStation == stationsQty - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = stationsQty - 1;
        } else {
            currentStation--;
        }
    }

}