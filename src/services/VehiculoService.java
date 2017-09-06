package services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Vehiculo;
import dao.VehiculoDAO;
import interfaces.IVehiculoDAO;
import interfaces.IVehiculoService;

public class VehiculoService implements IVehiculoService {
	private IVehiculoDAO vehiculoDAO;

	public VehiculoService() {
		super();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		this.vehiculoDAO = (VehiculoDAO) context.getBean("VehiculoDAO");
	}

	@Override
	public void createVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		vehiculoDAO.add(vehiculo);

	}

	@Override
	public List<Vehiculo> listadoVehiculos() {
		// TODO Auto-generated method stub
		List<Vehiculo> lista=vehiculoDAO.list();
		return lista;
	}

	@Override
	public void update(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		vehiculoDAO.update(vehiculo);

	}

	@Override
	public Vehiculo findById(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Vehiculo aux=vehiculoDAO.findPrimaryId(vehiculo);
		return aux;
	}

	@Override
	public void delete(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		vehiculoDAO.delete(vehiculo);

	}

}
