package br.com.gabrielle.modelo.dao;

import br.com.gabrielle.modelo.entidades.Departamento;

import java.util.List;

public interface SellerDao {
    void insert(SellerDao obj);

    void update(SellerDao obj);

    void deleteById(Integer id);

    SellerDao findById(Integer id);

    List<SellerDao> findAll();

}