package ru.netology.domein;

public class Radio {

    public int getNewChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
    }

    private int currentChanel = 0;

    public void setNewChanel(int newChanel) {
        if (newChanel >= 0) {
            if (newChanel <= 9)
                currentChanel = newChanel;
        }
    }

    public int nextChanel() {
        if (currentChanel < 9) {
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
            currentChanel = currentChanel - 1;
            return currentChanel;
        }
        if (currentChanel == 0) {
            currentChanel = 9;
            return currentChanel;
        }
        return 0;
    }

    private int currentVolume = 0;

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int addVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            return currentVolume;
        }
        if (currentVolume == 10) {
            return currentVolume;
        }
        return 0;
    }

    public int downVolume() {
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

