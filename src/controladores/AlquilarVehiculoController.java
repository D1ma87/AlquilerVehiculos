package controladores;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.User_vehiculos;
import beans.Usuario;
import beans.Vehiculo;
import interfaces.IUser_vehiculoService;
import services.User_vehiculoService;

@Controller
public class AlquilarVehiculoController {

	@ModelAttribute("datosVehiculo") 
	public Vehiculo populateForm(){
		System.out.println("populateForm() alquiler");
		return new Vehiculo();
	}
	
@RequestMapping(value = "/alquiler", method = RequestMethod.GET)
public String verFormularioAltaProductos(){
	System.out.println("ver formulario alquiler");
	return "alquiler";
}

	@RequestMapping(value = "/alquiler", method = RequestMethod.POST)
	public ModelAndView registrarProducto(@ModelAttribute("datosVehiculo") Vehiculo v, HttpServletRequest rq){
		System.out.println("model view alquiler");
		System.out.println("vehiculo alquiler " + v.toString());

		//IVehiculoService ivehiculo = new VehiculoService();

		//Vehiculo vehiculo = ivehiculo.findById(v);

		IUser_vehiculoService iuservehiculo = new User_vehiculoService();

		Usuario u = (Usuario) rq.getSession().getAttribute("user");
		
		int id = (int) rq.getAttribute("");

		User_vehiculos userv = new User_vehiculos(u.getDni(), id, new Date(), new Date());

		iuservehiculo.createUser_vehiculo(userv);

		return new ModelAndView();

	}
	
	
}








