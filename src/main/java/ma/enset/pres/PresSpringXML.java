package ma.enset.pres;

import ma.enset.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        IMetier iMetier= springContext.getBean(IMetier.class);
        System.out.println("RES = " + iMetier.calcul());
    }
}
