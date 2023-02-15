package com.senaictti.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agenda")
public class Agenda implements Serializable {
    
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer idagenda;
   private Integer idfun;
   private Integer idcliente;
   private LocalDate dia;
   private String hora;
   private String descricao;
   private String formf;
   private Double preco;
   private String status;
   
   public Agenda(){
   }

    public Agenda(Integer idagenda, Integer idfun, Integer idcliente, LocalDate dia, String hora, String descricao, String formf, Double preco, String status) {
        this.idagenda = idagenda;
        this.idfun = idfun;
        this.idcliente = idcliente;
        this.dia = dia;
        this.hora = hora;
        this.descricao = descricao;
        this.formf = formf;
        this.status = status;
        this.preco = preco;
    }

    public Integer getIdagenda() {
        return idagenda;
    }

    public void setIdagenda(Integer idagenda) {
        this.idagenda = idagenda;
    }

    public Integer getIdfun() {
        return idfun;
    }

    public void setIdfun(Integer idfun) {
        this.idfun = idfun;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFormf() {
        return formf;
    }

    public void setFormf(String formf) {
        this.formf = formf;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idagenda);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agenda other = (Agenda) obj;
        return Objects.equals(this.idagenda, other.idagenda);
    }
}
