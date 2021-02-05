package br.com.gabrielle.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Funcionario implements Serializable {

    private Integer id;
    private  String nome;
    private String email;
    private Date aniversario;
    private  double baseSalario;


    private Departamento departamento;

    public Funcionario(){

    }

    public Funcionario(Integer id, String nome, String email, Date aniversario, double baseSalario, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
        this.baseSalario = baseSalario;
        this.departamento = departamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    public double getBaseSalario() {
        return baseSalario;
    }

    public void setBaseSalario(double baseSalario) {
        this.baseSalario = baseSalario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", aniversario=" + aniversario +
                ", baseSalario=" + baseSalario +
                ", departamento=" + departamento +
                '}';
    }
}
