package com.les;

public class Hawaii extends Attractie implements Kermis {
    int nr = 5;
    public String naam = "Hawaii";

    @Override
    public void draaien() {
        System.out.println("De attractie " + naam + " draait");
    }
}