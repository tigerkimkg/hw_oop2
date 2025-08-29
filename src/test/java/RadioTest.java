import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentNumberStationNine() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(9);

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentNumberStationMax() {
        Radio radio = new Radio(25);

        radio.setCurrentNumberStation(radio.getMaxNumberStation());

        int expected = radio.getMaxNumberStation();
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentNumberStationOne() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(1);

        int expected = 1;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentNumberStationEight() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(8);

        int expected = 8;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinNumberStationIfLessMin() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinNumberStationIfMoreNine() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinNumberStationIfMoreMax() {
        Radio radio = new Radio(25);

        radio.setCurrentNumberStation(25);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(8);
        radio.nextNumberStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinNumberStationIfNextAfterMaxDefaultAmount() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(radio.getMaxNumberStation());
        radio.nextNumberStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinNumberStationIfNextAfterMaxRandomAmount() {
        Radio radio = new Radio(25);

        radio.setCurrentNumberStation(radio.getMaxNumberStation());
        radio.nextNumberStation();

        int expected = radio.getMinNumberStation();
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(1);
        radio.prevNumberStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxNumberStationIfPrevBeforeMinDefaultAmount() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(radio.getMinNumberStation());
        radio.prevNumberStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxNumberStationIfPrevBeforeMinRandomAmount() {
        Radio radio = new Radio(25);

        radio.setCurrentNumberStation(radio.getMinNumberStation());
        radio.prevNumberStation();

        int expected = radio.getMaxNumberStation();
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.volumeUp();

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldStayMaxVolumeIfUpMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMaxVolume());
        radio.volumeUp();

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.volumeDown();

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldStayMinVolumeIfDownLessMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMinVolume());
        radio.volumeDown();

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}

