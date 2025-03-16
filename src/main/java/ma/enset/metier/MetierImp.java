package ma.enset.metier;

import ma.enset.dao.IDao;

public class MetierImp implements IMetier{
    private IDao dao; // couplage faible

    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implemente l'interface IDao
     * au moment de l'instantiation
     */
    public MetierImp(IDao dao) {
        this.dao = dao;
    }

    public MetierImp() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double result = t * 144;
        return result;
    }

    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implemente l'interface IDao
     * apres l'instantiation
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
