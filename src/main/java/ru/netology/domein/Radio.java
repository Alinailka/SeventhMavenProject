package ru.netology.domein;

public class Radio {

    int currentChanel = 8;


    public int getNewChanel() {
        return currentChanel;


        public void setNewChanel(int newChanel){

            public int newChanel () {
                if (newChanel > 9) {
                    return;
                }
                if (newChanel < 0) {
                    return;
                }
                currentChanel = newChanel;
            }


            public int getNextChanel () {
                return nextChanel();
            }

            public void setNextChanel () {
                this.currentChanel = nextChanel();
            }
//    private int nextChanel() {
//
//        for (int i = currentChanel; i < 9; i++) {
//            return i + 1;
//        }
//        if (currentChanel == 9) {
//            return 0;
//        }
//        return 0;
//    }
            private int nextChanel () {

                if (currentChanel < 9) {
                    return currentChanel + 1;
                }
                if (currentChanel == 9) {
                    return 0;
                }
                if (currentChanel > 9) {
                    return currentChanel;
                }
                return 0;
            }


            public int prevChanel () {
                for (int i = currentChanel; i > 0; i--) {
                    return i - 1;
                }
                if (currentChanel == 0) {
                    return 9;
                }
                return 0;
            }

            int currentVolume = 0;

            public int getCurrentVolume () {
                return currentVolume;
            }

            public void setCurrentVolume ( int currentVolume){
                this.currentVolume = currentVolume;
            }

            public int addVolume () {
                for (int i = currentVolume; i < 10; i++) {
                    return i + 1;
                }
                if (currentVolume == 10) {
                    return currentVolume;
                }
                return 0;
            }
            public int downVolume () {
                for (int i = currentVolume; i > 0; i--) {
                    return i - 1;
                }
                if (currentVolume == 0) {
                    return currentVolume;
                }
                return 0;
            }

        }

