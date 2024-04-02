package softVechi;

public class Produs {

    private String denumire;
    private float pret;

    public String getDenumire() {
        return denumire;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }

    public float getPret() {
        return pret;
    }

    public Produs(String denumire, float pret){
        this.denumire = denumire;
        this.pret = pret;
    }

}
