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
    public void shouldSetMinNumberStationIfMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(10);

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
    public void shouldSetMinNumberStationIfNextAfterMax() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(9);
        radio.nextNumberStation();

        int expected = 0;
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
    public void shouldSetMaxNumberStationIfPrevBeforeMin() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(0);
        radio.prevNumberStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldStayMaxVolumeIfUpMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldStayMinVolumeIfDownLessMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}

