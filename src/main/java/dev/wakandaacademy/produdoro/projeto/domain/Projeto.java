package dev.wakandaacademy.produdoro.projeto.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "Projeto")
public class Projeto {
	@Id
	private UUID idProjeto;
	@Indexed
	private UUID idUsuario;
	private String nome;
	private String descricao;
	@Indexed
	private UUID idArea;
	
	
	

}
