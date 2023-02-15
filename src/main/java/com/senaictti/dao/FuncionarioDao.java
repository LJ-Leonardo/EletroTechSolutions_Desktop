package com.senaictti.dao;

import com.senaictti.database.Conexao;
import com.senaictti.model.Funcionario;
import com.senaictti.model.exception.DatabaseException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class FuncionarioDao {
    
    public FuncionarioDao(){
    }
    
    public void salvarFuncionario(Funcionario f){
        EntityManager em = Conexao.getCarregarConexao();
        try{
            em.getTransaction().begin();
            em.persist(f);
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao salvar o funcionário");
        }
        finally{
            em.close(); 
        } 
    }
    
    public List<Funcionario> listarTodosFuncionarios(){
        EntityManager em = Conexao.getCarregarConexao();
        List<Funcionario> f = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select f from Funcionario f ORDER BY f.ativo DESC");
            Query query = em.createQuery(jpql);
            f = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todos os funcionários.");
        }
        finally{
            em.close();
        }
        return f;
    }
    
    public List<Funcionario> listarTodosFuncionariosAtivos(){
        EntityManager em = Conexao.getCarregarConexao();
        List<Funcionario> f = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select f from Funcionario f WHERE f.ativo = 1 ORDER BY f.idfun ASC");
            Query query = em.createQuery(jpql);
            f = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todos os funcionários.");
        }
        finally{
            em.close();
        }
        return f;
    }
    
    public List<Funcionario> listarTodosFuncionariosDesativados(){
        EntityManager em = Conexao.getCarregarConexao();
        List<Funcionario> f = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select f from Funcionario f WHERE f.ativo = 0 ORDER BY f.idfun ASC");
            Query query = em.createQuery(jpql);
            f = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todos os funcionários.");
        }
        finally{
            em.close();
        }
        return f;
    }
    
    public Funcionario listarFuncionarioPorId(Integer id){
        EntityManager em = Conexao.getCarregarConexao();
        Funcionario f = new Funcionario();
        try{
            f = em.find(Funcionario.class, id);
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar funcionário por ID.");
        }
        finally{
           em.close(); 
        }
        return f;
    }
    
    public List<Funcionario> listarFuncionarioPorNome(String name){
        EntityManager em = Conexao.getCarregarConexao();
        List<Funcionario> f = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select f from Funcionario f where f.nomef like :Nomef");
            Query query = em.createQuery(jpql);
            query.setParameter("Nomef",  "%" + name + "%");
            f = query.getResultList();
            em.getTransaction().commit(); 
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar funcionário por nome.");
        }
        finally{
            em.close();
        }
        return f;
    }
    
    public Funcionario listarFuncionarioPorNomeIndividual(String name){
        EntityManager em = Conexao.getCarregarConexao();
        Funcionario f;
        try{
            em.getTransaction().begin();
            String jpql = ("select f from Funcionario f where f.nomef = :Nomef");
            Query query = em.createQuery(jpql);
            query.setParameter("Nomef",  name);
            f = (Funcionario) query.getSingleResult();
            em.getTransaction().commit(); 
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar funcionário por nome.");
        }
        finally{
            em.close();
        }
        return f;
    }
    
    public Long contarFuncionarios(){
        EntityManager em = Conexao.getCarregarConexao();
        Long num;
        try{
            String sql = ("select count(*) FROM Funcionario WHERE ativo = 1");
            Query query = em.createQuery(sql);
            num = (Long) query.getSingleResult(); 
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao contar o total de Funcionários");
        }
        finally{
            em.close();
        }
        return num;
    }
    
    public Double mediaSalarial(){
        EntityManager em = Conexao.getCarregarConexao();
        Double salarios;
        Double media;
        try{
            String sql = ("select SUM(salario) FROM Funcionario WHERE ativo = 1");
            Query query = em.createQuery(sql);
            
            salarios = (Double) query.getSingleResult();
            
            media = salarios / Double.valueOf(contarFuncionarios());
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao contar a média salárial dos funcionários");
        }
        finally{
            em.close();
        }
        return media;
    }
    
    public Double totalSalarios(){
        EntityManager em = Conexao.getCarregarConexao();
        Double salarios;
        try{
            String sql = ("select SUM(salario) FROM Funcionario WHERE ativo = 1");
            Query query = em.createQuery(sql);
            
            salarios = (Double) query.getSingleResult();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao contar o salário total dos funcionários");
        }
        finally{
            em.close();
        }
        return salarios;
    }
    
    public void apagarFuncionario(Integer id){
        EntityManager em = Conexao.getCarregarConexao();
        Funcionario f;
        try{
            em.getTransaction().begin();
            f = em.find(Funcionario.class, id);
            em.remove(f);
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao apagar funcionário.");
        }  
        finally{
            em.close();
        }
    }
    
    public void alterarFuncionario(Integer id, Funcionario f){
        EntityManager em = Conexao.getCarregarConexao();
        Funcionario obj;
        try{
            obj = em.find(Funcionario.class, id);
            alterarInformacao(obj, f);
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao alterar o funcionário.");
        }
        finally{
            em.close();
        } 
    }
    
    private void alterarInformacao(Funcionario obj, Funcionario f) {
        obj.setNomef(f.getNomef());
        obj.setCpff(f.getCpff());
        obj.setEspecialidade(f.getEspecialidade());
        obj.setSenhaf(f.getSenhaf());
        obj.setEmailf(f.getEmailf());
        obj.setCelularf(f.getCelularf());
        obj.setSalario(f.getSalario());
        obj.setAtivo(f.getAtivo());
    }
    
    public boolean verificaEmail(String email){
        EntityManager em = Conexao.getCarregarConexao();
        List<Funcionario> f = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select f from Funcionario f where f.emailf = :Emailf");
            Query query = em.createQuery(jpql);
            query.setParameter("Emailf", email);
            f = query.getResultList();
            em.getTransaction().commit();  
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao verificar disponiblidade do e-mail.");
        }
        finally{
            em.close();
        }
        return f.isEmpty();
    }
    
    public boolean verificaCpf(String cpf){
        EntityManager em = Conexao.getCarregarConexao();
        List<Funcionario> f = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select f from Funcionario f where f.cpff = :Cpff");
            Query query = em.createQuery(jpql);
            query.setParameter("Cpff", cpf);
            f = query.getResultList();
            em.getTransaction().commit();  
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao verificar disponiblidade do CPF.");
        }
        finally{
            em.close();
        }
        return f.isEmpty();
    }
    
    public boolean verificaCelular(String celular){
        EntityManager em = Conexao.getCarregarConexao();
        List<Funcionario> f = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select f from Funcionario f where f.celularf = :celularF");
            Query query = em.createQuery(jpql);
            query.setParameter("celularF", celular);
            f = query.getResultList();
            em.getTransaction().commit();  
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao verificar disponiblidade do celular.");
        }
        finally{
            em.close();
        }
        return f.isEmpty();
    }
}
