package ru.netology.sqr;

public class SQRService {
    public int numberSQR(int lowerBound, int upperBound) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (lowerBound <= square && square <= upperBound) {
                counter++;
            }
        }
        return counter;
    }

}
