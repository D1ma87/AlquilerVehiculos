package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import beans.Usuario;
import interfaces.IUsuarioDAO;
import utilidades.UsuarioMapper;

public class UsuarioDAO implements IUsuarioDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public Usuario findPrimaryId(Usuario usuario) {
		// TODO Auto-generated method stub
		Usuario aux = null;
		try {
			String SQL = "select * from usuarios where dni=?";
			aux = jdbcTemplateObject.queryForObject(SQL, new Object[] { usuario.getDni() },
					new UsuarioMapper());
		} catch (Exception e) {
			System.out.println(e);
		}
		return aux;

	}

	@Override
	public void delete(Usuario usuario) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String SQL="delete from usuarios where dni = ?";
				try{
					jdbcTemplateObject.update(SQL, usuario.getDni());
					System.out.println("borrando categoria");
				}catch (Exception e) {
					System.out.println(e);
				}

	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String SQL="UPDATE usuarios SET nombre=?, apellido=?, email=?, password=? WHERE dni = ?";
				try{
					jdbcTemplateObject.update(SQL, usuario.getNombre(), usuario.getApellido(), usuario.getEmail(), usuario.getDni());
					System.out.println("actualizado user");
				}catch (Exception e) {
					System.out.println(e);
				}

	}

	@Override
	public List<Usuario> list() {
		// TODO Auto-generated method stub
		String SQL="select * from usuarios";
		List<Usuario> users=null;
		try{
			users=jdbcTemplateObject.query(SQL, new UsuarioMapper());
		}catch (Exception e) {
			System.out.println(e);
		}
		return users;
	}

	@Override
	public void add(Usuario usuario) {
		// TODO Auto-generated method stub
		String SQL = "insert into usuarios (dni, nombre, apellido, email, password, administrador) values (?,?,?,?,?,?)";
		try {
			jdbcTemplateObject.update(SQL, usuario.getDni(), usuario.getNombre(), usuario.getApellido(), usuario.getPassword(), usuario.getAdministrador());
			System.out.println("Categoria guardada");
		} catch (Exception e) {
			System.out.println(e);
		}

		
	}

}
