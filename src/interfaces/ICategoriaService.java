package interfaces;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import beans.Categoria;

public interface ICategoriaService {
	@Transactional
	public void createCategoria(Categoria categoria);

	public List<Categoria> listadoCategorias();

	public void update(Categoria categoria);

	public Categoria findById(Categoria categoria);

	public void delete(Categoria categoria);
}
