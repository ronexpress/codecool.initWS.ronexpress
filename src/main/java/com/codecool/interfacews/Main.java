package com.codecool.interfacews;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static String[] birds = {"Sas","Fecske","Sirály"};
    static String[] ladyBirds = {"Hétpettyes","Ötpettyes","Piros"};
    static Bird b1 = new Bird("Csuri",true);
    static Ladybird l1 = new Ladybird("Sárga",false);
    static Wolf w1 = new Wolf();

    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<Animals>();

        for (int i = 0; i < birds.length; i++) {
            animals.add(new Bird(birds[i], i%2==0));
        }
        for (int i = 0; i < ladyBirds.length; i++) {
            animals.add(new Ladybird(ladyBirds[i], i%2==1));
        }

        allFly(animals);
        allFeed(animals);

        UncleBen ub = new UncleBen();
        ub.feedBirds( animals );

        WildAnimalList<Wolf> wolfs = new WildAnimalList<Wolf>();
        wolfs.add(w1);

    }

    public static void allFly(List<Animals> animals){
        System.out.println("* Flying time *");
        for(Animals animal: animals){
            ((Flying) animal).fly();
        }
    }

    public static void allFeed(List<Animals> animals){
        System.out.println("* Feeding time *");
        for(Animals animal: animals){
            ((Feeding) animal).feed();
        }
    }

}
