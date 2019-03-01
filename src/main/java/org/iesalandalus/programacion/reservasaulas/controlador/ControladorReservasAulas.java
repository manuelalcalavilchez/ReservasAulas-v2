/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.reservasaulas.modelo;

import java.util.List;
import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.reservasaulas.modelo.dao.Aulas;
import org.iesalandalus.programacion.reservasaulas.modelo.dao.Profesores;
import org.iesalandalus.programacion.reservasaulas.modelo.dao.Reservas;
import org.iesalandalus.programacion.reservasaulas.modelo.dominio.Aula;
import org.iesalandalus.programacion.reservasaulas.modelo.dominio.permanencia.Permanencia;
import org.iesalandalus.programacion.reservasaulas.modelo.dominio.Profesor;
import org.iesalandalus.programacion.reservasaulas.modelo.dominio.Reserva;
import org.iesalandalus.programacion.reservasaulas.vista.Consola;
import org.iesalandalus.programacion.reservasaulas.vista.Opcion;
import org.iesalandalus.programacion.reservasaulas.vista.VistaReservasAulas;

//prueba para comprobacion de paquetes
/**
 *
 * @author Manuel
 */
public class ControladorReservasAulas {
    
        private ModeloReservasAulas modelo;
        private VistaReservasAulas vista;
                        
	
	
	public ControladorReservasAulas() {
		modelo= new ModeloReservasAulas();
                vista= new VistaReservasAulas();
	}
	
	public List<Aula> getAulas() {
		return modelo.getAulas();
	}
	
	public int getNumAulas() {
		return modelo.getNumAulas();
	}
	
	public List<String> representarAulas() {
		return modelo.representarAulas();
	}
	
	public Aula buscarAula(Aula buscar) {
		return modelo.buscarAula(buscar);
	}
	
	public void insertarAula(Aula insertar) throws OperationNotSupportedException {
		modelo.insertarAula(insertar);
	}
	
	public void borrarAula(Aula borrar) throws OperationNotSupportedException {
		modelo.borrarAula(borrar);
	}
	
	public List<Profesor> getProfesores() {
		return modelo.getProfesores();
	}
	
	public int getNumProfesores() {
		return modelo.getNumProfesores();
	}
	
	public List<String> representarProfesores() {
		return modelo.representarProfesores();
	}
	
	public Profesor buscarProfesor(Profesor buscar) {
		return modelo.buscarProfesor(buscar);
	}
	
	public void insertarProfesor(Profesor insertar) throws OperationNotSupportedException {
		modelo.insertarProfesor(insertar);
	}
	
	public void borrarProfesor(Profesor borrar) throws OperationNotSupportedException {
		modelo.borrarProfesor(borrar);
	}
	
	public List<Reserva> getReservas() {
		return modelo.getReservas();
	}
	
	public int getNumReservas() {
		return modelo.getNumReservas();
	}
	
	public List<String> representarReservas() {
		return modelo.representarReservas();
	}
	
	public Reserva buscarReserva(Reserva buscar) {
		return modelo.buscarReserva(buscar);
	}
	
	public void realizarReserva(Reserva realizar) throws OperationNotSupportedException {
		modelo.realizarReserva(realizar);
	}
	
	public void anularReserva(Reserva anular) throws OperationNotSupportedException {
		modelo.anularReserva(anular);
	}
	
	public List<Reserva> getReservasAula(Aula aula) {
		return modelo.getReservasAula(aula);
	}
	
	public List<Reserva> getReservasProfesor(Profesor profesor) {
		return modelo.getReservasProfesor(profesor);
	}
	
	public List<Reserva> getReservasPermanencia(Permanencia permanencia) {
		return modelo.getReservasPermanencia(permanencia);
	}
	
	public boolean consultarDisponibilidad(Aula aula, Permanencia permanencia) {
		return modelo.consultarDisponibilidad(aula, permanencia);
	}

}


