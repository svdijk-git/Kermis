package com.les;

public class Spiegelpaleis extends Attractie implements Kermis {
    int nr = 3;
    public String naam = "Spiegelpaleis";


    @Override
    public void draaien() {
        System.out.println("De attractie " + naam + " draait");
    }
}
