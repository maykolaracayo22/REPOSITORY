package com.mitocode.dao;

import java.util.List;

import com.mitocode.model.Medico;
import com.mitocode.model.Persona;

public class MedicoDAOImpl implements MedicoDAO{

	@Override
	public List<Medico> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Medico leerPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrar(Medico medico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Medico medico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void curar() {
		// TODO Auto-generated method stub
		
	}

    @Override
    public void eliminar(Persona el) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
