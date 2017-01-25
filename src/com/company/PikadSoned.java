package com.company;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
         */
public class PikadSoned {
    public static void main(String[] args){
        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"};
        int masiiviPikkus = naide.length;
        int koikideSonadePikkus = 0;
        int keskmineSonaPikku = 0;
        int mituSonaKeskmisestPikkemad = 0;

        for (int i = 0; i < masiiviPikkus; i++) {
            koikideSonadePikkus = koikideSonadePikkus + naide[i].length();
        }
        System.out.println(koikideSonadePikkus);
        System.out.println("Keskmine " +  koikideSonadePikkus/masiiviPikkus);
        keskmineSonaPikku = koikideSonadePikkus/masiiviPikkus;

        for (int i = 0; i < masiiviPikkus; i++) {
            if (naide[i].length() > keskmineSonaPikku) mituSonaKeskmisestPikkemad++;
        }

        System.out.println("Keskmisest pikemat on " + mituSonaKeskmisestPikkemad + " sona");

    }
}
