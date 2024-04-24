package clase;

public class PlataCard implements ModPlata{
    @Override
    public void plateste(int suma, String nume) {
        System.out.println(nume + "are de plata prin card" + suma + "lei");
    }
}
