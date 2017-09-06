package services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.User_vehiculos;
import dao.User_vehiculosDAO;
import interfaces.IUser_vehiculoService;
import interfaces.IUser_vehiculosDAO;
import interfaces.IVehiculoDAO;

public class User_vehiculoService implements IUser_vehiculoService {
	private IUser_vehiculosDAO user_vehiculoDAO;

	public User_vehiculoService() {
		super();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		this.user_vehiculoDAO = (User_vehiculosDAO) context.getBean("User_vehiculosDAO");

	}

	@Override
	public void createUser_vehiculo(User_vehiculos user_vehiculo) {
		// TODO Auto-generated method stub
		user_vehiculoDAO.add(user_vehiculo);

	}

	@Override
	public List<User_vehiculos> listadoUser_vehiculos() {
		// TODO Auto-generated method stub
		List<User_vehiculos> lista=user_vehiculoDAO.list();
		return lista;
	}

	@Override
	public void update(User_vehiculos user_vehiculo) {
		// TODO Auto-generated method stub
		user_vehiculoDAO.update(user_vehiculo);

	}

	@Override
	public User_vehiculos findById(User_vehiculos user_vehiculo) {
		// TODO Auto-generated method stub
		User_vehiculos aux=user_vehiculoDAO.findPrimaryId(user_vehiculo);
		return aux;
	}

	@Override
	public void delete(User_vehiculos user_vehiculo) {
		// TODO Auto-generated method stub
		user_vehiculoDAO.delete(user_vehiculo);

	}
}
