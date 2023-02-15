package com.senaictti.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idcliente;
    private String nomec;
    private String cpfc;
    private String emailc;
    private String senhac;
    private String celularc;
    private String endereco;
    private String cep;
    private String bairro;
    private String municipio;
    private String estado;
    private String complemento;
    private String numero;
    private Integer ativo;
    private String plano;
    private String cartaoc;
    private String cvv;
    private String validade;
    private String titular;
    private LocalDate dataAssinatura;
   
    public Cliente(){
    }

    public Cliente(Integer idcliente, String nomec, String cpfc, String emailc, String senhac, String celularc, String endereco, String cep, String bairro, String municipio, String estado, String complemento, String numero, Integer ativo, String plano, String cartaoc, String cvv, String validade, String titular, LocalDate dataAssinatura) {
        this.idcliente = idcliente;
        this.nomec = nomec;
        this.cpfc = cpfc;
        this.emailc = emailc;
        this.senhac = senhac;
        this.celularc = celularc;
        this.endereco = endereco;
        this.cep = cep;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.complemento = complemento;
        this.ativo = ativo;
        this.numero = numero;
        this.plano = plano;
        this.cartaoc = cartaoc;
        this.cvv = cvv;
        this.validade = validade;
        this.titular = titular;
        this.dataAssinatura = dataAssinatura;
    }
    
     public Cliente(Integer idcliente, String nomec, String cpfc, String emailc, String senhac, String celularc, String endereco, String cep, String bairro, String municipio, String estado, String complemento, String numero, Integer ativo, String plano) {
        this.idcliente = idcliente;
        this.nomec = nomec;
        this.cpfc = cpfc;
        this.emailc = emailc;
        this.senhac = senhac;
        this.celularc = celularc;
        this.endereco = endereco;
        this.cep = cep;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.complemento = complemento;
        this.ativo = ativo;
        this.numero = numero;
        this.plano = plano;
    }
    
    public boolean validaCpf(String cpf){
        cpf = cpf.replaceAll("\\p{P}", "");
        String[] cpfArr = cpf.split("");
          
       int dig10 = Integer.parseInt(cpfArr[9]);
       int dig11 = Integer.parseInt(cpfArr[10]);
       
       int cont = 0, tot1 = 0;
       
       for(int i = 10; i >= 2; i--){
           int dig = Integer.parseInt(cpfArr[cont]);
           tot1 += dig * i;
           cont++;
       }
       
       int digV10 = 11 - (tot1 % 11);
       if(digV10 > 9){
           digV10 = 0;
       }
      
        cont = 0;
        int tot2 = 0;
       
       for(int i = 11; i >= 2; i--){
           int dig = Integer.parseInt(cpfArr[cont]);
           tot2 += dig * i;   
           cont++;
       }
       
       int digV11 = 11 - (tot2 % 11);
       if(digV11 > 9){
           digV11 = 0;
       }
       return  dig10 == digV10 && dig11 == digV11;
    }
   
    public boolean validaSenha(String senha){
        
        String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z]).{8,32}$";
        Pattern s = Pattern.compile(regex);
        return s.matcher(senha).matches();
    }
    
    public static String criptografaSenha(String senha) throws Exception{
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(senha.getBytes("utf8"),0,senha.length());
        return new BigInteger(1, m.digest()).toString(16);
    }
    
    public Double valorPlanoMensal(Integer quant){
        return quant * 49.99;
    }
    
    public Double valorPlanoSemestral(Integer quant){
        return quant * 269.99;
    }
    
    public Double valorPlanoAnual(Integer quant){
        return quant * 499.99;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getNomec() {
        return nomec;
    }

    public void setNomec(String nomec) {
        this.nomec = nomec;
    }

    public String getCpfc() {
        return cpfc;
    }

    public void setCpfc(String cpfc) {
        this.cpfc = cpfc;
    }

    public String getEmailc() {
        return emailc;
    }

    public void setEmailc(String emailc) {
        this.emailc = emailc;
    }

    public String getSenhac() {
        return senhac;
    }

    public void setSenhac(String senhac) {
        this.senhac = senhac;
    }

    public String getCelularc() {
        return celularc;
    }

    public void setCelularc(String celularc) {
        this.celularc = celularc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getCartaoc() {
        return cartaoc;
    }

    public void setCartaoc(String cartao) {
        this.cartaoc = cartao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getAtivo() {
        return ativo;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public LocalDate getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(LocalDate dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idcliente);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.idcliente, other.idcliente);
    }
}
