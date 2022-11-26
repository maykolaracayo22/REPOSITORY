package com.mitocode.dao;

import com.mitocode.model.Persona;
import java.util.List;

public interface CRUD<T> {

	List<T> listarTodos();
	T leerPorId (int id);
	void registrar(T t);
	void actualizar(T t);
	void eliminar(int id);

    public void eliminar(Persona el);

    public void eliminar();
}
