package utilidades;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import beans.Usuario;

public class UsuarioMapper implements RowMapper<Usuario> {
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario usuario = new Usuario();
		usuario = new Usuario(rs.getString("dni"), rs.getString("password"), rs.getString("email"),
				rs.getString("nombre"), rs.getString("apellido"), rs.getInt("administrador"));
		return usuario;
	}

}
