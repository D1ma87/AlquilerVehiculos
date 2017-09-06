package interfaces;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import beans.User_vehiculos;
import beans.Vehiculo;

public interface IUser_vehiculoService {
	
	@Transactional
	public void createUser_vehiculo(User_vehiculos user_vehiculo);

	public List<User_vehiculos> listadoUser_vehiculos();

	public void update(User_vehiculos user_vehiculo);

	public User_vehiculos findById(User_vehiculos user_vehiculo);

	public void delete(User_vehiculos user_vehiculo);


}
