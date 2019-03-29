package com.example.second;

public class Clc {
    public static int Clc(Simple givenpt){
        int principle= givenpt.getPrinciple();
        int rate = givenpt.getRate();
        int time=givenpt.getTime();
        return (principle*time*rate)/100;
    }
}
