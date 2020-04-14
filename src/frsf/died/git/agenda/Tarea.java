package frsf.died.git.agenda;

import java.time.LocalDate;

public class Tarea {

	private String descripcion;
	private LocalDate fecha;

	

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Tarea [descripcion=" + descripcion + ", fecha=" + fecha + "]";
	}

	public Tarea(String descripcion, LocalDate fecha) {
		this.descripcion = descripcion;
		this.fecha = fecha;
	}
	
	
	public Tarea() {
	}
	
}
