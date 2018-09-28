package br.net.smi.lancamento.repository.filter;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class LancamentoFilter {

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate vencimentoDe;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate vencimentoAte;

	public LocalDate getVencimentoDe() {
		return vencimentoDe;
	}

	public void setVencimentoDe(LocalDate vencimentoDe) {
		this.vencimentoDe = vencimentoDe;
	}

	public LocalDate getVencimentoAte() {
		return vencimentoAte;
	}

	public void setVencimentoAte(LocalDate vencimentoAte) {
		this.vencimentoAte = vencimentoAte;
	}

}