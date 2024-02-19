package ma.enset.pres;


import ma.enset.dao.IDaoImp;
import ma.enset.metier.IMetierImp;

public class InstanciationStatique {
    public static void main(String[] args) {
        IDaoImp dao = new IDaoImp();
        IMetierImp metier = new IMetierImp();
        metier.setDao(dao);
        System.out.println("version Statique : "+ metier.calcul());
    }
}
