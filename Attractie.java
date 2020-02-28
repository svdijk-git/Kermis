package com.les;

abstract class Attractie implements IAttractie {

    private String _naamAttractie;
    private int _oppervlakte;
    private int _ticketsVerkocht;
    private double _ticketPrijs;
    int aantalRondjes = 0;
    int kaartjesVerkocht = 0;


    public void Attractie(String naamAttractie, int oppervlakte, int ticketsVerkocht, int ticketPrijs) {
        this._naamAttractie = naamAttractie;
        this._oppervlakte = oppervlakte;
        this._ticketsVerkocht = ticketsVerkocht;
        this._ticketPrijs = ticketPrijs;

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
        return _naamAttractie;
    }

    public void set_naamAttractie(String _naamAttractie) {
        this._naamAttractie = _naamAttractie;
    }
}
