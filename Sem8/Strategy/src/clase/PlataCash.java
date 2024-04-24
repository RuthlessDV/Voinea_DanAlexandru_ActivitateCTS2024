package clase;

public class PlataCash implements ModPlata {
    @Override
    public void plateste(int suma, String nume) {
        System.out.println(nume + "are de plata prin cash" + suma + "lei");
    }
}
