package ru.netology.domein;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
    @Test
    void newChanel() {
        Radio radio = new Radio();
        radio.setNewChanel(8);
        int expected = 8;
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void newChanelCurrentSameNew() {
        Radio radio = new Radio();
        radio.setNewChanel(5);
        int expected = 5;
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void newChanelMin() {
        Radio radio = new Radio();
        radio.setNewChanel(0);
        int expected = 0;
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void newChanelMax() {
        Radio radio = new Radio();
        radio.setNewChanel(9);
        int expected = 9;
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void newChanelLowMin() {
        Radio radio = new Radio();
        radio.setNewChanel(-1);
        int expected = radio.getNewChanel();
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void newChanelMoreMax() {
        Radio radio = new Radio();
        radio.setNewChanel(10);
        int expected = radio.getNewChanel();
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextChanelCurrentMin() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        int expected = 1;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextChanelCurrentBorderMin() {
        Radio radio = new Radio();
        radio.setCurrentChanel(1);
        int expected = 2;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextChanelCurrentLessMin() {
        Radio radio = new Radio();
        radio.setCurrentChanel(-1);
        int expected = 0;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextChanelCurrentMax() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        int expected = 0;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextChanelCurrentMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentChanel(10);
        int expected = 0;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextChanelCurrentBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentChanel(8);
        int expected = 9;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextChanelCurrentOnRange() {
        Radio radio = new Radio();
        radio.setCurrentChanel(5);
        int expected = 6;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanelCurrentMin() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        int expected = 9;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanelCurrentBorderMin() {
        Radio radio = new Radio();
        radio.setCurrentChanel(1);
        int expected = 0;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanelCurrentLessMin() {
        Radio radio = new Radio();
        radio.setCurrentChanel(-1);
        int expected = 0;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanelCurrentMax() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        int expected = 8;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanelCurrentMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentChanel(10);
        int expected = 9;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanelCurrentBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentChanel(8);
        int expected = 7;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanelCurrentOnRange() {
        Radio radio = new Radio();
        radio.setCurrentChanel(5);
        int expected = 4;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeCurrentMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 1;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeCurrentBorderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 2;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeCurrentLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeCurrentMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeCurrentMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeCurrentBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 10;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeCurrentOnRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 6;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void downVolumeCurrentMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }

    @Test
    void downVolumeCurrentBorderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 0;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }

    @Test
    void downVolumeCurrentLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }

    @Test
    void downVolumeCurrentMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 9;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }

    @Test
    void downVolumeCurrentMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }

    @Test
    void downVolumeCurrentBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 8;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }

    @Test
    void downVolumeCurrentOnRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 4;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }
}
