package br.com.gabrielle.modelo.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Departamento implements Serializable {

    private Integer id;
    private String nome;
    public Departamento(Integer id, String nome){
        this.id = id;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "departament{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public static interface DepartamentDao {
    }
}
