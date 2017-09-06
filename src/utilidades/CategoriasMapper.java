package utilidades;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import beans.Categoria;

public class CategoriasMapper implements RowMapper<Categoria> {

	public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categoria categoria = new Categoria(rs.getInt("Id_categoria"), rs.getString("Descripcion"));
		return categoria;
	}

}
