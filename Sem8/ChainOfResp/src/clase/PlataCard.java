package clase;

public class PlataCard extends ModPlata {
    private float sold;

    public PlataCard(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(int suma, String nume) {
        if(sold>= suma){
           System.out.println(nume + "are de plata prin card" + suma + "lei");
        }
        else{
            super.succesor.plateste(suma,nume);
        }
    }
}
