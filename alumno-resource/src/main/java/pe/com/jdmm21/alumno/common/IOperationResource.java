package pe.com.jdmm21.alumno.common;

import javax.ws.rs.core.Response;

public interface IOperationResource<T> {

	public Response findAll();

	public Response create(T entity);

	public Response delete(long id);

	public Response update(long id, T entity);

}
