package controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.Usuario;
import dao.UsuarioDAO;
import interfaces.IUsuarioService;
import services.UsuarioService;


@Controller

public class RegistroController {
	@ModelAttribute("datosUsuario") 
	public Usuario populateForm(){
		System.out.println("populateForm()");
		return new Usuario();
	}
	
	@RequestMapping(value = "/registro", method = RequestMethod.GET)
	public String verFormularioAltaProductos(){
		System.out.println("ver formulario registro");
		return "registro";
	}
	
	
	@RequestMapping(value = "/registro", method = RequestMethod.POST)
	public ModelAndView registrarProducto(@ModelAttribute("datosUsuario") Usuario u, HttpServletRequest rq){
		System.out.println("model view registro");
		System.out.println("user form " + u.toString());
		
		//UsuarioDAO udao = new UsuarioDAO();
		
		//Usuario user = udao.findPrimaryId(u);
		
		IUsuarioService uservice = new UsuarioService();
		System.out.println("antes find");
		List<Usuario> listausers = uservice.listadoUsuarios();
		// comprobamos que no existe usuario en el listado

		Usuario user = new Usuario();
		user.setDni("dni");
		
		String mensaje="";
		for (Usuario aux : listausers) {
			if (aux.getDni().equals(u.getDni())) {
				user = aux;
			}
		}
		String vista = "";
		System.out.println("despues find");
		
		if(user.getDni().equals("dni")){
			vista = "iniciarSesion";
			uservice.createUsuario(u);
			mensaje="Usuario dado de alta";
		}else{
			System.out.println("Ya existe un usuario con este dni");
			mensaje="Ya existe un usuario con este dni";
			vista = "registrar";
		}

		System.out.println(vista + " vista");
		ModelAndView modelAndView = new ModelAndView(vista);
		modelAndView.addObject("mensaje",mensaje);
		
		return modelAndView;
	}
	
	
}
