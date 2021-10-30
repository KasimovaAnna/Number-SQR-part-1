package ru.netology.sqr;

public class SQRService {
    public int numberSQR (int low, int high){
        int counter = 0;
        for (int i = 10; i <=99; i++){
            int square = i * i;
            if (low <= square && square <= high){
                counter++;
            }
        }
        return counter;
    }

}
