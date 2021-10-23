package ru.netology.sqr;

public class SQRService {
    public int numberSQR (int low, int high){
        int counter = 0;
        for (int i = 10; i <=99; i++){
            if (low <= i * i && i * i <= high){
                counter++;
            }
        }
        return counter;
    }

}
