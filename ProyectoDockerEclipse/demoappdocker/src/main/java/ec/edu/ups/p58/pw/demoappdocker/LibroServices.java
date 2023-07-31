package ec.edu.ups.p58.pw.demoappdocker;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("libro")
public class LibroServices {
	@Inject
	LibroDao daoLibro;
	
	@POST
	@Path("crear")
	@Produces("application/json") //lo mismo que poner app/json
	@Consumes("application/json")
	public String guardarProductoDAO(Libro p) {
		try {
			daoLibro.insert(p);
		} catch (Exception e) {
			return "{\"resultado\": \"ERROR\"}";
			
		}
		return "{\"resultado\": \"OK\"}";
	}
	public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        // Agregar la clase CORS.java para desactivar el CORS
        classes.add(CORS.class);
        return classes;
    }
	
	@GET
	@Path("listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Libro> getlistadoProductos(){
		return daoLibro.getList();
	}

	
	

}
