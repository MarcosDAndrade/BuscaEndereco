package com.br.cadastro.endereco.Model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@AllArgsConstructor
public class EnderecoResponse {

   private String cep;
   private String logradouro;
   private String bairro;
   private String localidade;
   private String uf;
}
