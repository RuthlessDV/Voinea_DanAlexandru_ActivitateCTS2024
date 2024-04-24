package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> listaObservatori;

    public Subiect(List<Observer> listaObservatori) {
        this.listaObservatori = new ArrayList<>();
    }

    public void adaugaClient(Observer observer){

        listaObservatori.add(observer);
    }

    public void stergeClient(Observer observer){
        listaObservatori.remove(observer);
    }

    protected void notificaObservers(String mesaj){
        for (Observer observer:
             listaObservatori) {
            observer.primesteNotificare(mesaj);

        }
    }

    abstract public void notificareSchimbarePret();
    abstract public void notificareEveniment();

    abstract public void notificareSchimbareMeniu();

}
