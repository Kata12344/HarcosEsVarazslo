package modell;

import java.util.Random;

public class Palya {

    private char[] palya;
    public final int palyaHossz = 3;
    public boolean harc;

    Random rnd = new Random();
    private final int harcosKezdo = rnd.nextInt(3);
    private final int varazsloKezdo = rnd.nextInt(3);

    public Palya() {
    }

    public void palyaFeltolt() {
        palya = new char[palyaHossz];
        harcosElhelyez();
        varazsloElhelyez();
        for (int i = 0; i < palyaHossz; i++) {
            if (palya[i] != 'H' && palya[i] != 'V') {
                palya[i] = '_';
            }
            System.out.printf(palya[i] + " ");
        }
        harcVan();
    }

    public void harcosElhelyez() {
        //System.out.println(harcosKezdo);
        for (int i = 0; i < palya.length; i++) {
            if (harcosKezdo == i) {
                palya[i] = 'H';
            }
        }
    }
    public void varazsloElhelyez() {
        //System.out.println(varazsloKezdo);
        for (int i = 0; i < palya.length; i++) {
            if (varazsloKezdo == i) {
                palya[i] = 'V';
            }
        }
    }
    public void harcVan(){
        if (harcosKezdo == varazsloKezdo) {
            harc = true;
            System.out.println("Harc van!");
            
        }
    }

}
