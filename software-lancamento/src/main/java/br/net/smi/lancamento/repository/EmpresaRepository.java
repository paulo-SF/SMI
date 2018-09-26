package br.net.smi.lancamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.smi.lancamento.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}