package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresWithSpringXml {
    public static void main(String[] args) {
        ApplicationContext springContext=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=springContext.getBean(IMetier.class);
        System.out.println("------------- spring xml version -------");
        metier.calcul();
    }
}
