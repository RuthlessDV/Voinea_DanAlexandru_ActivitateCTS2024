package clase;

public class PlataCash extends ModPlata {
    private int sumaDeBani;
    @Override
    public void plateste(int suma, String nume) {
        if(sumaDeBani>= suma){
            System.out.println(nume + "are de plata prin card" + suma + "lei");
        }
        else{
            super.succesor.plateste(suma,nume);
        }
    }
}
