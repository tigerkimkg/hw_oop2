public class Radio {

    private int minNumberStation;
    private int maxNumberStation;
    private int currentNumberStation = minNumberStation;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio() {
        this.maxNumberStation = 9;
    }

    public Radio(int amount) {
        this.maxNumberStation = amount - 1;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation < minNumberStation) {
            return;
        }
        if (newCurrentNumberStation > maxNumberStation) {
            return;
        }
        currentNumberStation = newCurrentNumberStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void nextNumberStation() {
        if (currentNumberStation < maxNumberStation) {
            currentNumberStation++;
        } else {
            currentNumberStation = minNumberStation;
        }
        //setCurrentNumberStation(currentNumberStation);
    }

    public void prevNumberStation() {
        if (currentNumberStation > minNumberStation) {
            currentNumberStation--;
        } else {
            currentNumberStation = maxNumberStation;
        }
        //setCurrentNumberStation(currentNumberStation);
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        //setCurrentVolume(currentVolume);
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        //setCurrentVolume(currentVolume);
    }

}
