package controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
public class VehiculosporCategoriaController {

	@ModelAttribute("datosUsuario")
	public Usuario populateForm() {
		System.out.println("populateForm()");
		return new Usuario();
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/vehiculosCategoria", method = RequestMethod.GET)
	public String getListReferredPage(@RequestParam("idcat") int idcat, Model model) {

		System.out.println("1-entro a la funccion del get");
		System.out.println("2-" + idcat);
		List<Vehiculo> vehiculos = null;

		IVehiculoService vservice = new VehiculoService();
		if (idcat == 0) {
			vehiculos = vservice.listadoVehiculos();
		} else {
			vehiculos = vservice.listadoVehiculosxCat(idcat);
		}
		ICategoriaService cservice = new CategoriaService();
		List<Categoria> categorias = cservice.listadoCategorias();
		System.out.println("3-lista cargada " + vehiculos.size() + "-vehiculos");
		model.addAttribute("misVehiculos", vehiculos);
		model.addAttribute("misCategorias", categorias);

		return "vistaUsuario";
	}
}
