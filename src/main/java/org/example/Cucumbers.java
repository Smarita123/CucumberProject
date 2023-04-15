package org.example;

public class Cucumbers {

    int totalCucumber, consumed, availableCucumber;

    public int calculateAvailable(int totalCucumber,int consumed){
        availableCucumber=totalCucumber-consumed;
        return availableCucumber;
    }




}
