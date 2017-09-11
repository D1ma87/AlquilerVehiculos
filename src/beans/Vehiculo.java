package beans;

public class Vehiculo {

	public int id_vehiculo;
	public int id_categoria;
	public String marca;
	public String modelo;
	public float precio;
	public int disponibilidad;
	public String fotos;
	public Vehiculo(int id_vehiculo, int id_categoria, String marca, String modelo, float precio,
			int disponibilidad, String fotos) {
		super();
		this.id_vehiculo = id_vehiculo;
		this.id_categoria = id_categoria;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
		this.fotos = fotos;
	}
	public Vehiculo() {
		super();
	}
	public int getId_vehiculo() {
		return id_vehiculo;
	}
	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public String getFotos() {
		return fotos;
	}
	public void setFotos(String fotos) {
		this.fotos = fotos;
	}
	@Override
	public String toString() {
		return "Vehiculo [id_vehiculo=" + id_vehiculo + ", id_categoria=" + id_categoria + ", marca=" + marca
				+ ", modelo=" + modelo + ", precio=" + precio + ", disponibilidad=" + disponibilidad + ", fotos="
				+ fotos + "]";
	}
	
	
	
	
	
	

}
