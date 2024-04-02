package softVechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie {

    private List<Produs> listaProduse;

    public Bucatarie() {
        this.listaProduse = new ArrayList<>();
    }

    public List<Produs> getListaProduse() {
        return listaProduse;
    }

    public void adaugareProdus(Produs produs){
        this.listaProduse.add(produs);
    }

    public void printareBon(){
        System.out.println("LISTA DE PRODUSE ESTE:"
        );
        float total = 0;
        for(int i=0; i< listaProduse.size();i++){
            System.out.println("Produsul:"+listaProduse.get(i));
            total = total+ listaProduse.get(i).getPret();
        }
        System.out.println("TOTALUL BONULUI ESTE:"+ total);
    }
}
