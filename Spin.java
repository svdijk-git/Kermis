package com.les;

public class Spin extends Attractie {
    private static final int OPP = 25;


    public Spin(String naamAttractie, double ticketPrijs) {
        super(naamAttractie, ticketPrijs, Spin.OPP);

    }
}