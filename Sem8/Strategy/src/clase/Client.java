package clase;

public class Client {
    private String nume;
    private ModPlata modPlata;
    public Client(String nume) {
        this.nume = nume;
        this.modPlata = new PlataCard();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public void realizeazaPlata(int suma){
        modPlata.plateste(suma, nume);
    }
}
