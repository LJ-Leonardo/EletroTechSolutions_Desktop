package com.senaictti.controller;

import com.senaictti.dao.ClienteDao;
import com.senaictti.model.Cliente;
import com.senaictti.model.exception.DatabaseException;
import java.util.List;

public class ClienteController {
    
    ClienteDao cd = new ClienteDao();
    
    public ClienteController(){
    }
    
    public void cadastrarCliente(Cliente c){
        cd.salvarCliente(c);
    }
    
    public List<Cliente> listarTodosClientes(){
        List<Cliente> list = cd.listarTodosClientes();
        return list;
    }
    
    public List<Cliente> listarTodosClientesAtivos(){
        List<Cliente> list = cd.listarTodosClientesAtivos();
        return list;
    }
    
    public List<Cliente> listarTodosClientesDesativados(){
        List<Cliente> list = cd.listarTodosClientesDesativados();
        return list;
    }
    
    public Cliente listarporId(Integer id){
        Cliente c = cd.listarClientePorId(id);
        if(c == null){
            throw new DatabaseException("Erro ao procurar por ID");
        }
        return c;
    }
    
    public List<Cliente> listarClientePorNome(String nome){
        List<Cliente> list = cd.listarClientePorNome(nome);
        return list;
    }
    
    public List<Cliente> listarClienteSemPlano(){
        List<Cliente> list = cd.listarClienteSemPlano();
        return list;
    }
    
    public List<Cliente> listarClientePorPlanoBronze(){
        List<Cliente> list = cd.listarClientePorPlanoBronze();
        return list;
    }
    
    public List<Cliente> listarClientePorPlanoSilver(){
        List<Cliente> list = cd.listarClientePorPlanoSilver();
        return list;
    }
    
    public List<Cliente> listarClientePorPlanoGold(){
        List<Cliente> list = cd.listarClientePorPlanoGold();
        return list;
    }
    
    public Long contarClientes(){
        Long num = cd.contarClientes();
        return num;
    }
    
    public Long contarClientesBronze(){
        Long num = cd.contarClientesBronze();
        return num;
    }
    
    public Long contarClientesSilver(){
        Long num = cd.contarClientesSilver();
        return num;
    }
    
    public Long contarClientesGold(){
        Long num = cd.contarClientesGold();
        return num;
    }
   
    public void apagarCliente(Integer id){
        cd.apagarCliente(id);
    }
    
    public void alterarCliente(Integer id, Cliente c){
       cd.alterarCliente(id, c);
    }
    
    public boolean verificaEmail(String email){
        return cd.verificaEmail(email);
    }
    
    public boolean verificaCpf(String cpf){
        return cd.verificaCpf(cpf);
    }
    
    public boolean verificaCadastroFinanceiro(Integer id){
        return cd.verificaCadastroFinanceiro(id);
    }
    
    public boolean verificaCelular(String celular){
        return cd.verificaCelular(celular);
    }
}