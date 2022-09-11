package modell;

public class Karakter {

    private String nev, faj;
    private int ero, elet;
    private String[] eszkozok;

    private final int MAX_DB = 3;
    private int db;
    private static final String URES = "-";

    public Karakter(String nev, String faj, int ero, int elet) {
        this(nev, faj, ero, elet, URES);
    }

    public Karakter(String nev, String faj, int ero, int elet, String eszkoz) {
        this.nev = nev;
        this.faj = faj;
        this.ero = ero;
        this.elet = elet;

        feltolt();
        db = 0;
        if (!eszkoz.equals(URES)) {
            eszkozok[db] = eszkoz;
            db++;
        }
    }

    public String getNev() {
        return nev;
    }

    public String getFaj() {
        return faj;
    }

    public int getEro() {
        return ero;
    }

    public int getElet() {
        return elet;
    }
    

    public boolean felvesz(String eszkoz) {
        if (db < eszkozok.length) {
            eszkozok[db] = eszkoz;
            db++;
            return true;

        } else {
            return false;
        }
    }

    public void eldob(int index) {
        if (index >= 0 && index < eszkozok.length) {
            eszkozok[index] = URES;
        }
    }

    public int eszkozDb() {
        return db;
    }

    public void kiir() {
        System.out.printf("Neve: %s\nFajtája: %s\nEreje: %d\nÉlete: %d\n" , nev, faj, ero, elet);
        System.out.println("Felszerelések:");
        for (int i = 0; i < MAX_DB; i++) {
            System.out.println(eszkozok[i]);
        }
    }

    private void feltolt() {
        eszkozok = new String[MAX_DB];
        for (int i = 0; i < MAX_DB; i++) {
            eszkozok[i] = URES;
        }
    }
    
    
    

}
