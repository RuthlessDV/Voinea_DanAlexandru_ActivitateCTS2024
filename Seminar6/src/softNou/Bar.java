package softNou;

import java.util.ArrayList;
import java.util.List;

public class Bar {

    public List<Bautura> getListaBauturi() {
        return listaBauturi;
    }

    private List<Bautura> listaBauturi;

    public Bar(){
        this.listaBauturi = new ArrayList<>();
    }

    public void adaugaBautura(Bautura bautura){
        this.listaBauturi.add(bautura);
    }

    public void printareNotaDePlata(){
        int total = 0;
        System.out.println("Lista de Bauturi:");
        for (Bautura bautura:listaBauturi
             ) {
            System.out.println(bautura.toString());
            total+=bautura.getPret();
        }
        System.out.println("Nota de plata este:" + total);
    }
}
