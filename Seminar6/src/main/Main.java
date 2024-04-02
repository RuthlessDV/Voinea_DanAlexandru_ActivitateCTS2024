package main;

import softNou.Bar;
import softNou.Bautura;
import softVechi.*;

public class Main {

    public static void platesteConsumatia(SoftBucatarie comanda){
        comanda.printareBon();
    }

    public static void main(String[] args) {
        SoftBucatarie bucatarie = new Bucatarie();
        Produs produs = new Produs("Pizza", 52);
        Produs produs1 = new Produs("Paste", 47);
        bucatarie.adaugareProdus(produs);
        bucatarie.printareBon();
        bucatarie.adaugareProdus(produs1);

        platesteConsumatia(bucatarie);
        Bar bar = new Bar();
        Bautura bautura = new Bautura(25,"Mojito",15);
        bar.adaugaBautura(bautura);
        bar.adaugaBautura(new Bautura(32,"G&T",25));

        AdapterComandaBarBucatarie bar2 = new AdapterComandaBarBucatarie();
        bar.adaugaBautura(new Bautura(20,"Cola",0));
        platesteConsumatia(bar2);
        bar2.adaugareProdus(new AdapterBauturaProdus(new Bautura(5,"Apa",0)));
    }
}
