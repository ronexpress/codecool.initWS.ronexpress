package com.codecool.interfacews;

import java.util.List;

public class UncleBen{
    public void feedBirds(List<Animals> animals){
        for ( Animals animal : animals) {
            if( animal instanceof Bird){
                ((Bird) animal).feed();
            }
        }
    }
}
