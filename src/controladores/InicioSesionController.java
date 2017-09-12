package controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.Categoria;
import beans.Usuario;
import beans.Vehiculo;
import interfaces.ICategoriaService;
import interfaces.IUsuarioService;
import interfaces.IVehiculoService;
import services.CategoriaService;
import services.UsuarioService;
import services.VehiculoService;

@Controller
public class InicioSesionController {

	@ModelAttribute("datosUsuario")
	public Usuario populateForm() {
		System.out.println("populateForm()");
		
		return new Usuario();
	}

	@RequestMapping(value = "/iniciarSesion", method = RequestMethod.GET)
	public String verFormularioAltaProductos(HttpServletRequest request) {
	
		System.out.println("ver formulario inicio");
		HttpSession session= request.getSession(false);
		session.invalidate();
		return "iniciarSesion";
	}

	@RequestMapping(value = "/iniciarSesion", method = RequestMethod.POST)
	public ModelAndView registrarProducto(@ModelAttribute("datosUsuario") Usuario u, HttpServletRequest rq) {
		System.out.println("model view inicio sesion");
		System.out.println("user form " + u.toString());

		IUsuarioService uservice = new UsuarioService();
		List<Usuario> listausers = uservice.listadoUsuarios();
		// comprobamos que no existe usuario en el listado

		Usuario user = new Usuario();
		user.setDni("dni");
		for (Usuario aux : listausers) {
			if (aux.getDni().equals(u.getDni())) {
				user = aux;
			}
		}
		String vista = "";
		String mensaje="";
		System.out.println("user bbdd " + user.toString());

		IVehiculoService vservice = new VehiculoService();
		List<Vehiculo> vehiculos = vservice.listadoVehiculos();

		ICategoriaService cservice = new CategoriaService();
		List<Categoria> categorias = cservice.listadoCategorias();

		// comprobar que tipo de usuario es para enviarle al backend o frontend
		if (user.getDni().equals(u.getDni()) && user.getPassword().equals(u.getPassword())) {
			System.out.println("existe");
			rq.getSession().setAttribute("user", user);
			vista = "vistaUsuario";
			System.out.println("zona user");

		} else {
			System.out.println("no existe");
			vista = "iniciarSesion";
			mensaje="Error al iniciar sesión";

		}

		System.out.println(vista);
		ModelAndView modelAndView = new ModelAndView(vista);

		modelAndView.addObject("misVehiculos", vehiculos);
		modelAndView.addObject("mensaje", mensaje);
		modelAndView.addObject("misCategorias", categorias);
		return modelAndView;
	}

}
