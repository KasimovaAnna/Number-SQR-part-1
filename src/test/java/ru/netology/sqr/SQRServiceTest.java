package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldNumberSQR() {
        SQRService service = new SQRService();
        int lowerBound = 200;
        int upperBound = 300;
        int expected = 3;

        int actual = service.numberSQR(lowerBound, upperBound);
        assertEquals(expected, actual);
    }

    @Test
    void shouldBoundariesOfNumbers() {
        SQRService service = new SQRService();
        int lowerBound = 100;
        int upperBound = 9801;
        int expected = 90;

        int actual = service.numberSQR(lowerBound, upperBound);
        assertEquals(expected, actual);
    }
}

