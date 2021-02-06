package br.com.gabrielle.aplicacao;


import java.util.Date;


import br.com.gabrielle.modelo.dao.SellerDao;
import br.com.gabrielle.modelo.entidades.Department;
import br.com.gabrielle.modelo.entidades.Seller;
import br.com.gabrielle.modelo.dao.DaoFactory;

public class Programa {

	public static void main(String[] args) {


		Department obj = new Department(1, "Books");

		System.out.println(obj);
		Seller seller = new Seller(21, "Bob", "gabi@gmail.com", new Date(), 3500, obj);

		SellerDao sellerDao =  DaoFactory.createSellerDAO();


		System.out.println(seller);

	}
}
