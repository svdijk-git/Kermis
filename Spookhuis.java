package com.les;

public class Spookhuis extends Attractie implements Kermis {
    int nr = 4;
    public String naam = "Spookhuis";

    @Override
    public void draaien() {
        System.out.println("De attractie " + naam + " draait");
    }
}
