package br.com.gabrielle.modelo.dao;

import br.com.gabrielle.modelo.entidades.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj);

    void update(Department obj);

    void deleteById(Integer id);

    Department findById(Integer id);

    List<Department> findAll();


}
