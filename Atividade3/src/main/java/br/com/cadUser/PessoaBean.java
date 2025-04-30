package br.com.cadUser;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PessoaBean {
	
	
	public String adicionaNome() {
        if (nome != null && !nome.trim().isEmpty()) {
            nomesList.add(nome);
            nome = ""; // limpa o campo
        }
        return "";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<String> getNomesList() {
		return nomesList;
	}


	private String nome;
	private ArrayList<String> nomesList = new ArrayList<>();

}
