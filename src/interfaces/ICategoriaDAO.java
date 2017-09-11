package interfaces;

import java.util.List;

import beans.*;

public interface ICategoriaDAO {

	public Categoria findPrimaryId(Categoria categoria);

	public Categoria findbyDescripcion(String descripcion);

	public void add(Categoria categoria);

	public void delete(Categoria categoria);

	public void update(Categoria categoria);

	public List<Categoria> list();
}
