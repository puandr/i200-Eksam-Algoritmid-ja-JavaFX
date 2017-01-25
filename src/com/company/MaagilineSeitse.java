package com.company;


/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */


public class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};
        int naideMassiiviPikkus = naide.length;
        int arvudeSumma = 0;

        for (int i = 0; i < naideMassiiviPikkus; i++) {
            if (naide[i] == 7) naide[i] = naide[i] * 2;
            arvudeSumma = arvudeSumma + naide[i];
        }

        System.out.println(arvudeSumma/naideMassiiviPikkus);



    }
}