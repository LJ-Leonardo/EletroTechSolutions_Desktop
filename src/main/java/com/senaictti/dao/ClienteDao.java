package com.senaictti.dao;

import com.senaictti.database.Conexao;
import com.senaictti.model.Cliente;
import com.senaictti.model.exception.DatabaseException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ClienteDao {

    public ClienteDao() {
    }

    public void salvarCliente(Cliente c) {
        EntityManager em = Conexao.getCarregarConexao();
        try{
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();  
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao cadastrar um novo cliente.");
        }
        finally{
            em.close(); 
        }
    }

    public List<Cliente> listarTodosClientes() {
        EntityManager em = Conexao.getCarregarConexao();
        List<Cliente> c = new ArrayList<>();
        try{
        em.getTransaction().begin();
        String jpql = ("select c from Cliente c");
        Query query = em.createQuery(jpql);
        c = query.getResultList();
        em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todos os clientes");
        }
        finally{
            em.close(); 
        }
        return c;
    }
    
    public List<Cliente> listarTodosClientesAtivos(){
        EntityManager em = Conexao.getCarregarConexao();
        List<Cliente> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select c from Cliente c WHERE c.ativo = 1 ORDER BY c.idcliente ASC");
            Query query = em.createQuery(jpql);
            c = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todos os funcionários.");
        }
        finally{
            em.close();
        }
        return c;
    }
    
    public List<Cliente> listarTodosClientesDesativados(){
        EntityManager em = Conexao.getCarregarConexao();
        List<Cliente> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select c from Cliente c WHERE c.ativo = 0 ORDER BY c.idcliente ASC");
            Query query = em.createQuery(jpql);
            c = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todos os funcionários.");
        }
        finally{
            em.close();
        }
        return c;
    }

    public Cliente listarClientePorId(Integer id) {
        EntityManager em = Conexao.getCarregarConexao();
        Cliente c = new Cliente();
        try{
            c = em.find(Cliente.class, id);
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar o cliente por Id");
        }
        finally{
            em.close(); 
        }
        return c;
    }

    public List<Cliente> listarClientePorNome(String name) {
        EntityManager em = Conexao.getCarregarConexao();
        List<Cliente> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String sql = ("select c from Cliente c where c.nomec like :Nomec");
            Query query = em.createQuery(sql);
            query.setParameter("Nomec", "%" + name + "%");
            c = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar o Cliente por Nome.");
        }
        finally{
            em.close();
        }
        return c;
    }
    
    public List<Cliente> listarClienteSemPlano() {
        EntityManager em = Conexao.getCarregarConexao();
        List<Cliente> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String sql = ("select c from Cliente c where c.plano = NULL order by c.idcliente ASC");
            Query query = em.createQuery(sql);
            c = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar o Cliente que não possui plano.");
        }
        finally{
            em.close();
        }
        return c;
    }
    
    public List<Cliente> listarClientePorPlanoBronze() {
        EntityManager em = Conexao.getCarregarConexao();
        List<Cliente> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String sql = ("select c from Cliente c where c.plano = 'MENSAL' order by c.idcliente ASC");
            Query query = em.createQuery(sql);
            c = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar o Cliente por plano bronze.");
        }
        finally{
            em.close();
        }
        return c;
    }
    
    public List<Cliente> listarClientePorPlanoSilver() {
        EntityManager em = Conexao.getCarregarConexao();
        List<Cliente> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String sql = ("select c from Cliente c where c.plano = 'SEMESTRAL' order by c.idcliente ASC");
            Query query = em.createQuery(sql);
            c = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar o Cliente por plano silver.");
        }
        finally{
            em.close();
        }
        return c;
    }
    
    public List<Cliente> listarClientePorPlanoGold() {
        EntityManager em = Conexao.getCarregarConexao();
        List<Cliente> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String sql = ("select c from Cliente c where c.plano = 'ANUAL' order by c.idcliente ASC");
            Query query = em.createQuery(sql);
            c = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar o Cliente por plano gold.");
        }
        finally{
            em.close();
        }
        return c;
    }
    
    public Long contarClientes(){
        EntityManager em = Conexao.getCarregarConexao();
        Long num;
        try{
            String sql = ("select count(*) FROM Cliente where ativo = 1");
            Query query = em.createQuery(sql);
            num = (Long) query.getSingleResult();  
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao contar o total de clientes.");
        }
        finally{
            em.close(); 
        }
        return num;
    }
    
    public Long contarClientesBronze(){
        EntityManager em = Conexao.getCarregarConexao();
        Long num;
        try{
            String sql = ("select count(*) FROM Cliente where plano = 'MENSAL'");
            Query query = em.createQuery(sql);
            num = (Long) query.getSingleResult();  
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao contar o total de clientes com plano BRONZE.");
        }
        finally{
            em.close(); 
        }
        return num;
    }

    public Long contarClientesSilver(){
        EntityManager em = Conexao.getCarregarConexao();
        Long num;
        try{
            String sql = ("select count(*) FROM Cliente where plano = 'SEMESTRAL'");
            Query query = em.createQuery(sql);
            num = (Long) query.getSingleResult();  
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao contar o total de clientes com plano SILVER.");
        }
        finally{
            em.close(); 
        }
        return num;
    }
    
    public Long contarClientesGold(){
        EntityManager em = Conexao.getCarregarConexao();
        Long num;
        try{
            String sql = ("select count(*) FROM Cliente where plano = 'ANUAL'");
            Query query = em.createQuery(sql);
            num = (Long) query.getSingleResult();  
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao contar o total de clientes com plano GOLD.");
        }
        finally{
            em.close(); 
        }
        return num;
    }

    public void apagarCliente(Integer id) {
        EntityManager em = Conexao.getCarregarConexao();
        try{
            em.getTransaction().begin();
            Cliente c = em.find(Cliente.class, id);
            em.remove(c);
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao apagar o Cliente.");
        }
        finally{
            em.close();   
        }
    }
    
    public void alterarCliente(Integer id, Cliente c){
        EntityManager em = Conexao.getCarregarConexao();
        Cliente obj;
        try {
            obj = em.find(Cliente.class, id);
            alterarInformacao(obj, c);    
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao alterar o cliente.");
        }
        finally{
            em.close();
        }
    }
    
    private void alterarInformacao(Cliente obj, Cliente c) {
        obj.setNomec(c.getNomec());
        obj.setCelularc(c.getCelularc());
        obj.setEndereco(c.getEndereco());
        obj.setCep(c.getCep());
        obj.setBairro(c.getBairro());
        obj.setMunicipio(c.getMunicipio());
        obj.setEstado(c.getEstado());
        obj.setAtivo(c.getAtivo());
        obj.setComplemento(c.getComplemento());
        obj.setNumero(c.getNumero());
        obj.setPlano(c.getPlano());
    }
    
    public boolean verificaEmail(String email){
        EntityManager em = Conexao.getCarregarConexao();
        List<Cliente> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select c from Cliente c where c.emailc = :Emailc");
            Query query = em.createQuery(jpql);
            query.setParameter("Emailc", email);
            c = query.getResultList();
            em.getTransaction().commit();  
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao verificar disponiblidade do e-mail.");
        }
        finally{
            em.close();
        }
        return c.isEmpty();
    }
    
    public boolean verificaCpf(String cpf){
        EntityManager em = Conexao.getCarregarConexao();
        List<Cliente> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select c from Cliente c where c.cpfc = :Cpfc");
            Query query = em.createQuery(jpql);
            query.setParameter("Cpfc", cpf);
            c = query.getResultList();
            em.getTransaction().commit();  
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao verificar disponiblidade do CPF.");
        }
        finally{
            em.close();
        }
        return c.isEmpty();
    }
    
    public boolean verificaCelular(String celular){
        EntityManager em = Conexao.getCarregarConexao();
        List<Cliente> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select c from Cliente c where c.celularc = :celularC");
            Query query = em.createQuery(jpql);
            query.setParameter("celularC", celular);
            c = query.getResultList();
            em.getTransaction().commit();  
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao verificar disponiblidade do Celular.");
        }
        finally{
            em.close();
        }
        return c.isEmpty();
    }
    
    public boolean verificaCadastroFinanceiro(Integer id){
        EntityManager em = Conexao.getCarregarConexao(); 
        Cliente c = new Cliente();
        try{
            c = em.find(Cliente.class, id); 
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao verificar cadastro financeiro.");
        }
        finally{
            em.close();
        }
        return !(c.getCartaoc() == null && c.getCvv() == null && c.getValidade() == null && c.getTitular() == null);
    }
}
