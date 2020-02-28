package com.les;

public class Spin extends Attractie implements Kermis {
    int nr = 2;
    public String naam = "Spin";

    @Override
    public void draaien() {
        System.out.println("De attractie " + naam + " draait");
    }
}
