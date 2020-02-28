package com.les;

import java.util.ArrayList;
import java.util.List;


public class KermisKaart {
    private String naam;
    private List<Attractie> attracties;

    public KermisKaart(String ParkNaam) {
        this.naam = ParkNaam;
        this.attracties = new ArrayList<Attractie>();

    }

    public String getNaam() {
        return this.naam;
    }

    public void addAttractie(Attractie attractie) {
        this.attracties.add(attractie);
    }
}
