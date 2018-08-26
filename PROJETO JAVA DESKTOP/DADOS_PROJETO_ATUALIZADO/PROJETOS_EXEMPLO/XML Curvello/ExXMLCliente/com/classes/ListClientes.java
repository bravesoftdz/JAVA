package com.classes;
import java.util.List;
import java.util.ArrayList;

public class ListClientes {
	
	List<Clientes> lista = new ArrayList<Clientes>();
	
	public void inserir(Clientes cli){
		lista.add(cli);
	}
	
	public List<Clientes> getLista(){
		return lista;
	}
	
	
}
