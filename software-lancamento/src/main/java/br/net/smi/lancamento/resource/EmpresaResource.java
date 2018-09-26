package br.net.smi.lancamento.resource;


import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.HttpStatus;

import br.net.smi.lancamento.model.Empresa;
import br.net.smi.lancamento.repository.EmpresaRepository;
import br.net.smi.lancamento.service.EmpresaService;

@RestController
@RequestMapping("/empresas")
public class EmpresaResource {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private EmpresaService empresaService;
	
	
	@GetMapping
	public List<Empresa> listar() {
		return empresaRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Empresa> criar(@Valid @RequestBody Empresa empresa, HttpServletResponse response) {
		Empresa empresaSalva = empresaRepository.save(empresa);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(empresaSalva.getID()).toUri();
			response.setHeader("Location", uri.toASCIIString());
			
			return ResponseEntity.created(uri).body(empresaSalva);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Empresa> buscarPeloID(@PathVariable Long id) {
		Empresa empresa = empresaRepository.findOne(id);
		 return empresa != null ? ResponseEntity.ok(empresa) : ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long id) {
		empresaRepository.delete(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Empresa> atualizar(@PathVariable Long id, @Valid @RequestBody Empresa empresa) {
		Empresa empresaSalva = empresaService.atualizar(id, empresa);
		return ResponseEntity.ok(empresaSalva);
	}
	
}