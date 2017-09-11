package controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import beans.Usuario;

@Controller
public class RedireccionarController {

	
	@ModelAttribute("datosUsuario") //creo que no hace falta solo con el ModelAndView ultimo deberia ser suficiente
	public Usuario populateForm(){
		System.out.println("populateForm()");
		return new Usuario();
	}
	
	@RequestMapping(value = "/registrar", method = RequestMethod.GET)
	public String verFormularioAltaProductos(){
		System.out.println("ver formulario inicio");
		return "registrar";
	}
}
