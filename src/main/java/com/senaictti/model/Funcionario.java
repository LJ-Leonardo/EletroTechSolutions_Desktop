package com.senaictti.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idfun;
    private String nomef;
    private String cpff;
    private String especialidade;
    private String senhaf;
    private String emailf;
    private String celularf;
    private Double salario;
    private Integer ativo;
    
    public Funcionario() {
    }

    public Funcionario(Integer idfun, String nomef, String cpff, String especialidade, String senhaf, String emailf, String celularf, Double salario, Integer ativo) {
        this.idfun = idfun;
        this.nomef = nomef;
        this.cpff = cpff;
        this.especialidade = especialidade;
        this.senhaf = senhaf;
        this.emailf = emailf;
        this.celularf = celularf;
        this.salario = salario;
        this.ativo = ativo;
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
        
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{10,32}$";
        Pattern s = Pattern.compile(regex);
        return s.matcher(senha).matches();
    }
    
    public static String criptografaSenha(String senha) throws Exception{
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(senha.getBytes("utf8"),0,senha.length());
        return new BigInteger(1, m.digest()).toString(16);
    }
  
    public Integer getIdfun() {
        return idfun;
    }

    public void setIdfun(Integer idfun) {
        this.idfun = idfun;
    }

    public String getNomef() {
        return nomef;
    }

    public void setNomef(String nomef) {
        this.nomef = nomef;
    }

    public String getCpff() {
        return cpff;
    }

    public void setCpff(String cpff) {
        this.cpff = cpff;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSenhaf() {
        return senhaf;
    }

    public void setSenhaf(String senhaf) {
        this.senhaf = senhaf;
    }

    public String getEmailf() {
        return emailf;
    }

    public void setEmailf(String emailf) {
        this.emailf = emailf;
    }

    public String getCelularf() {
        return celularf;
    }

    public void setCelularf(String celularf) {
        this.celularf = celularf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getAtivo() {
        return ativo;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idfun);
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
        final Funcionario other = (Funcionario) obj;
        return Objects.equals(this.idfun, other.idfun);
    }
}
