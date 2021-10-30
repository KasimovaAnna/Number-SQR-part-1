package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
@ParameterizedTest
@CsvSource (value = {"'NumberSQR, 200-300', 200, 300, 3"})
 void shouldNumberSQR(String testName, int low, int high, int expected) {
    SQRService service = new SQRService();

    int actual = service.numberSQR(200,300);
    assertEquals(expected, actual);
    }

    @Test
void shouldBoundariesOfNumbers(){
SQRService service =new SQRService();
int low = 100;
int high = 9801;
int expected = 90;

int actual = service.numberSQR(100, 9801);
assertEquals(expected, actual);}
}

