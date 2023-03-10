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
	public UUID getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(UUID idProjeto) {
		this.idProjeto = idProjeto;
	}
	public UUID getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(UUID idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public UUID getIdArea() {
		return idArea;
	}
	public void setIdArea(UUID idArea) {
		this.idArea = idArea;
	}
	
	
	
	

}
