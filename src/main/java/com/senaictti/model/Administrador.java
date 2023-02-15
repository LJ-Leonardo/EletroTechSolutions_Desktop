package com.senaictti.model;

public class Administrador {
    public boolean validaUsuario(String usuario){
        String usuario1 = usuario;
        return usuario1.equals("EletroTech/admin");
    }
    
    public boolean validaSenha(String senha){
        String senha1 = senha;
        return senha1.equals("EletroTech12345@");
    }
}
