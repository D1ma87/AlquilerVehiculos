package interfaces;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import beans.Categoria;
import beans.Usuario;

public interface IUsuarioService {
	@Transactional
	public void createUsuario(Usuario usuario);

	public List<Usuario> listadoUsuarios();

	public void update(Usuario usuario);

	public Usuario findById(Usuario usuario);

	public void delete(Usuario usuario);

}
