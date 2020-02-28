package com.les;

import java.util.Scanner;
//maak class kermis met daarin een lijst van (class) Attractie (returntype?) en dan .add botsauto

// interface met draaien methode
// attracties als class met naam, ticketprijs,aantal tickets verkocht en oppervlakte, rest extend
public class DraaiKermis {

    public static void main(String[] args) {

        Botsauto auto1 = new Botsauto();
        Spin spin1 = new Spin();
        Spiegelpaleis sp1 = new Spiegelpaleis();
        Spookhuis sh1 = new Spookhuis();
        Hawaii haw1 = new Hawaii();
        Ladderklimmen lk1 = new Ladderklimmen();

//        auto1.draaien();
//        spin1.draaien();
//        sp1.draaien();
//        sh1.draaien();
//        haw1.draaien();
//        lk1.draaien();
//
//        String[] attracties = {"Botsauto", "Spin", "Spiegelpaleis", "Spookhuis", "Hawaii", "Ladderklimmen"};
//        int toestel = 0;
//        System.out.println("Druk 1 voor Botsauto's \n2 voor Spin \n3 voor Spiegelpaleis \n4 voor Spookhuis \n5 voor Hawaii \n6 voor Ladderklimmen");
//        //while (true) {
//        Scanner input = new Scanner(System.in);
//        toestel = Integer.parseInt(input.nextLine()); //try catch
//        if (toestel <= 0 || toestel >= 7) {
//            System.out.println("Kies een getal tussen 1 en 6");
//
//        } else if (toestel == 1) {
//            System.out.println("Botsautos's draaien");
//
//        } else if (toestel == 2) {
//            System.out.println("De Spin draait");
//
//        } else {
//            System.out.println("nada");
//        }
        //input.close();
        //  }


        //attracties in een array?
// https://codereview.stackexchange.com/questions/37376/vending-machine-implementation
        // int attnr = sc.nextInt();       //aparte methode met header en vraag im input, scanner checked. in methode draaien?
        // System.out.println(attnr);
        //for loop voor de scanner



    }


}
