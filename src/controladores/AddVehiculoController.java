package controladores;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import beans.Categoria;
import beans.Vehiculo;
import interfaces.ICategoriaService;
import interfaces.IVehiculoService;
import services.CategoriaService;
import services.VehiculoService;

@Controller
public class AddVehiculoController {

	@ModelAttribute("datosVehiculo")
	public Vehiculo populateForm() {
		System.out.println("populateForm()");
		
		return new Vehiculo();
	}
	
	@RequestMapping(value = "/addvehiculo", method = RequestMethod.GET)
	public ModelAndView verFormularioAltaProductos() {
		System.out.println("ver formulario inicio");
	    ModelAndView mav = new ModelAndView("newvehiculo");
        
        Map referenceData = new HashMap();
		
		ICategoriaService cservice=new CategoriaService();
		List<Categoria> miscategorias=cservice.listadoCategorias();
		
		System.out.println("reference data() miscategSize="+miscategorias.size());
		referenceData.put("miscategorias", miscategorias);
        mav.addObject("miscategorias", miscategorias);        
        return mav;
	}

	@RequestMapping(value = "/addvehiculo", method = RequestMethod.POST)
	public ModelAndView registrarProducto(@ModelAttribute("datosVehiculo") Vehiculo v, HttpServletRequest rq) {
		System.out.println("model view altavehiculo");
		IVehiculoService vservice = new VehiculoService();
		ICategoriaService cservice=new CategoriaService();
		String vista = "newvehiculo";
		vservice.createVehiculo(v);
		String mensaje="Vehículo dado de alta!";
		List<Categoria> categorias=cservice.listadoCategorias();
		System.out.println(categorias.size());
		System.out.println(vista + " vista");
		ModelAndView modelAndView = new ModelAndView(vista);
		modelAndView.addObject("mensaje", mensaje);
		modelAndView.addObject("miscategorias", categorias);
		
		return modelAndView;
	}

}
