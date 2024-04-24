package clase;

import java.util.List;

public class Restaurant extends Subiect{
    private String adresa;
    public Restaurant(List<Observer> listaObservatori, String adresa) {
        super(listaObservatori);
        this.adresa = adresa;
    }

    @Override
    public void notificareSchimbarePret() {
        super.notificaObservers("Rest de la adresa" + adresa + "si-a schimbat pretul");
    }

    @Override
    public void notificareEveniment() {
        super.notificaObservers("Rest de la adresa" + adresa + "are in plan un nou eveniment");
    }

    @Override
    public void notificareSchimbareMeniu() {
        super.notificaObservers("Rest de la adresa" + adresa + "si-a schimbat meniul");
    }
}
