package controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.User_vehiculos;
import beans.Usuario;
import interfaces.IUser_vehiculoService;
import services.User_vehiculoService;

@Controller
public class MisVehiculosController {

	@RequestMapping(value = "/misAlquileres", method = RequestMethod.GET)
	public ModelAndView registrarProducto( HttpServletRequest rq) {
		System.out.println("model view misAlquilere");

		String vista = "misAlquileres";
		Usuario u = (Usuario) rq.getSession().getAttribute("user");
		
		System.out.println(u.toString());
		
		List<User_vehiculos> alquilados;
		
		IUser_vehiculoService iuserv = new User_vehiculoService();
				
		alquilados = iuserv.listadoUser_vehiculos();
		for(User_vehiculos us:alquilados){
			System.out.println(us.toString());
		}
		for(User_vehiculos us:alquilados){
			if(!us.getDni().equals(u.getDni())){
				alquilados.remove(us);
			}
		}
		
		
		
		ModelAndView modelAndView = new ModelAndView(vista);
		modelAndView.addObject("vehiculosAlquilados", alquilados);
		
		return modelAndView;
	}

}
