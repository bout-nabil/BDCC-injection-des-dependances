package ma.enset.pres;

import ma.enset.ext.DaoImplV2;
import ma.enset.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metierImpl = new MetierImpl();
        //metierImpl.setDao(d); // Injection des dependances via le setter
        System.out.println("RES = "+ metierImpl.calcul());
    }
}
