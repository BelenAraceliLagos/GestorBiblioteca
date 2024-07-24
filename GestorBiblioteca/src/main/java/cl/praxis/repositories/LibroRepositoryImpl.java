package cl.praxis.repositories;

import java.util.Collection;
import java.util.List;

import cl.praxis.models.Libro;

public class LibroRepositoryImpl implements LibroRepository{

	Collection<Libro> bookList = null; 
	
	@Override
	public List<Libro> buscarTodos() {
		return null;
	}

	@Override
	public void insertar(Libro libro) {
	   Libro libro1 = new Libro();
	   bookList.add(libro1);
	}

	@Override
	public boolean borrar(Libro libro) {
		return false;
	}

	@Override
	public Libro buscarUno(int nroLibro) {
		
		return bookList.stream()
	            .filter(book -> book.getNro_libro() == nroLibro)
	            .findFirst()
	            .orElse(null);
	}

}
