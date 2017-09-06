package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import beans.Vehiculo;
import interfaces.IVehiculoDAO;

import utilidades.VehiculosMapper;

public class VehiculoDAO implements IVehiculoDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public Vehiculo findPrimaryId(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Vehiculo aux = null;
		try {
			String SQL = "select * from vehiculos where id_vehiculo=?";
			aux = jdbcTemplateObject.queryForObject(SQL, new Object[] { vehiculo.getId_vehiculo() },
					new VehiculosMapper());
		} catch (Exception e) {
			System.out.println(e);
		}
		return aux;
	}

	@Override
	public void add(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String SQL = "insert into vehiculos (id_vehiculo, id_categoria, marca, modelo, precio, disponibilidad) values (?,?,?,?,?,?)";
		try {
			jdbcTemplateObject.update(SQL, vehiculo.getId_vehiculo(), vehiculo.getId_categoria(), vehiculo.getMarca(),
					vehiculo.getModelo(), vehiculo.getPrecio(), vehiculo.getDisponibilidad());
			System.out.println("vehiculo guardado");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void delete(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		String SQL = "delete from vehiculos where id_vehiculo = ?";
		try {
			jdbcTemplateObject.update(SQL, vehiculo.getId_vehiculo());
			System.out.println("borrando vehiculo");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void update(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		String SQL = "UPDATE vehiculos SET id_categoria=?, marca=?, modelo=?, precio=?, disponibilidad=? WHERE id_vehiculo = ?";
		try {
			jdbcTemplateObject.update(SQL, vehiculo.getId_categoria(), vehiculo.getMarca(), vehiculo.getModelo(),
					vehiculo.getPrecio(), vehiculo.getDisponibilidad(), vehiculo.getId_vehiculo());
			System.out.println("actualizado vehiculo");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public List<Vehiculo> list() {
		// TODO Auto-generated method stub
		String SQL = "select * from vehiculos";
		List<Vehiculo> cats = null;
		try {
			cats = jdbcTemplateObject.query(SQL, new VehiculosMapper());
		} catch (Exception e) {
			System.out.println(e);
		}
		return cats;
	}

}
