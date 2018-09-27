package br.net.smi.lancamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.smi.lancamento.model.Lancamento;
import br.net.smi.lancamento.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}