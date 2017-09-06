package utilidades;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import beans.User_vehiculos;

public class User_vehiculosMapper implements RowMapper<User_vehiculos> {
	public User_vehiculos mapRow(ResultSet rs, int rowNum) throws SQLException {
		User_vehiculos user_vehiculos = new User_vehiculos(rs.getString("dni"), rs.getInt("id_vehiculo"),
				rs.getDate("fecha_inicio"), rs.getDate("fecha_final"));
		return user_vehiculos;
	}

}
