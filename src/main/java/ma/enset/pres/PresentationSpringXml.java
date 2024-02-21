package ma.enset.pres;

import ma.enset.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class PresentationSpringXml {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
