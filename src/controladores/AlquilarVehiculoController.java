package controladores;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import beans.User_vehiculos;
import beans.Usuario;
import beans.Vehiculo;
import interfaces.IUser_vehiculoService;
import interfaces.IVehiculoService;
import services.User_vehiculoService;
import services.VehiculoService;

@Controller
public class AlquilarVehiculoController {

	@ModelAttribute("datosVehiculo")
	public Vehiculo populateForm() {
		System.out.println("populateForm() alquiler");
		return new Vehiculo();
	}

	@RequestMapping(value = "/alquiler", method = RequestMethod.GET)
	public String verFormularioAltaProductos() {
		System.out.println("ver formulario alquiler");
		return "misAlquileres";
	}

	@RequestMapping(value = "/alquiler", method = RequestMethod.POST)
	public ModelAndView registrarProducto(@RequestParam("dni") String dni, @RequestParam("id_vehiculo") int id,
			@RequestParam("fecha_inicio") String fecha_inicio, @RequestParam("fecha_final") String fecha_final,
			HttpServletRequest rq) {
		System.out.println("model view alquiler");
		System.out.println(fecha_inicio);
		DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		Date fecha_inicio1 = null;
		Date fecha_final1 = null;
		try {
			fecha_inicio1 = formatter.parse(fecha_inicio);
			fecha_final1 = formatter.parse(fecha_final);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String vista = "misAlquileres";
		ModelAndView modelAndView = new ModelAndView(vista);
		User_vehiculos userv = new User_vehiculos(dni, id, fecha_inicio1, fecha_final1);
		IUser_vehiculoService uservice = new User_vehiculoService();
		uservice.createUser_vehiculo(userv);
		// se recoje de la pagina

		IVehiculoService ivehiculo = new VehiculoService();

		Vehiculo v = new Vehiculo();

		v.setId_vehiculo(id);

		v = ivehiculo.findById(v);

		v.setDisponibilidad(0);

		ivehiculo.update(v);

		System.out.println(userv.toString());
		return new ModelAndView();

	}

}
