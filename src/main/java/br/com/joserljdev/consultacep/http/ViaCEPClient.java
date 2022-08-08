package br.com.joserljdev.consultacep.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.joserljdev.consultacep.model.Endereco;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface ViaCEPClient {

	@GetMapping(value = "{cep}/json")
	Endereco buscarEnderecoPorCEP(@PathVariable("cep") String cep);
}