package dev.wakandaacademy.produdoro.tarefa.domain;

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
@Document(collection = "Tarefa")
public class Tarefa {
	@Id
	private UUID idTarefa;
	private String nome;
	private String descricao;
	@Indexed
	private UUID idArea;
	@Indexed
	private UUID idUsuario;
	@Indexed
	private UUID idProjeto;
	@Builder.Default
	private StatusTarefa status = StatusTarefa.A_FAZER;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
