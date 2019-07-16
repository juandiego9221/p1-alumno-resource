package pe.com.jdmm21.alumno.resource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.com.jdmm21.alumno.common.IOperationResource;
import pe.com.jdmm21.alumno.model.Alumno;
import pe.com.jdmm21.alumno.service.AlumnoService;

@Path("alumnos")
@RequestScoped
public class AlumnoResource implements IOperationResource<Alumno>{
	
	public static final Logger logger =  LoggerFactory.getLogger(AlumnoResource.class);

	@Inject
	AlumnoService alumnoService;
	
	@Override
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		try {
			logger.info("INICIO - ejecucion de get");
			Stream<Alumno> alumnos = alumnoService.executeQuery(Alumno.FIND_ALL);
			List<Alumno> lista = alumnos.collect(Collectors.toList());
			return Response.ok(lista).build();
		}catch (Exception e) {
			throw new RuntimeException();
		}finally {
			logger.info("FIN - ejecucion de get");
		}
	}

	@Override
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(Alumno entity) {
		logger.info("INICIO - ejecucion de post");
		alumnoService.create(entity);
		logger.info("FIN - ejecucion de post");
		return Response.ok().build();
	}

	@Override
	public Response delete(long id) {
		return null;
	}

	@Override
	public Response update(long id, Alumno entity) {
		return null;
	}

	


}
