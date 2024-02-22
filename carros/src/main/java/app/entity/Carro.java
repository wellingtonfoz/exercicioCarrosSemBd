package app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Carro {
	
	private long id;
	private String nome;
	private String marca;
	private String modelo;


}
