package pe.com.jdmm21.alumno.common;

import java.util.stream.Stream;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.slf4j.LoggerFactory;
import pe.com.jdmm21.alumno.dao.AlumnoDaoImpl;
import javax.persistence.EntityManager;

@Transactional
public abstract class AbstractEntidadDao<T> {
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(AlumnoDaoImpl.class);

	@SuppressWarnings("unchecked")
	public Stream<T> executeQuery(String query) {
		logger.info("Ejecutando executeQuery");
		Query resultado = getEM().createQuery(query);

		resultado.getResultStream().forEach(s -> logger.info("Entidad: " + s.toString()));
		return resultado.getResultStream();
	}

	public void create(T entity) {
		logger.info("Ejecutando create");
		getEM().persist(entity);
	}

	public void update(T entity, long id) {
		logger.info("Ejecutando update");
		getEM().merge(entity);
	}

	public abstract void delete(long id);

	public abstract EntityManager getEM();
}
