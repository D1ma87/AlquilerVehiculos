package interfaces;

import java.util.List;

import beans.Usuario;


public interface IUsuarioDAO {

	public Usuario findPrimaryId(Usuario usuario);

	public void add(Usuario usuario);

	public void delete(Usuario usuario);

	public void update(Usuario usuario);

	public List<Usuario> list();

}
