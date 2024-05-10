package presentation;

import metier.IMetier;
import metier.MetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class PresWithSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext springContext=new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier=springContext.getBean(IMetier.class);
        System.out.println("------------- spring annotation version -------");
        metier.calcul();
    }
}
