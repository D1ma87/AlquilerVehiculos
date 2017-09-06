package interfaces;

import java.util.List;


import beans.User_vehiculos;

public interface IUser_vehiculosDAO {
	
	public User_vehiculos findPrimaryId(User_vehiculos user_vehiculos);

	public void add(User_vehiculos user_vehiculo);

	public void delete(User_vehiculos user_vehiculo);

	public void update(User_vehiculos user_vehiculo);

	public List<User_vehiculos> list();

}
