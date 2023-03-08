package dev.wakandaacademy.produdoro.pomodoro.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "ConfiguracaoPadraoPomodoro")
public class ConfiguracaoPadrao {
	private static final String CODIGO_DEFAULT = "DEFAULT";
	
	@MongoId(targetType = FieldType.STRING)
	@Builder.Default
	private String codigo = CODIGO_DEFAULT;
	private Integer tempoMinutosFoco;
	private Integer tempoMinutosPausaCurta;
	private Integer tempoMinutosPausaLonga;
	private Integer repeticoesParaPausaLonga;
	

}
