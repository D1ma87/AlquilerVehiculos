package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import beans.Categoria;
import interfaces.ICategoriaDAO;
import utilidades.CategoriasMapper;

public class CategoriaDAO implements ICategoriaDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	

	@Override
	public Categoria findPrimaryId(Categoria categoria) {
		// TODO Auto-generated method stub
				Categoria aux = null;
				try {
					String SQL = "select * from categorias where id_categoria=?";
					aux = jdbcTemplateObject.queryForObject(SQL, new Object[] { categoria.getId_categoria() },
							new CategoriasMapper());
				} catch (Exception e) {
					System.out.println(e);
				}
				return aux;
	}

	@Override
	public void add(Categoria categoria) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String SQL = "insert into categorias (id_categoria, descripcion) values (?,?)";
				try {
					jdbcTemplateObject.update(SQL, categoria.getId_categoria(), categoria.getDescripcion());
					System.out.println("Categoria guardada");
				} catch (Exception e) {
					System.out.println(e);
				}

	}

	@Override
	public void delete(Categoria categoria) {
		// TODO Auto-generated method stub
		String SQL="delete from categorias where id_categoria = ?";
		try{
			jdbcTemplateObject.update(SQL, categoria.getId_categoria());
			System.out.println("borrando categoria"+categoria.getDescripcion());
		}catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void update(Categoria categoria) {
		// TODO Auto-generated method stub
		String SQL="UPDATE categorias SET descripcion=? WHERE id_categoria = ?";
		try{
			jdbcTemplateObject.update(SQL, categoria.getDescripcion(), categoria.getId_categoria());
			System.out.println("actualizado producto"+categoria.getDescripcion());
		}catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public List<Categoria> list() {
		// TODO Auto-generated method stub
		String SQL="select * from categorias";
		List<Categoria> cats=null;
		try{
			cats=jdbcTemplateObject.query(SQL, new CategoriasMapper());
		}catch (Exception e) {
			System.out.println(e);
		}
		return cats;
	}

}
