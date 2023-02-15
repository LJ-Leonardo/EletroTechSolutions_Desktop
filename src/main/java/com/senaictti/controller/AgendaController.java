package com.senaictti.controller;

import com.senaictti.dao.AgendaDao;
import com.senaictti.model.Agenda;
import com.senaictti.model.exception.DatabaseException;
import java.time.LocalDate;
import java.util.List;

public class AgendaController {

    AgendaDao fd = new AgendaDao();

    public AgendaController() {
    }
 
    public List<Agenda> listarTodasAgendas() {
        List<Agenda> list = fd.listarTodasAgendas();
        return list;
    }
    
    public List<Agenda> listarTodasAgendasPendentes() {
        List<Agenda> list = fd.listarTodasAgendasPendentes();
        return list;
    }
    
    public List<Agenda> listarTodasAgendasConcluidas() {
        List<Agenda> list = fd.listarTodasAgendasConcluidas();
        return list;
    }
    
    public Agenda listarporId(Integer id) {
        Agenda c = fd.listarAgendaPorId(id);
        return c;
    }

    public List<Agenda> listarTodasAgendasData(LocalDate dia) {
        List<Agenda> list = fd.listarTodasAgendasData(dia);
        return list;
    }
    
    public List<Agenda> listarTodasAgendasDataPendente(LocalDate dia) {
        List<Agenda> list = fd.listarTodasAgendasDataConcluido(dia);
        return list;
    }
    
    public List<Agenda> listarTodasAgendasDataConcluido(LocalDate dia) {
        List<Agenda> list = fd.listarTodasAgendasDataPendente(dia);
        return list;
    }
    
    public List<Agenda> listarTodasAgendasIdCliente(Integer id) {
        List<Agenda> list = fd.listarTodasAgendasIdCliente(id);
        return list;
    }
    
    public List<Agenda> listarTodasAgendasIdClientePendente(Integer id) {
        List<Agenda> list = fd.listarTodasAgendasIdClientePendente(id);
        return list;
    }
    
    public List<Agenda> listarTodasAgendasIdClienteConcluido(Integer id) {
        List<Agenda> list = fd.listarTodasAgendasIdClienteConcluido(id);
        return list;
    }
    
    public List<Agenda> listarTodasAgendasIdFuncionario(Integer id) {
        List<Agenda> list = fd.listarTodasAgendasIdFuncionario(id);
        return list;
    }
    
    public List<Agenda> listarTodasAgendasIdFuncionarioPendente(Integer id) {
        List<Agenda> list = fd.listarTodasAgendasIdFuncionarioPendente(id);
        return list;
    }
    
    public List<Agenda> listarTodasAgendasIdFuncionarioConcluido(Integer id) {
        List<Agenda> list = fd.listarTodasAgendasIdFuncionarioConcluido(id);
        return list;
    }
    
    public boolean listarFuncionariosDisponiveis(Integer idfun, LocalDate data, String horario){
        return fd.listarFuncionariosDisponiveis(idfun, data, horario);
    }
    
    public Long contarAgendamentos(LocalDate data1, LocalDate data2){
        Long num = fd.contarAgendamentos(data1, data2);
        return num;
    }
    
    public Double contarDinheiro(LocalDate data1, LocalDate data2){
        Double num = fd.contarDinheiro(data1, data2);
        return num;
    }
    
    public Long contarSolicitacaoPendente(){
        Long num = fd.contarSolicitacaoPendente();
        return num;
    }
    
    public Long contarSolicitacaoConcluida(){
        Long num = fd.contarSolicitacaoConcluida();
        return num;
    }
    
    public void alterarAgenda(Integer id, Agenda f){
        fd.alterarAgenda(id, f);
    }

    public void apagarAgenda(Integer id) {
        fd.apagarAgenda(id);
    }
}
