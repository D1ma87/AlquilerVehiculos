package controladores;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import beans.Categoria;
import beans.Usuario;
import interfaces.ICategoriaService;
import services.CategoriaService;

@Controller
public class AddCategoriaController {

	@ModelAttribute("datosCategoria")
	public Categoria populateForm() {
		System.out.println("populateForm()");
		return new Categoria();
	}

	@RequestMapping(value = "/addcategoria", method = RequestMethod.GET)
	public String verFormularioAltaProductos() {
		System.out.println("ver formulario inicio");
		return "newcategoria";
	}

	@SuppressWarnings({ "null", "unused" })
	@RequestMapping(value = "/addcategoria", method = RequestMethod.POST)
	public String getListReferredPage(@RequestParam String descripcion, Model model) {
		System.out.println("1-entro a la funccion del get");
		System.out.println("2-" + descripcion);
		ICategoriaService catserv = new CategoriaService();
		List<Categoria> miscats = catserv.listadoCategorias();
		System.out.println("3-" + miscats.size());
		Categoria new_cat = new Categoria();
		new_cat.setDescripcion("aux");
		for (Categoria aux : miscats) {
			System.out.println(aux.getDescripcion());
			if (aux.getDescripcion().equals(descripcion)) {
				new_cat = aux;
				System.out.println(aux.getDescripcion() + "=" + descripcion);
			}
		}
		if (new_cat.getDescripcion().equals(descripcion)) {
			model.addAttribute("micategoria", "La categoria existe");
		} else {
			System.out.println("agregando categoria");
			new_cat.setDescripcion(descripcion);
			catserv.createCategoria(new_cat);
			model.addAttribute("micategoria", "Categoría añadida");
		}
		return "newcategoria";
	}

}
