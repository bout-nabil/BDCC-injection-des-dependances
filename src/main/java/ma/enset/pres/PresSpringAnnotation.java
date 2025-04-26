package ma.enset.pres;

import ma.enset.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("ma.enset");
        IMetier iMetier = applicationContext.getBean(IMetier.class);
        System.out.println("RES = " + iMetier.calcul());
    }
}
