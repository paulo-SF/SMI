package br.net.smi.lancamento.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.net.smi.lancamento.model.Lancamento;
import br.net.smi.lancamento.repository.LancamentoRepository;

@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento atualizar(Long codigo, Lancamento lancamento) {
		Lancamento lancamentoSalva = lancamentoRepository.findOne(codigo);
		if (lancamentoSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}

		BeanUtils.copyProperties(lancamento, lancamentoSalva, "codigo");
		return lancamentoRepository.save(lancamentoSalva);
	}

}