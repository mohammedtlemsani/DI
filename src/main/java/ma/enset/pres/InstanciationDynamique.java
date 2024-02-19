package ma.enset.pres;



import ma.enset.dao.IDao;
import ma.enset.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class InstanciationDynamique {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("src/pres/config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cmetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cmetier.newInstance();
        Method method = cmetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println("Version Dynamique : " + metier.calcul());
    }
    }
