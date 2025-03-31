package com.matheusmendes.user.api.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private LocalDateTime dataCadastro;
}
