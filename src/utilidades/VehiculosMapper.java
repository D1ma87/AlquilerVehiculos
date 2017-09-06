package utilidades;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import beans.Vehiculo;

public class VehiculosMapper implements RowMapper<Vehiculo> {
	public Vehiculo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Vehiculo vehiculo = new Vehiculo(rs.getInt("id_vehiculo"), rs.getInt("id_categoria"), rs.getString("marca"),
				rs.getString("modelo"), rs.getFloat("precio"), rs.getInt("disponibilidad"), rs.getString("fotos"));
		return vehiculo;
	}

}
