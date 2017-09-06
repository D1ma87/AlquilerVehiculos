package services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Usuario;
import interfaces.IUsuarioDAO;
import interfaces.IUsuarioService;
import dao.UsuarioDAO;

public class UsuarioService implements IUsuarioService{
	private IUsuarioDAO usuarioDAO;
	
	public UsuarioService() {
		super();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		this.usuarioDAO = (UsuarioDAO) context.getBean("UsuarioDAO");
	}

	@Override
	public void createUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioDAO.add(usuario);
		
	}

	@Override
	public List<Usuario> listadoUsuarios() {
		// TODO Auto-generated method stub
		List<Usuario> lista=usuarioDAO.list();
		
		return lista;
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioDAO.update(usuario);
		
	}

	@Override
	public Usuario findById(Usuario usuario) {
		// TODO Auto-generated method stub
		Usuario aux=usuarioDAO.findPrimaryId(usuario);
		return aux;
	}

	@Override
	public void delete(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioDAO.delete(usuario);
		
	}

	

}
