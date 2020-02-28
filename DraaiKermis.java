package com.les;

import java.util.Scanner;

public class DraaiKermis {

    public static void main(String[] args) {

        /*1*/
        Botsauto auto1 = new Botsauto();
        /*2*/
        Spin spin1 = new Spin();
        /*3*/
        Spiegelpaleis sp1 = new Spiegelpaleis();
        /*4*/
        Spookhuis sh1 = new Spookhuis();
        /*5*/
        Hawaii haw1 = new Hawaii();
        /*6*/
        Ladderklimmen lk1 = new Ladderklimmen();


        String[] attracties = {"Botsauto", "Spin", "Spiegelpaleis", "Spookhuis", "Hawaii", "Ladderklimmen"};
        int toestel = 0;
        // System.out.println("Druk 1 voor Botsauto's \n2 voor Spin \n3 voor Spiegelpaleis \n4 voor Spookhuis \n5 voor Hawaii \n6 voor Ladderklimmen");
        while (true) {

            Scanner input = new Scanner(System.in);
            try {
                System.out.println("Druk \n1 voor Botsauto's \n2 voor Spin \n3 voor Spiegelpaleis \n4 voor Spookhuis \n5 voor Hawaii \n6 voor Ladderklimmen");
                toestel = Integer.parseInt(input.nextLine()); //try catch

            } catch (Exception e) {
                System.out.println("help");
            }
            if (toestel <= 0 || toestel >= 7) {
                System.out.println("Kies een getal tussen 1 en 6");

            } else if (toestel == 1) {
                auto1.draaien();
                auto1.koopKaartje();
                System.out.println("Botsen maar!");

            } else if (toestel == 2) {
                spin1.draaien();
                spin1.koopKaartje();
                System.out.println("Welkom in de Spin");

            } else if (toestel == 3) {
                sp1.draaien();
                sp1.koopKaartje();
                System.out.println("Welkom in het SpiegelPaleis");

            } else if (toestel == 4) {
                sh1.draaien();
                sh1.koopKaartje();
                System.out.println("Welkom in het Spookhuis");

            } else if (toestel == 5) {
                haw1.draaien();
                haw1.koopKaartje();
                System.out.println("Welcome to Hawaii, enjoy your stay");

            } else if (toestel == 6) {
                lk1.draaien();
                lk1.koopKaartje();
                System.out.println("Iets met ladders en klimmen");

            } else {
                System.out.println("nada");
                input.close();
            }

        }


        //attracties in een array?
// https://codereview.stackexchange.com/questions/37376/vending-machine-implementation
        // int attnr = sc.nextInt();       //aparte methode met header en vraag im input, scanner checked. in methode draaien?
        // System.out.println(attnr);
        //for loop voor de scanner

//maak class kermis met daarin een lijst van (class) Attractie (returntype?) en dan .add botsauto
// interface met draaien methode
// attracties als class met naam, ticketprijs,aantal tickets verkocht en oppervlakte, rest extend
    }


}
