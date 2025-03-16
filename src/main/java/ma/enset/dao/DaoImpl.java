package ma.enset.dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version de base de donnees");
        double t = 34;
        return t;
    }
}
