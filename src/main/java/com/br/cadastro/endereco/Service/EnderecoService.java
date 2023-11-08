package com.br.cadastro.endereco.Service;


import com.br.cadastro.endereco.Feign.EnderecoFeign;
import com.br.cadastro.endereco.Model.dto.EnderecoRequest;
import com.br.cadastro.endereco.Model.dto.EnderecoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EnderecoService {

    private final EnderecoFeign enderecoFeign;

    public EnderecoResponse executa(EnderecoRequest request){
        return enderecoFeign.buscaEnderecoCep(request.getCep());

    }
}
