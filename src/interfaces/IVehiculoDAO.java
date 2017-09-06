package interfaces;

import java.util.List;

import beans.Vehiculo;

public interface IVehiculoDAO {
	
public Vehiculo findPrimaryId(Vehiculo vehiculo);
	
	public void add(Vehiculo vehiculo);
	
	public void delete(Vehiculo vehiculo);
	
	public void update(Vehiculo vehiculo);
	
	public List<Vehiculo> list();

}
