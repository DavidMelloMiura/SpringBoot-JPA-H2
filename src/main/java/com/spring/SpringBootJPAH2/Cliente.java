package com.spring.SpringBootJPAH2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Cria Get e Set e ToString Auto 
@AllArgsConstructor //Cria contrutor com propriedades
@NoArgsConstructor //Cria contrutor vazio - sem argumentos
@Builder //Cria objetos cliente
@Entity //Entidade de Banco de dados
@Table(name="tb_cliente")
public class Cliente implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //Gera id automaticamente
	private Long id;
	
	@Column(name = "nome", nullable = false) //Essa anotação não é obrigatoria, se não colocar vai criar o campo com o nome do atributo
	private String nome;
	
	@Column(name = "email") //se trocar o nome, na tabela vai o que esta dentro de aspas
	private String email;
	
	@Column(name = "cpf")
	private String cpf;

	
}
