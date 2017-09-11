package interfaces;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import beans.Categoria;
import beans.Usuario;
import beans.Vehiculo;

public interface IVehiculoService {

	@Transactional
	public void createVehiculo(Vehiculo vehiculo);

	public List<Vehiculo> listadoVehiculos();

	public List<Vehiculo> listadoVehiculosxCat(int id_categoria);

	public void update(Vehiculo vehiculo);

	public Vehiculo findById(Vehiculo vehiculo);

	public void delete(Vehiculo vehiculo);

}
