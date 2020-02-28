package com.les;

public class Ladderklimmen implements Kermis {
    int nr = 6;
    public String naam = "Ladderklimmen";

    @Override
    public void draaien() {
        System.out.println("De attractie " + naam + " draait");
    }
}