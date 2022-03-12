package ru.netology.domein;

public class Radio {

    public int getNewChanel() {
        return currentChanel;
    }

    private int currentChanel = 5;

    public void setNewChanel(int newChanel) {
        if (newChanel >= 0) {
            if (newChanel <= 9)
                currentChanel = newChanel;
        }
        if (currentChanel == newChanel) ;
        if (newChanel < 0) ;
        if (newChanel > 9) ;
        return;
    }

    public int nextChanel(int currentChanel) {
        if (currentChanel < 9) {
            if (currentChanel >= 0) ;
            currentChanel = currentChanel + 1;
            return currentChanel;
        }
        if (currentChanel == 9) {
            currentChanel = 0;
            return currentChanel;
        }
        return 0;
    }

    public int prevChanel(int currentChanel) {
        if (currentChanel > 0) {
            if (currentChanel <= 9) ;
            currentChanel = currentChanel - 1;
            return currentChanel;
        }
        if (currentChanel == 0) {
            currentChanel = 9;
            return currentChanel;
        }
        return 0;
    }

    public int addVolume(int currentVolume) {
        if (currentVolume < 10) {
            if (currentVolume >= 0) ;
            currentVolume = currentVolume + 1;
            return currentVolume;
        }
        if (currentVolume == 10) {
            return currentVolume;
        }
        return 0;
    }

    public int downVolume(int currentVolume) {
        if (currentVolume > 0)
            if (currentVolume <= 10) {
                return currentVolume - 1;
            }
        if (currentVolume == 0) {
            return currentVolume;
        }
        return 0;
    }
}

