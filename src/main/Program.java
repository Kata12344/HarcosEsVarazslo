
package main;

import modell.Karakter;
import modell.Palya;
import nezet.GUI;

public class Program {

    public static void main(String[] args) {
        Karakter harcos = new Karakter("Buba", "harcos", 4, 20);
        Karakter varazslo = new Karakter("Matyi", "varázsló", 2, 22);
        
        harcos.felvesz("Kard");
        harcos.felvesz("bárd");
        varazslo.felvesz("varázspálca");
        varazslo.felvesz("sapka");
        
        harcos.kiir();
        varazslo.kiir();
        
  
        Palya palya = new Palya();
        palya.palyaFeltolt();
        
        new GUI().setVisible(true);
    }
    
}
