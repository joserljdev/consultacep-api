package br.com.joserljdev.consultacep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joserljdev.consultacep.http.ViaCEPClient;
import br.com.joserljdev.consultacep.model.Endereco;

@Service
public class ViaCEPService {

	@Autowired
	private ViaCEPClient client;

	public Endereco buscarEnderecoPeloCEP(String cep) {
		return this.client.buscarEnderecoPorCEP(cep);
	}
}