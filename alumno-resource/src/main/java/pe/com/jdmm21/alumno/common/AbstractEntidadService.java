package pe.com.jdmm21.alumno.common;

import java.util.stream.Stream;

import org.slf4j.LoggerFactory;

public abstract class AbstractEntidadService<T> implements IOperation<T> {
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(AbstractEntidadService.class);

	@Override
	public void create(T entity) {
		getDao().create(entity);
	}

	@Override
	public void delete(long id) {
		getDao().delete(id);
	}

	@Override
	public void update(T entity, long id) {
		getDao().update(entity, id);
	}

	@Override
	public Stream<T> executeQuery(String query) {
		logger.info("INICIO - Ejecutando executeQuery service");
		try {
			return getDao().executeQuery(query);
		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
			logger.info("FIN - Ejecutando executeQuery service");
		}
	}

	public abstract AbstractEntidadDao<T> getDao();

}
