package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class RadioTest {

    //Тестирую граничные значения

    @Test
        public void radioTestLessThanTheMinimum() {
            Radio radio = new Radio();

            radio.setVolume(-1);

            int expected = 0;
            int actual = radio.getVolume();

            Assert.assertEquals(expected, actual);
    }

    @Test
    public void radioTestMinimumValue() {
        Radio radio = new Radio();

        radio.setVolume(0);

        int expected = 1;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void radioLessThanTheMinimumTest() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void radioTestMoreThanTheMinimum() {
        Radio radio = new Radio();

        radio.setVolume(1);

        int expected = 2;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void radioTestMaximumValue() {
        Radio radio = new Radio();

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void setReduceVolumeTestLessThanTheMaximumValue() {
        Radio radio = new Radio();

        radio.setReduceVolume(99);

        int expected = 98;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setReduceVolumeTestMaximumValue() {
        Radio radio = new Radio();

        radio.setReduceVolume(100);

        int expected = 99;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setReduceVolumeTestMoreThanTheMaximum() {
        Radio radio = new Radio();

        radio.setReduceVolume(101);

        int expected = 100;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void radioTestMoreThanTheMaximum() {
        Radio radio = new Radio();

        radio.setVolume(101);

        int expected = 100;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void radioTestLessThanTheMaximumValue() {
        Radio radio = new Radio();

        radio.setVolume(99);

        int expected = 100;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setReduceVolumeTestMinimumValue() {
        Radio radio = new Radio();

        radio.setReduceVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setReduceVolumeTestMoreThanTheMinimum() {
        Radio radio = new Radio();

        radio.setReduceVolume(1);

        int expected = 0;
        int actual = radio.getVolume();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setIncreaseNumberStationTestMoreThanTheMinimum() {
        Radio radio = new Radio();

        radio.setIncreaseNumberStation(1);

        int expected = 2;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseNumberStationTestMinimumValue() {
        Radio radio = new Radio();

        radio.setIncreaseNumberStation(0);

        int expected = 1;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseNumberStationTestLessThanTheMinimum() {
        Radio radio = new Radio();

        radio.setIncreaseNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseNumberStationTestLessThanTheMaximumValue() {
        Radio radio = new Radio();

        radio.setIncreaseNumberStation(8);

        int expected = 9;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseNumberStationTestMaximumValue() {
        Radio radio = new Radio();

        radio.setIncreaseNumberStation(9);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseNumberStationTestMoreThanTheMaximum() {
        Radio radio = new Radio();

        radio.setIncreaseNumberStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setReduceNumberStationMoreThanTheMinimumTest() {
        Radio radio = new Radio();

        radio.setReduceNumberStation(1);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setReduceNumberStationMinimumValueTest() {
        Radio radio = new Radio();

        radio.setReduceNumberStation(0);

        int expected = 9;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setReduceNumberStationMoreThanTheMinimumLessThanTheMinimumTest() {
        Radio radio = new Radio();

        radio.setReduceNumberStation(-1);

        int expected = 9;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setReduceNumberStationLessThanTheMaximumValueTest() {
        Radio radio = new Radio();

        radio.setReduceNumberStation(8);

        int expected = 7;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setReduceNumberStationMaximumValueTest() {
        Radio radio = new Radio();

        radio.setReduceNumberStation(9);

        int expected = 8;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setReduceNumberStationMoreThanTheMaximumTest() {
        Radio radio = new Radio();

        radio.setReduceNumberStation(10);

        int expected = 9;
        int actual = radio.getNumberStation();

        Assert.assertEquals(expected, actual);
    }

}
