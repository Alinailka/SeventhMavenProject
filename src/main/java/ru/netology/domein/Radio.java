package ru.netology.domein;

public class Radio {

    private int quantityChanel = 10;
    private int minChanel = 0;
    private int maxChanel = quantityChanel - 1;
    private int currentChanel = 5;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = 50;

    public Radio(int quantityChanel) {
        this.quantityChanel = quantityChanel;
    }

    public Radio() {
    }

    public int getNewChanel() {
        return currentChanel;
    }

    public void setNewChanel(int newChanel) {
        if (newChanel <= quantityChanel - 1) {
            if (newChanel >= minChanel)
                this.currentChanel = newChanel;
        }
    }

    public int getNextChanel() {
        return currentChanel;
    }

    public void setNextChanel(int currentChanelUser) {
        int newChanel = currentChanelUser + 1;
        if (newChanel < quantityChanel - 1) {
            if (newChanel >= minChanel) ;
            {
                currentChanel = newChanel;
                return;
            }
        }
        if (newChanel == quantityChanel - 1) {
            currentChanel = newChanel;
            return;
        }
        if (currentChanelUser > maxChanel) ;
        {
            currentChanel = 0;
            return;
        }
    }

    public int getPrevChanel() {
        return currentChanel;
    }

    public void setPrevChanel(int currentChanelUser) {
        int newChanel = currentChanelUser - 1;
        if (newChanel < minChanel) ;
        {
            currentChanel = quantityChanel - 1;
        }
        if (newChanel >= minChanel) {
            currentChanel = newChanel;
            return;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolumeUser) {
        int newVolume = currentVolumeUser + 1;
        if (newVolume <= maxVolume) {
            if (newVolume >= 0)
                currentVolume = newVolume;
            return;
        }
        if (currentVolumeUser > maxVolume) ;
        currentVolume = maxVolume;
        return;
    }

    public int getDownVolume() {
        return currentVolume;
    }

    public void setDownVolume(int currentVolumeUser) {
        int newVolume = currentVolumeUser - 1;
        if (newVolume < minVolume) ;
        currentVolume = minVolume;
        if (newVolume >= minVolume)
            currentVolume = newVolume;
        return;
    }
}

