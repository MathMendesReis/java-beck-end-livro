package com.matheusmendes.user.api.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.matheusmendes.user.api.dto.UserDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private LocalDateTime dataCadastro;

    public static User convert(UserDTO usr){
        User user = new User();
        user.setNome(usr.getNome());
        user.setCpf(usr.getCpf());
        user.setTelefone(usr.getTelefone());
        user.setEndereco(usr.getEndereco());
        user.setDataCadastro(usr.getDataCadastro());
        return user;
    };
}
