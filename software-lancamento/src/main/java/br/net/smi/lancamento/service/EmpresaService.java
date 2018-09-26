package br.net.smi.lancamento.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.net.smi.lancamento.model.Empresa;
import br.net.smi.lancamento.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;

	public Empresa atualizar(Long codigo, Empresa empresa) {
		Empresa empresaSalva = empresaRepository.findOne(codigo);
		if (empresaSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		BeanUtils.copyProperties(empresa, empresaSalva, "codigo");
		return empresaRepository.save(empresaSalva);
	}
	
}
