package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import beans.User_vehiculos;
import beans.Vehiculo;
import utilidades.User_vehiculosMapper;
import utilidades.VehiculosMapper;

public class User_vehiculosDAO implements interfaces.IUser_vehiculosDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void add(User_vehiculos user_vehiculo) {
		// TODO Auto-generated method stub
		String SQL = "insert into user_vehiculos (dni, id_vehiculo, fecha_inicio, fecha_final) values (?,?,?,?)";
		try {
			jdbcTemplateObject.update(SQL, user_vehiculo.getDni(), user_vehiculo.getId_vehiculo(),
					user_vehiculo.getFecha_inicio(), user_vehiculo.getFecha_final());
			System.out.println("vehiculo guardado");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void delete(User_vehiculos user_vehiculo) {
		// TODO Auto-generated method stub
		String SQL = "delete from user_vehiculos where id_vehiculo = ?";
		try {
			jdbcTemplateObject.update(SQL, user_vehiculo.getId_vehiculo());
			System.out.println("borrando user_vehiculo");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void update(User_vehiculos user_vehiculo) {
		// TODO Auto-generated method stub
		String SQL = "UPDATE user_vehiculos SET dni=?, fecha_inicio=?, fecha_final=? WHERE id_vehiculo = ?";
		try {
			jdbcTemplateObject.update(SQL, user_vehiculo.getDni(), user_vehiculo.getFecha_inicio(),
					user_vehiculo.getFecha_final(), user_vehiculo.getId_vehiculo());
			System.out.println("actualizado user_vehiculo");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public List<User_vehiculos> list() {
		// TODO Auto-generated method stub
		String SQL = "select * from user_vehiculos";
		List<User_vehiculos> cats = null;
		try {
			cats = jdbcTemplateObject.query(SQL, new User_vehiculosMapper());
		} catch (Exception e) {
			System.out.println(e);
		}
		return cats;
	}

	@Override
	public User_vehiculos findPrimaryId(User_vehiculos user_vehiculos) {
		// TODO Auto-generated method stub
		User_vehiculos aux = null;
		try {
			String SQL = "select * from user_vehiculos where id_vehiculo=?";
			aux = jdbcTemplateObject.queryForObject(SQL, new Object[] { user_vehiculos.getId_vehiculo() },
					new User_vehiculosMapper());
		} catch (Exception e) {
			System.out.println(e);
		}
		return aux;
	}

}
