package beans;

public class Categoria {

	public int id_categoria;
	public String descripcion;

	public Categoria(int id_categoria, String descripcion) {
		super();
		this.id_categoria = id_categoria;
		this.descripcion = descripcion;
	}

	public Categoria() {
		super();
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
