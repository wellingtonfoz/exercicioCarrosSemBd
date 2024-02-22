package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Carro;

@Service
public class CarroService {
	List<Carro> lista = new ArrayList<>();

	public String save(Carro carro) {
		lista.add(carro);
		return carro.getNome()+ " salvo com sucesso";
	}

	public String update(Carro carro) {
		
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == carro.getId()) {
					lista.set(i, carro);
					return carro.getNome()+ " alterado com sucesso";
				}
			}

		return "carro não encontrado para alterar";
	}

	public List<Carro> listAll(){

		Carro carro = new Carro(1, "AAA", "BBB", "CCC");
		Carro carro2 = new Carro(2, "ABC", "BBB", "CCC");
		Carro carro3 = new Carro(3, "DDD", "BBB", "CCC");

		lista.add(carro);
		lista.add(carro2);
		lista.add(carro3);

		return lista;

	}

	public Carro findById(long idCarro) {

		// banco de dados
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idCarro) {
					return lista.get(i);
				}
			}

		return null;

	}

	public String delete(long idCarro) {

		// banco de dados
		lista = this.listAll();

		if(lista != null)
			for(int i=0; i<lista.size(); i++) {
				if(lista.get(i).getId() == idCarro) {
					lista.remove(lista.get(i));
					return "Deletado com sucesso";
				}
			}

		return "Não encontrado para deletar";

	}

}
