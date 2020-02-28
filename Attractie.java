package com.les;

abstract class Attractie implements IAttractie {

    private String _naamAttractie;
    private int _oppervlakte;
    private int _ticketsVerkocht;
    private double _ticketPrijs;
    private double _omzet;
    int aantalRondjes = 0;
    int kaartjesVerkocht = 0;


    public Attractie(String naamAttractie, double ticketPrijs, int oppervlakte) {
        this._naamAttractie = naamAttractie;
        this._oppervlakte = oppervlakte;
        this._ticketsVerkocht = 0;
        this._ticketPrijs = ticketPrijs;
        this.aantalRondjes = aantalRondjes;

    }

    public int draaien() {
        aantalRondjes = aantalRondjes + 1;
        return aantalRondjes;
    }

    public int koopKaartje() {
        kaartjesVerkocht = kaartjesVerkocht + 1;
        return kaartjesVerkocht;
    }

    public String get_naamAttractie() {
        return this._naamAttractie;
    }

//    public set_naamAttractie(String naamAttractie) {
//        this._naamAttractie = naamAttractie;
//    }

    public double get_omzet() {
        return this._omzet;
    }

    public void set_omzet(double nieuweOmzet) {
        this._omzet = nieuweOmzet;
    }

    public double get_ticketPrijs() {
        return this._ticketPrijs;
    }

    public void set_ticketPrijs(double ticketPrijs) {
        this._ticketPrijs = ticketPrijs;
    }
}
