package br.com.gabrielle.modelo.dao;

import br.com.gabrielle.db.DB;
import br.com.gabrielle.modelo.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDAO() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
