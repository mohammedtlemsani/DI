package ma.enset.metier;

import ma.enset.dao.IDao;

public class IMetierImp implements IMetier{
    IDao dao;
    @Override
    public Double calcul() {
        double data = dao.getData();

        return (double) (data*12);
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
