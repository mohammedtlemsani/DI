package ma.enset.metier;

import ma.enset.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImp implements IMetier{
    @Autowired
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
