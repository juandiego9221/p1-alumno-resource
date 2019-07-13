package pe.com.jdmm21.alumno.service;

import java.util.stream.Stream;

import javax.inject.Inject;

import pe.com.jdmm21.alumno.common.AbstractEntidadDao;
import pe.com.jdmm21.alumno.dao.AlumnoDao;
import pe.com.jdmm21.alumno.model.Alumno;

public class AlumnoServiceImpl extends AlumnoService{
	
	@Inject
	AlumnoDao alumnoDao;
	
	@Override
	public Stream<Alumno> executeQuery(String query) {
		return super.executeQuery(query);
	}

	@Override
	public AbstractEntidadDao<Alumno> getDao() {
		return alumnoDao;
	}

}
