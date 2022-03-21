package ru.netology.domein;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @Test
    public void newChane() {
        Radio radioUser = new Radio(30, 10, 50);
        radioUser.setNewChanel(20);
        int expectedUser = 20;//radioUser.getCurrentChanel();
        assertEquals(expectedUser, radioUser.getNewChanel());

        Radio radio = new Radio();
        radio.setNewChanel(6);
        int expected = 6;//radio.getCurrentChanel();
        assertEquals(expected, radio.getNewChanel());
    }

    @Test
    public void newChanelMax() {
        Radio radioUser = new Radio(30, 10, 50);
        radioUser.setNewChanel(29);
        int expectedUser = 29;//radioUser.getCurrentChanel();
        assertEquals(expectedUser, radioUser.getNewChanel());

        Radio radio = new Radio();
        radio.setNewChanel(9);
        int expected = 9;//radio.getCurrentChanel();
        assertEquals(expected, radio.getNewChanel());
    }

    @Test
    public void newChanelMoreMax() {
        Radio radioUser = new Radio(30, 10, 50);
        radioUser.setNewChanel(30);
        int expectedUser = 10;//radioUser.getCurrentChanel();
        assertEquals(expectedUser, radioUser.getNewChanel());

        Radio radio = new Radio();
        radio.setNewChanel(10);
        int expected = 5;//radio.getCurrentChanel();
        assertEquals(expected, radio.getNewChanel());
    }

    @Test
    public void newChanelBorderMax() {
        Radio radioUser = new Radio(30, 10, 50);
        radioUser.setNewChanel(28);
        int expectedUser = 28;//radioUser.getCurrentChanel();
        assertEquals(expectedUser, radioUser.getNewChanel());

        Radio radio = new Radio();
        radio.setNewChanel(8);
        int expected = 8;//radio.getCurrentChanel();
        assertEquals(expected, radio.getNewChanel());
    }

    @Test
    public void newChanelMin() {
        Radio radioUser = new Radio(30, 10, 50);
        radioUser.setNewChanel(0);
        int expectedUser = 0;//radioUser.getCurrentChanel();
        assertEquals(expectedUser, radioUser.getNewChanel());

        Radio radio = new Radio();
        radio.setNewChanel(0);
        int expected = 0;//radio.getCurrentChanel();
        assertEquals(expected, radio.getNewChanel());
    }

    @Test
    public void newChanelLowMin() {
        Radio radioUser = new Radio(30, 10, 50);
        radioUser.setNewChanel(-1);
        int expectedUser = 10;//radioUser.getCurrentChanel();
        assertEquals(expectedUser, radioUser.getNewChanel());

        Radio radio = new Radio();
        radio.setNewChanel(-1);
        int expected = 5;//radio.getCurrentChanel();
        assertEquals(expected, radio.getNewChanel());
    }

    @Test
    public void newChanelBorderMin() {
        Radio radioUser = new Radio(30, 10, 50);
        radioUser.setNewChanel(1);
        int expectedUser = 1;//radioUser.getCurrentChanel();
        assertEquals(expectedUser, radioUser.getNewChanel());

        Radio radio = new Radio();
        radio.setNewChanel(1);
        int expected = 1;//radio.getCurrentChanel();
        assertEquals(expected, radio.getNewChanel());
    }

    @Test
    void newChanelCurrentSameNew() {
        Radio radioUser = new Radio(30, 11, 50);
        radioUser.setNewChanel(11);
        int expectedUser = 11;//radioUser.getCurrentChanel();
        assertEquals(expectedUser, radioUser.getNewChanel());

        Radio radio = new Radio();
        radio.setNewChanel(5);
        int expected = 5;//radio.getCurrentChanel();
        assertEquals(expected, radio.getNewChanel());
    }

    @Test
    public void nextChanel() {
        Radio radioUser = new Radio(30, 10, 50);
        radioUser.setNextChanel(10);
        int expectedUser = 11;
        assertEquals(expectedUser, radioUser.getNextChanel());

        Radio radio = new Radio();
        radio.setNextChanel(5);
        int expected = 6;
        assertEquals(expected, radio.getNextChanel());
    }

    @Test
    public void nextChanelCurrentMin() {
        Radio radioUser = new Radio(30, 0, 50);
        radioUser.setNextChanel(0);
        int expectedUser = 1;
        assertEquals(expectedUser, radioUser.getNextChanel());

        Radio radio = new Radio();
        radio.setNextChanel(0);
        int expected = 1;
        assertEquals(expected, radio.getNextChanel());
    }

    @Test
    void nextChanelCurrentBorderMin() {
        Radio radioUser = new Radio(30, 1, 50);
        radioUser.setNextChanel(1);
        int expectedUser = 2;
        assertEquals(expectedUser, radioUser.getNextChanel());

        Radio radio = new Radio();
        radio.setNextChanel(1);
        int expected = 2;
        assertEquals(expected, radio.getNextChanel());
    }

    @Test
    void nextChanelCurrentLessMin() {
        Radio radioUser = new Radio(30, -1, 50);
        radioUser.setNextChanel(-1);
        int expectedUser = 0;
        assertEquals(expectedUser, radioUser.getNextChanel());

        Radio radio = new Radio();
        radio.setNextChanel(-1);
        int expected = 0;
        assertEquals(expected, radio.getNextChanel());
    }

    @Test
    void nextChanelLessMin() {
        Radio radioUser = new Radio(30, -1, 50);
        radioUser.setNextChanel(-2);
        int expectedUser = -1;
        assertEquals(expectedUser, radioUser.getNextChanel());

        Radio radio = new Radio();
        radio.setNextChanel(-1);
        int expected = 0;
        assertEquals(expected, radio.getNextChanel());
    }

    @Test
    void nextChanelCurrentMax() {
        Radio radioUser = new Radio(30, 29, 50);
        radioUser.setNextChanel(29);
        int expectedUser = 0;
        assertEquals(expectedUser, radioUser.getNextChanel());

        Radio radio = new Radio();
        radio.setNextChanel(9);
        int expected = 0;
        assertEquals(expected, radio.getNextChanel());
    }

    @Test
    void nextChanelCurrentMoreMax() {
        Radio radioUser = new Radio(30, 30, 50);
        radioUser.setNextChanel(30);
        int expectedUser = 0;
        assertEquals(expectedUser, radioUser.getNextChanel());

        Radio radio = new Radio();
        radio.setNextChanel(10);
        int expected = 0;
        assertEquals(expected, radio.getNextChanel());
    }

    @Test
    void nextChanelCurrentBorderMax() {
        Radio radioUser = new Radio(30, 28, 50);
        radioUser.setNextChanel(28);
        int expectedUser = 29;
        assertEquals(expectedUser, radioUser.getNextChanel());

        Radio radio = new Radio();
        radio.setNextChanel(8);
        int expected = 9;
        assertEquals(expected, radio.getNextChanel());
    }

    @Test
    public void prevChanel() {
        Radio radioUser = new Radio(30, 10, 50);
        radioUser.setPrevChanel(10);
        int expectedUser = 9;
        assertEquals(expectedUser, radioUser.getPrevChanel());

        Radio radio = new Radio();
        radio.setPrevChanel(5);
        int expected = 4;
        assertEquals(expected, radio.getPrevChanel());
    }

    @Test
    public void prevChanelCurrentMin() {
        Radio radioUser = new Radio(30, 0, 50);
        radioUser.setPrevChanel(0);
        int expectedUser = 29;
        assertEquals(expectedUser, radioUser.getPrevChanel());

        Radio radio = new Radio();
        radio.setPrevChanel(0);
        int expected = 9;
        assertEquals(expected, radio.getPrevChanel());
    }

    @Test
    public void prevChanelCurrentLessMin() {
        Radio radioUser = new Radio(30, 0, 50);
        radioUser.setPrevChanel(-1);
        int expectedUser = 29;
        assertEquals(expectedUser, radioUser.getPrevChanel());

        Radio radio = new Radio();
        radio.setPrevChanel(-1);
        int expected = 9;
        assertEquals(expected, radio.getPrevChanel());
    }

    @Test
    public void prevChanelCurrentBorderMin() {
        Radio radioUser = new Radio(30, 0, 50);
        radioUser.setPrevChanel(1);
        int expectedUser = 0;
        assertEquals(expectedUser, radioUser.getPrevChanel());

        Radio radio = new Radio();
        radio.setPrevChanel(1);
        int expected = 0;
        assertEquals(expected, radio.getPrevChanel());
    }

    @Test
    public void prevChanelCurrentMax() {
        Radio radioUser = new Radio(30, 0, 50);
        radioUser.setPrevChanel(29);
        int expectedUser = 28;
        assertEquals(expectedUser, radioUser.getPrevChanel());

        Radio radio = new Radio();
        radio.setPrevChanel(9);
        int expected = 8;
        assertEquals(expected, radio.getPrevChanel());
    }

    @Test
    public void prevChanelCurrentMoreMax() {
        Radio radioUser = new Radio(30, 0, 50);
        radioUser.setPrevChanel(30);
        int expectedUser = 29;
        assertEquals(expectedUser, radioUser.getPrevChanel());

        Radio radio = new Radio();
        radio.setPrevChanel(10);
        int expected = 9;
        assertEquals(expected, radio.getPrevChanel());
    }

    @Test
    public void prevChanelCurrentBorderMax() {
        Radio radioUser = new Radio(30, 0, 50);
        radioUser.setPrevChanel(28);
        int expectedUser = 27;
        assertEquals(expectedUser, radioUser.getPrevChanel());

        Radio radio = new Radio();
        radio.setPrevChanel(8);
        int expected = 7;
        assertEquals(expected, radio.getPrevChanel());
    }

    @Test
    public void addVolume() {
        Radio radio = new Radio(30, 0, 10);
        radio.setAddVolume();
        int expected = 11;
        assertEquals(expected, radio.getAddVolume());
    }

    @Test
    public void addVolumeCurrentMin() {
        Radio radio = new Radio(30, 0, 0);
        radio.setAddVolume();
        int expected = 1;
        assertEquals(expected, radio.getAddVolume());
    }

    @Test
    public void addVolumeNewLessMin() {
        Radio radio = new Radio(30, 0, -2);
        radio.setAddVolume();
        int expected = -2;
        assertEquals(expected, radio.getAddVolume());
    }

    @Test
    public void addVolumeLessMin() {
        Radio radio = new Radio(30, 0, -1);
        radio.setAddVolume();
        int expected = 0;
        assertEquals(expected, radio.getAddVolume());
    }

    @Test
    public void addVolumeBorderMin() {
        Radio radio = new Radio(30, 0, 1);
        radio.setAddVolume();
        int expected = 2;
        assertEquals(expected, radio.getAddVolume());
    }

    @Test
    public void addVolumeCurrentMax() {
        Radio radio = new Radio(30, 0, 100);
        radio.setAddVolume();
        int expected = 100;
        assertEquals(expected, radio.getAddVolume());
    }

    @Test
    public void addVolumeMoreMax() {
        Radio radio = new Radio(30, 0, 101);
        radio.setAddVolume();
        int expected = 100;
        assertEquals(expected, radio.getAddVolume());
    }

    @Test
    public void addVolumeBorderMax() {
        Radio radio = new Radio(30, 0, 99);
        radio.setAddVolume();
        int expected = 100;
        assertEquals(expected, radio.getAddVolume());
    }

    @Test
    public void downVolume() {
        Radio radio = new Radio(30, 0, 50);
        radio.setDownVolume();
        int expected = 49;
        assertEquals(expected, radio.getDownVolume());
    }

    @Test
    public void downVolumeCurrentMin() {
        Radio radio = new Radio(30, 0, 0);
        radio.setDownVolume();
        int expected = 0;
        assertEquals(expected, radio.getDownVolume());
    }

    @Test
    public void downVolumeCurrentLessMin() {
        Radio radio = new Radio(30, 0, -1);
        radio.setDownVolume();
        int expected = 0;
        assertEquals(expected, radio.getDownVolume());
    }

    @Test
    public void downVolumeCurrentBorderMin() {
        Radio radio = new Radio(30, 0, 1);
        radio.setDownVolume();
        int expected = 0;
        assertEquals(expected, radio.getDownVolume());
    }

    @Test
    public void downVolumeCurrentMax() {
        Radio radio = new Radio(30, 0, 100);
        radio.setDownVolume();
        int expected = 99;
        assertEquals(expected, radio.getDownVolume());
    }

    @Test
    public void downVolumeCurrentMoreMax() {
        Radio radio = new Radio(30, 0, 101);
        radio.setDownVolume();
        int expected = 100;
        assertEquals(expected, radio.getDownVolume());
    }

    @Test
    public void downVolumeCurrentBorderMax() {
        Radio radio = new Radio(30, 0, 99);
        radio.setDownVolume();
        int expected = 98;
        assertEquals(expected, radio.getDownVolume());
    }
}
