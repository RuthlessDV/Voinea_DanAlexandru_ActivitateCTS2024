package program;

import clase.Client;
import clase.ModPlata;
import clase.PlataCash;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ion");
        client.realizeazaPlata(20);
        ModPlata modPlata = new PlataCash();
        client.setModPlata(modPlata);
        client.realizeazaPlata(30);
    }
}