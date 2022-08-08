package br.com.joserljdev.consultacep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joserljdev.consultacep.model.Endereco;
import br.com.joserljdev.consultacep.service.ViaCEPService;

@RestController
@RequestMapping(value = "/endereco/cep")
public class ViaCEPController {

	@Autowired
	private ViaCEPService service;

	@GetMapping(value = "/{cep}")
	public ResponseEntity<Endereco> buscarEnderecoPeloCEP(@PathVariable("cep") String cep) {
		Endereco endereco = this.service.buscarEnderecoPeloCEP(cep);

		return endereco.getCep() != null ? ResponseEntity.ok(endereco) : ResponseEntity.notFound().build();
	}
}