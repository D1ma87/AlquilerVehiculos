package beans;

import java.util.Date;

public class User_vehiculos {
	
	public String dni;
	public int id_vehiculo;
	public Date fecha_inicio;
	public Date fecha_final;
	public User_vehiculos(String dni, int id_vehiculo, Date fecha_inicio, Date fecha_final) {
		super();
		this.dni = dni;
		this.id_vehiculo = id_vehiculo;
		this.fecha_inicio = fecha_inicio;
		this.fecha_final = fecha_final;
	}
	public User_vehiculos() {
		super();
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getId_vehiculo() {
		return id_vehiculo;
	}
	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_final() {
		return fecha_final;
	}
	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
	}
	

}
