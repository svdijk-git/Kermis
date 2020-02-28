package com.les;
import java.util.ArrayList;
import java.util.List;


public class KermisKaart {
private String naam;
private List<Attractie> attracties;

    public KermisKaart (String ParkNaam){
        this.naam = ParkNaam;
        this.attracties = new ArrayList<Attractie>();


    }
}
