package pe.com.jdmm21.alumno.dao;

import java.util.stream.Stream;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.LoggerFactory;

import pe.com.jdmm21.alumno.model.Alumno;

@ApplicationScoped
public class AlumnoDaoImpl extends AlumnoDao {
	@PersistenceContext(unitName = "alumnos")
	private EntityManager entityManager;

	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(AlumnoDaoImpl.class);

	@Override
	public Stream<Alumno> executeQuery(String query) {
		return super.executeQuery(query);
	}

	@Override
	public void create(Alumno entity) {
		logger.info("Ejecutando createx");
		super.create(entity);
	}

	@Override
	public void update(Alumno entity, long id) {
		super.update(entity, id);
	}

	@Override
	public void delete(long id) {
		logger.info("Ejecutando delete");
		Alumno alumno = entityManager.getReference(Alumno.class, id);
		entityManager.remove(alumno);
	}

	@Override
	public EntityManager getEM() {
		return entityManager;
	}
}
