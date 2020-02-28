package com.les;
//eve in apart bestand
interface IfruitFabriek {
    String fruitMand(int a, int b);

    int gewicht(int[] Array);

    String returnHallo();

    void printVar(String bla);
}

public class FruitFabriek implements IfruitFabriek {
    public String fruitMand(int appel, int peer) {
        return "appel " + Integer.toString(appel) + "\n peer " + Integer.toString(peer);
    }


    public int gewicht(int[] Array) {
        return 100;
    }


    public String returnHallo() {
        return "Hallo";
    }


    public void printVar(String bla) {
        System.out.println(bla);
    }

    public String fruitMand(String appel, String peer) {
        return "appel " + appel + "\n peer " + peer;
    }

    public class FruitFabriek2 implements IfruitFabriek {
        public String fruitMand(int appel, int peer) {
            return "appel " + Integer.toString(appel) + "\n peer " + Integer.toString(peer);
        }


        public int gewicht(int[] Array) {
            return 110;
        }


        public String returnHallo() {
            return "Hallo";
        }


        public void printVar(String bla) {
            System.out.println(bla);
        }

        public String fruitMand(String appel, String peer) {
            return "appel " + appel + "\n peer " + peer;
        }
    }
}