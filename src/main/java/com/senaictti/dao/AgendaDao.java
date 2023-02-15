package com.senaictti.dao;

import com.senaictti.database.Conexao;
import com.senaictti.model.Agenda;
import com.senaictti.model.exception.DatabaseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class AgendaDao {

    public AgendaDao() {
    }

    public List<Agenda> listarTodasAgendas() {
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> a = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a order by a.status DESC");
            Query query = em.createQuery(jpql);
            a = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todas as agendas.");
        }
        finally{
            em.close();
        }
        return a;
    }
    
    public List<Agenda> listarTodasAgendasPendentes(){
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a WHERE a.status = 'PENDENTE' order by a.dia, a.hora ASC");
            Query query = em.createQuery(jpql);
            c = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todos os agendamentos pendentes.");
        }
        finally{
            em.close();
        }
        return c;
    }
    
     public List<Agenda> listarTodasAgendasConcluidas(){
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> a = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a WHERE a.status = 'CONCLUIDO' order by a.dia, a.hora ASC");
            Query query = em.createQuery(jpql);
            a = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todos os agendamentos concluidos.");
        }
        finally{
            em.close();
        }
        return a;
    }
     
    public List<Agenda> listarTodasAgendasIdCliente(Integer idCliente) {
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> a = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a WHERE a.idcliente = :idCliente order by a.dia, a.hora ASC");
            Query query = em.createQuery(jpql);
            query.setParameter("idCliente", idCliente);
            a = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todas as agendas relacionadas a esse cliente.");
        }
        finally{
            em.close();
        }
        return a;
    }
    
    public List<Agenda> listarTodasAgendasIdClientePendente(Integer idCliente) {
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> a = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a WHERE a.idcliente = :idCliente AND a.status = 'PENDENTE' order by a.dia, a.hora ASC");
            Query query = em.createQuery(jpql);
            query.setParameter("idCliente", idCliente);
            a = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todas as agendas relacionadas a esse cliente.");
        }
        finally{
            em.close();
        }
        return a;
    }
    
    
    public List<Agenda> listarTodasAgendasIdClienteConcluido(Integer idCliente) {
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> a = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a WHERE a.idcliente = :idCliente AND a.status = 'CONCLUIDO' order by a.dia, a.hora ASC");
            Query query = em.createQuery(jpql);
            query.setParameter("idCliente", idCliente);
            a = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todas as agendas relacionadas a esse cliente.");
        }
        finally{
            em.close();
        }
        return a;
    }
    
    public List<Agenda> listarTodasAgendasIdFuncionario(Integer idFuncionario) {
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> a = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a WHERE a.idfun = :idFun order by a.dia, a.hora ASC");
            Query query = em.createQuery(jpql);
            query.setParameter("idFun", idFuncionario);
            a = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar todas as agendas relacionadas a esse funcionário.");
        }
        finally{
            em.close();
        }
        return a;
    }
    
    public List<Agenda> listarTodasAgendasIdFuncionarioPendente(Integer idFuncionario) {
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> a = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a WHERE a.idfun = :idFuncionario AND a.status = 'PENDENTE' order by a.dia, a.hora ASC");
            Query query = em.createQuery(jpql);
            query.setParameter("idFuncionario", idFuncionario);
            a = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            em.close();
        }
        return a;
    }
    
    public List<Agenda> listarTodasAgendasIdFuncionarioConcluido(Integer idFuncionario) {
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> a = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a WHERE a.idfun = :idFuncionario AND a.status = 'CONCLUIDO' order by a.dia, a.hora ASC");
            Query query = em.createQuery(jpql);
            query.setParameter("idFuncionario", idFuncionario);
            a = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            em.close();
        }
        return a;
    }

    public Agenda listarAgendaPorId(Integer id) {
        EntityManager em = Conexao.getCarregarConexao();
        Agenda c = new Agenda();
        try{
            c = em.find(Agenda.class, id);
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar a agenda por ID.");
        }
        finally{
            em.close();
        }
        return c;
    }

    public List<Agenda> listarTodasAgendasData(LocalDate dia) {
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a where a.dia = :dia order by a.dia, a.hora ASC");
            Query query = em.createQuery(jpql);
            query.setParameter("dia", dia);
            c = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar as agendas por Data");
        }
        finally{
            em.close();
        }
        return c;
    }
    
    public List<Agenda> listarTodasAgendasDataPendente(LocalDate dia) {
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a where a.dia = :dia AND a.status = 'PENDENTE' order by a.dia, a.hora ASC");
            Query query = em.createQuery(jpql);
            query.setParameter("dia", dia);
            c = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar as agendas por Data");
        }
        finally{
            em.close();
        }
        return c;
    }
    
    public List<Agenda> listarTodasAgendasDataConcluido(LocalDate dia) {
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a where a.dia = :dia AND a.status = 'CONCLUIDO' order by a.dia, a.hora ASC");
            Query query = em.createQuery(jpql);
            query.setParameter("dia", dia);
            c = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao listar as agendas por Data");
        }
        finally{
            em.close();
        }
        return c;
    }
    
    public boolean listarFuncionariosDisponiveis(Integer idfun, LocalDate data, String horario) {
        EntityManager em = Conexao.getCarregarConexao();
        List<Agenda> c = new ArrayList<>();
        try{
            em.getTransaction().begin();
            String jpql = ("select a from Agenda a where a.dia = :dia AND a.idfun = :idfun AND a.hora = :hora");
            Query query = em.createQuery(jpql);
            query.setParameter("dia", data);
            query.setParameter("idfun", idfun);
            query.setParameter("hora", horario);
            c = query.getResultList();
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao verificar a disponibilidade desse funcionario");
        }
        finally{
            em.close();
        }
        return c.isEmpty();
    }
    
    public Long contarAgendamentos(LocalDate data1, LocalDate data2){
        EntityManager em = Conexao.getCarregarConexao();
        Long num;
        try{
            String sql = ("select count(*) FROM Agenda where dia between :data1 and :data2"); 
            Query query = em.createQuery(sql);
            query.setParameter("data1", data1);
            query.setParameter("data2", data2);
            num = (Long) query.getSingleResult(); 
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao contar o total de Agendamentos nesse período");
        }
        finally{
            em.close();
        }
        return num;
    }
    
    public Double contarDinheiro(LocalDate data1, LocalDate data2){
        EntityManager em = Conexao.getCarregarConexao();
        Double num;
        try{
            String sql = ("select SUM(preco) FROM Agenda where dia between :data1 and :data2"); 
            Query query = em.createQuery(sql);
            query.setParameter("data1", data1);
            query.setParameter("data2", data2);
            num = (Double) query.getSingleResult(); 
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao contar o valor arrecadado pelos Agendamentos nesse período");
        }
        finally{
            em.close();
        }
        return num;
    }
    
    public Long contarSolicitacaoConcluida(){
        EntityManager em = Conexao.getCarregarConexao();
        Long num;
        try{
            String sql = ("select count(*) FROM Agenda where status = 'CONCLUIDO'");
            Query query = em.createQuery(sql);
            num = (Long) query.getSingleResult(); 
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao contar o total de Solicitações Concluídas");
        }
        finally{
            em.close();
        }
        return num;
    }

     public Long contarSolicitacaoPendente(){
        EntityManager em = Conexao.getCarregarConexao();
        Long num;
        try{
            String sql = ("select count(*) FROM Agenda where status = 'PENDENTE'");
            Query query = em.createQuery(sql);
            num = (Long) query.getSingleResult();  
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao contar o total de Solicitações Pendentes.");
        }
        finally{
            em.close();
        }
        return num;
    }
     
    public void alterarAgenda(Integer id, Agenda f){
        EntityManager em = Conexao.getCarregarConexao();
        Agenda obj;
        try{
            obj = em.find(Agenda.class, id);
            alterarInformacao(obj, f);
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao alterar a agenda.");
        }
        finally{
            em.close();
        } 
    }
    
    private void alterarInformacao(Agenda obj, Agenda f) {
        obj.setIdfun(f.getIdfun());
    }
    
    public void apagarAgenda(Integer id) {
        EntityManager em = Conexao.getCarregarConexao();
        Agenda c;
        try{
            em.getTransaction().begin();
            c = em.find(Agenda.class, id);
            em.remove(c);
            em.getTransaction().commit();
        }
        catch(Exception e){
            throw new DatabaseException("Erro ao apagar a agenda");
        }
        finally{
            em.close();
        }  
    }
}
