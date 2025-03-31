package com.matheusmendes.user.api.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.matheusmendes.user.api.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    
    private UUID id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private LocalDateTime dataCadastro;


    public static UserDTO convert(User usr){
        UserDTO user = new UserDTO();
        user.setId(usr.getId());
        user.setNome(usr.getNome());
        user.setCpf(usr.getCpf());
        user.setTelefone(usr.getTelefone());
        user.setEndereco(usr.getEndereco());
        user.setDataCadastro(usr.getDataCadastro());
        
        return user;
    };
}
