package controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.User_vehiculos;
import beans.Usuario;
import beans.Vehiculo;
import interfaces.IUser_vehiculoService;
import interfaces.IVehiculoService;
import services.User_vehiculoService;
import services.VehiculoService;

@Controller
public class MisVehiculosController {

	@RequestMapping(value = "/misAlquileres", method = RequestMethod.GET)
	public ModelAndView registrarProducto( HttpServletRequest rq) {
		System.out.println("model view misAlquilere");

		String vista = "misAlquileres";
		Usuario u = (Usuario) rq.getSession().getAttribute("user");
		
		System.out.println("1"+u.toString());
		
		List<User_vehiculos> alquilados;
		
		List<Vehiculo> vehiculos;
		
		IUser_vehiculoService iuserv = new User_vehiculoService();
		
		IVehiculoService ivehiculoservice = new VehiculoService();
				
		alquilados = iuserv.listadoUser_vehiculos();
		vehiculos= ivehiculoservice.listadoVehiculos();
		for(User_vehiculos us:alquilados){
			System.out.println("2"+us.toString());
		}
		Vehiculo v;
		for(User_vehiculos us:alquilados){
			if(!us.getDni().equals(u.getDni())){
				alquilados.remove(us);
				v = new Vehiculo();
				v.setId_vehiculo(us.getId_vehiculo());
				vehiculos.remove(v);
			}
		}

		
		ModelAndView modelAndView = new ModelAndView(vista);
		modelAndView.addObject("vehiculosAlquilados", alquilados);
		modelAndView.addObject("vehiculos", vehiculos);
		
		return modelAndView;
	}

}
