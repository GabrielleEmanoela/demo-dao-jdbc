package br.com.gabrielle.aplicacao;

import br.com.gabrielle.modelo.dao.DaoFactory;
import br.com.gabrielle.modelo.dao.SellerDao;
import br.com.gabrielle.modelo.entidades.Seller;

public class Programa {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDAO();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}
