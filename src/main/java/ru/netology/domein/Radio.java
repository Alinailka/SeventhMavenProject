package ru.netology.domein;

public class Radio {

    private int quantChanel = 10;
    private int minChanel = 0;
    private int maxChanel = quantChanel - 1;
    private int currentChanel = 5;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = 50;

    public Radio(int quantChanel, int currentChanel, int currentVolume) {
        this.quantChanel = quantChanel;
        this.currentChanel = currentChanel;
        this.currentVolume = currentVolume;
    }

    public Radio() {
    }

    //------------------

    public int getNewChanel() {
        return currentChanel;
    }

    public void setNewChanel(int newChanel) {
        if (newChanel <= quantChanel - 1) {
            if (newChanel >= minChanel) {
                this.currentChanel = newChanel;
            }
        }
        if (newChanel > quantChanel - 1) {
            return;
        }
        if (newChanel < minChanel)
            return;
    }

    //--------------

    public int getNextChanel() {
        return currentChanel;
    }

    public void setNextChanel(int currentChanelUser) {
        int newChanel = currentChanelUser + 1;


        if (newChanel < quantChanel - 1) {
            if (newChanel >= minChanel) ;
            {
                currentChanel = newChanel;
                return;
            }
        }
        if (newChanel == quantChanel - 1) {
            currentChanel = newChanel;
            return;
        }
        if (currentChanelUser > maxChanel) ;
        {
            currentChanel = 0;
            return;
        }

    }


    //-------------

    public int getPrevChanel() {
        return currentChanel;
    }

    public void setPrevChanel(int currentChanelUser) {
        int newChanel = currentChanelUser - 1;

        if (newChanel < minChanel) ;
        {
            currentChanel = quantChanel - 1;
        }

        if (newChanel >= minChanel) {
            currentChanel = newChanel;
            return;
        }

    }


    //-------------
    public int getAddVolume() {
        return currentVolume;
    }

    public void setAddVolume() {
        int newVolume = currentVolume + 1;
        if (newVolume <= maxVolume) {
            if (newVolume >= 0)
                currentVolume = newVolume;
            {
                return;
            }
        }
        if (currentVolume > maxVolume) ;
        currentVolume = maxVolume;
        {
            return;
        }
    }

    //-------------
    public int getDownVolume() {
        return currentVolume;
    }

    public void setDownVolume() {
        int newVolume = currentVolume - 1;
        if (newVolume < minVolume) ;
        {
            currentVolume = minVolume;
            if (newVolume >= minVolume) {
                currentVolume = newVolume;
                return;
            }

        }
    }
}

