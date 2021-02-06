package br.com.gabrielle.modelo.dao.impl;

import br.com.gabrielle.db.DB;
import br.com.gabrielle.db.DbExcecao;
import br.com.gabrielle.modelo.dao.SellerDao;
import br.com.gabrielle.modelo.entidades.Department;
import br.com.gabrielle.modelo.entidades.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SellerDaoJDBC implements SellerDao {

    private Connection conn;

    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(SellerDao obj) {

    }

    @Override
    public void update(SellerDao obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(

                    "SELECT seller.*,department.Name as DepName" +
                            " FROM seller INNER JOIN department" +
                            " ON seller.DepartmentId = department.Id" +
                            " WHERE seller.Id = ?"
            );
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Seller func = new Seller(rs.getInt("Id"), rs.getString("Name"), rs.getString("Email"), rs.getDate("BirthDate"), rs.getDouble("BaseSalary"),
                        new Department(rs.getInt("Id"), rs.getString("Name")));
                return func;
            }
            return null;
        } catch (SQLException e) {
            throw new DbExcecao(e.getMessage());
        } finally {
            DB.fecharDeclaracao(st);
            DB.fecharResultado(rs);
        }

    }

    @Override
    public List<SellerDao> findAll() {
        return null;
    }


}
