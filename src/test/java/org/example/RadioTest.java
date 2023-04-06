package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class RadioTest {

    //Тестирую граничные значения


    @Test
        public void radioTestLessThanTheMinimum() {
            Radio radio = new Radio();
            radio.setVolume(-1);

            radio.volumeUp();

            int expected = 0;
            int actual = radio.getVolume();

            Assert.assertEquals(expected, actual);
    }

    @Test
    public void radioTestMinimumValue() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.volumeUp();

        int expected = 1;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void radioLessThanTheMinimumTest() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        radio.volumeUp();

        int expected = 0;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void radioTestMoreThanTheMinimum() {
        Radio radio = new Radio();
        radio.setVolume(1);

        radio.volumeUp();

        int expected = 2;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void radioTestMaximumValue() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.volumeUp();

        int expected = 100;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void setReduceVolumeTestLessThanTheMaximumValue() {
        Radio radio = new Radio();
        radio.setReduceVolume(99);

        radio.volumeDown();

        int expected = 98;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setReduceVolumeTestMaximumValue() {
        Radio radio = new Radio();
        radio.setReduceVolume(100);

        radio.volumeDown();

        int expected = 99;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setReduceVolumeTestMoreThanTheMaximum() {
        Radio radio = new Radio();
        radio.setReduceVolume(101);

        radio.volumeDown();

        int expected = 100;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void radioTestMoreThanTheMaximum() {
        Radio radio = new Radio();
        radio.setVolume(101);

        radio.volumeUp();

        int expected = 100;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void radioTestLessThanTheMaximumValue() {
        Radio radio = new Radio();
        radio.setVolume(99);

        radio.volumeUp();

        int expected = 100;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setReduceVolumeMinimumValueTest() {
        Radio radio = new Radio();
        radio.setReduceVolume(-1);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setReduceVolumeTestMinimumValue() {
        Radio radio = new Radio();
        radio.setReduceVolume(0);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setReduceVolumeTestMoreThanTheMinimum() {
        Radio radio = new Radio();
        radio.setReduceVolume(1);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setIncreaseNumberStationTestMoreThanTheMinimum() {
        Radio radio = new Radio();
        radio.setIncreaseNumberStation(1);

        radio.NumberStationUp();

        int expected = 2;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseNumberStationTestMinimumValue() {
        Radio radio = new Radio();
        radio.setIncreaseNumberStation(0);

        radio.NumberStationUp();

        int expected = 1;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseNumberStationTestLessThanTheMinimum() {
        Radio radio = new Radio();
        radio.setIncreaseNumberStation(-1);

        radio.NumberStationUp();

        int expected = 0;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseNumberStationTestLessThanTheMaximumValue() {
        Radio radio = new Radio();
        radio.setIncreaseNumberStation(8);

        radio.NumberStationUp();

        int expected = 9;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseNumberStationTestMaximumValue() {
        Radio radio = new Radio();
        radio.setIncreaseNumberStation(9);

        radio.NumberStationUp();

        int expected = 0;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseNumberStationTestMoreThanTheMaximum() {
        Radio radio = new Radio();
        radio.setIncreaseNumberStation(10);

        radio.NumberStationUp();

        int expected = 0;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setReduceNumberStationMoreThanTheMinimumTest() {
        Radio radio = new Radio();
        radio.setReduceNumberStation(1);

        radio.NumberStationDown();

        int expected = 0;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setReduceNumberStationMinimumValueTest() {
        Radio radio = new Radio();
        radio.setReduceNumberStation(0);

        radio.NumberStationDown();

        int expected = 9;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setReduceNumberStationMoreThanTheMinimumLessThanTheMinimumTest() {
        Radio radio = new Radio();
        radio.setReduceNumberStation(-1);

        radio.NumberStationDown();

        int expected = 9;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setReduceNumberStationLessThanTheMaximumValueTest() {
        Radio radio = new Radio();
        radio.setReduceNumberStation(8);

        radio.NumberStationDown();

        int expected = 7;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setReduceNumberStationMaximumValueTest() {
        Radio radio = new Radio();
        radio.setReduceNumberStation(9);

        radio.NumberStationDown();

        int expected = 8;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setReduceNumberStationMoreThanTheMaximumTest() {
        Radio radio = new Radio();
        radio.setReduceNumberStation(10);

        radio.NumberStationDown();

        int expected = 9;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void relevantConditionsUp() {
        Radio radio = new Radio(30);
        radio.setIncreaseNumberStation(20);

        radio.NumberStationUp();

        int expected = 21;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

        @Test
        public void relevantConditionsDown() {
            Radio radio = new Radio(30);
            radio.setIncreaseNumberStation(20);

            radio.NumberStationDown();

            int expected = 19;
            int actual = radio.getNumberStation();

            Assert.assertEquals(expected, actual);

    }

}
