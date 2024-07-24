package cl.praxis.repositories;

import java.util.List;

import cl.praxis.models.Libro;

public interface LibroRepository {


	  List<Libro> buscarTodos();
	  void insertar(Libro libro);
	  boolean borrar(Libro libro);
	  Libro buscarUno(int nroLibro);
	  
}
