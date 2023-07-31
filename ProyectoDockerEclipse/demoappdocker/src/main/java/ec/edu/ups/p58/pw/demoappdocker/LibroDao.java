package ec.edu.ups.p58.pw.demoappdocker;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class LibroDao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	private EntityManager em; 
	public void insert(Libro p) {
		em.persist(p); //este comando inserta
		
	}
	public Libro read(int codigo) {//leo por mi clave primaria
		Libro p=em.find(Libro.class, codigo); 
		return p;
	
	}
	public void update(Libro p) {
		em.merge(p); //actualizo con merge
	}
	
	public void delete(int codigo) {//borro por mi clave primaria
		Libro p=em.find(Libro.class, codigo); 
		em.remove(p);
	}
	public List<Libro> getList(){
		String jsql="SELECT p FROM Libro p";
		Query query=em.createQuery(jsql, Libro.class);
		List<Libro> lista= query.getResultList();
		return lista;
	}
}
