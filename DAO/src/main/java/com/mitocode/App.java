package com.mitocode;

import com.mitocode.dao.CRUD;
import com.mitocode.dao.PersonaDAOImpl;
import com.mitocode.model.Persona;

public class App {
	
	public static void main(String[] args) {
		CRUD<Persona> dao = new PersonaDAOImpl();
		dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));
		
		Persona per = new Persona();
		per.setNombres("uiversitaria");
		dao.registrar(per);
                
                Persona eli = new Persona();
		eli.setNombres("uiversitaria");
		dao.actualizar(eli);
                
	}

}
