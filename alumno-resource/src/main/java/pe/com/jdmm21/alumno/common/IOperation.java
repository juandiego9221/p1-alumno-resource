package pe.com.jdmm21.alumno.common;

import java.util.stream.Stream;

public interface IOperation<T> {
	
	public Stream<T> executeQuery(String query);

	public void update(T entity, long id);

	public void delete(long id);

	public void create(T entity);

}
