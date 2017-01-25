package com.company;

import java.util.*;

/**
 * Created by andrei on 21.01.2017.
 */
public class KuulusNumber {
    /**
     * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
     * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
     */


    public static void main(String[] args) {
        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        int massiiviPikkus = naide.length;
        HashMap<Integer, Integer> mituKordaIgatNumbri = new HashMap<>();
        int koigeRohkemEsineb;

        for (int i = 0; i < massiiviPikkus; i++) {
            if (naide[i] != 3) {
                if (!mituKordaIgatNumbri.containsKey(naide[i])) {
                    mituKordaIgatNumbri.put(naide[i], 1);
                } else {
                    mituKordaIgatNumbri.put(naide[i], mituKordaIgatNumbri.get(naide[i]) + 1);
                }
            }
        }

        System.out.println(mituKordaIgatNumbri);
        koigeRohkemEsineb = Collections.max(mituKordaIgatNumbri.values());

        for (Map.Entry<Integer, Integer> entry : mituKordaIgatNumbri.entrySet()) {
            if (entry.getValue().equals(2)) {
                System.out.println("Koige rohkem esineb number " + entry.getKey() + ", seda esineb " + koigeRohkemEsineb + " korda");
            }
        }
    }


}
