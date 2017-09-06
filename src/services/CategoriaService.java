package services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Categoria;
import interfaces.ICategoriaDAO;
import interfaces.ICategoriaService;
import dao.CategoriaDAO;

public class CategoriaService implements ICategoriaService {
	private ICategoriaDAO categoriaDAO;

	public CategoriaService() {
		super();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		this.categoriaDAO = (CategoriaDAO) context.getBean("CategoriaDAO");
	}
	

	@Override
	public void createCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriaDAO.add(categoria);

	}

	@Override
	public List<Categoria> listadoCategorias() {
		// TODO Auto-generated method stub
		List<Categoria> cats=categoriaDAO.list();
		return cats;
	}

	@Override
	public void update(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriaDAO.update(categoria);

	}

	@Override
	public Categoria findById(Categoria categoria) {
		// TODO Auto-generated method stub
		Categoria aux=categoriaDAO.findPrimaryId(categoria);
		return aux;
	}

	@Override
	public void delete(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriaDAO.delete(categoria);

	}

}
