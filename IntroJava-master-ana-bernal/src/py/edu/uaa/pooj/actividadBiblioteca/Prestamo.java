package py.edu.uaa.pooj.actividadBiblioteca;

import java.util.Date;

public class Prestamo {
	
	private Lector lector;
	private Ejemplar ejemplar;
	private boolean estado;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	public Lector getLector() {
		return lector;
	}
	public void setLector(Lector lector) {
		this.lector = lector;
	}
	public Ejemplar getEjemplar() {
		return ejemplar;
	}
	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	
		
	}
	
	
	//Constructor vacío
	public Prestamo (){
		
	}
	//Metodo que implementa  realizar prestamo
	public void realizarPrestamo(){
		
	}
	
	// Metodo que permite la consulta de estado de prestamo
	public void consultarEstadoDePrestamo(){
		
	}
	//Metodo para verificar libros adeudados
	public void librosAdeudadosLector(){
		
	}

}
