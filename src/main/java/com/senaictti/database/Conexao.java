package com.senaictti.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
    
    public Conexao(){
    }
    
    private static EntityManagerFactory emf;
    
    public static EntityManagerFactory getConexao(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory("system-jpa");
        }
        return emf;
    }
    
    public static EntityManager getCarregarConexao(){
        return getConexao().createEntityManager();
    }
    
    public static void fecharConexao(){
        if(emf != null){
            emf.close();
        }
    }
}
