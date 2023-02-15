package com.senaictti.controller;

import com.senaictti.dao.FuncionarioDao;
import com.senaictti.model.Funcionario;
import com.senaictti.model.exception.DatabaseException;
import java.util.List;

public class FuncionarioController {
    
    FuncionarioDao fd = new FuncionarioDao();
    
    public FuncionarioController(){
    }
    
    public void cadastrarFuncionario(Funcionario f){
        fd.salvarFuncionario(f);
    }
    
    public List<Funcionario> listarTodosFuncionarios(){
        List<Funcionario> list = fd.listarTodosFuncionarios();
        return list;
    }
     
    public List<Funcionario> listarTodosFuncionariosAtivos(){
        List<Funcionario> list = fd.listarTodosFuncionariosAtivos();
        return list;
    }
    
    public List<Funcionario> listarTodosFuncionariosDesativados(){
        List<Funcionario> list = fd.listarTodosFuncionariosDesativados();
        return list;
    }
    public Funcionario listarporId(Integer id){
        Funcionario f = fd.listarFuncionarioPorId(id);
        if(f == null){
            throw new DatabaseException("Erro ao procurar por ID");
        }
        return f;
    }
    
    public List<Funcionario> listarFuncionarioPorNome(String nome){
        List<Funcionario> list = fd.listarFuncionarioPorNome(nome);
        return list;
    }
    
    public Funcionario listarFuncionarioPorNomeIndividual(String nome){
        Funcionario ff = fd.listarFuncionarioPorNomeIndividual(nome);
        return ff;
    }
    
    public Long contarFuncionarios(){
        Long num = fd.contarFuncionarios();
        return num;
    }
    
    public Double mediaSalarial(){
        Double num = fd.mediaSalarial();
        return num;
    }
    
    public Double totalSalarios(){
        Double num = fd.totalSalarios();
        return num;
    }
 
    public void apagarFuncionario(Integer id){
        fd.apagarFuncionario(id);
    }
 
    public void alterarFuncionario(Integer id, Funcionario f){
        fd.alterarFuncionario(id, f);
    }
    
    public boolean verificaEmail(String email){
        return fd.verificaEmail(email);
    }
    
    public boolean verificaCpf(String cpf){
        return fd.verificaCpf(cpf);
    }
    
    public boolean verificaCelular(String celular){
        return fd.verificaCelular(celular);
    }
}
