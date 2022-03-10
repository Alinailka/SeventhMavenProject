package ru.netology.domein;

public class Radio {

    int currentChanel = 0;


//    public int newChanel(int newCurrentChanel) {
//        if (newCurrentChanel >= 0) {
//            if (newCurrentChanel <= 9) {
//                return newCurrentChanel;
//            }
//        }
//        return currentChanel;
//    }

    public int nextChanel() {

        for (int i = currentChanel; i < 9; i++) {
            return i + 1;
        }
            if (currentChanel == 9) {
                return 0;
            }
        return 0;
    }

    public int prevChanel(){
        for (int i = currentChanel; i > 0; i--) {
            return i - 1;
        }
        if (currentChanel == 0) {
            return 9;
        }
        return 0;
    }

    int currentVolume = 0;

    public int addVolume(){
        for (int i = currentVolume; i < 10; i++) {
            return i + 1;
        }
        if (currentVolume == 10) {
            return currentVolume;
        }
        return 0;
    }
    public int downVolume(){
        for (int i = currentVolume; i > 0; i--) {
            return i - 1;
        }
        if (currentVolume == 0) {
            return currentVolume;
        }
        return 0;
    }

}

