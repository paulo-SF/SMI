package br.net.smi.lancamento.repository.empresa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.net.smi.lancamento.model.Empresa;
import br.net.smi.lancamento.repository.filter.EmpresaFilter;

public interface EmpresaRepositoryQuery {

	public Page<Empresa> filtrar(EmpresaFilter empresaFilter, Pageable pageable);
	
} 