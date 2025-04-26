package ma.enset.metier;

import ma.enset.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    private IDao dao; // couplage faible

    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implemente l'interface IDao
     * au moment de l'instantiation
     */
    public MetierImpl(@Qualifier("d") IDao dao) {
        this.dao = dao;
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
