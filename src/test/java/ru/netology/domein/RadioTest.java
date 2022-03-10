package ru.netology.domein;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
//    @Test
//  void checkNewChanel() {
//
//        Radio radio = new Radio();
//        int newCurrentChanel = -1;
//        int expected = 6;
//        int actual = radio.newChanel(newCurrentChanel);
//        assertEquals(expected, actual);
//    }
    @Test
    void nextChanel(){
        Radio radio = new Radio();
        int expected = 1;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }
    @Test
    void prevChanel() {
        Radio radio = new Radio();
        int expected = 9;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }
    @Test
    void addVolume() {
        Radio radio = new Radio();
        int expected = 1;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }
    @Test
    void downVolume() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }
}