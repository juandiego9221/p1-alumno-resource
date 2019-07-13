package pe.com.jdmm21.alumno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Alumno {

	public static final String FIND_ALL = "SELECT b FROM Alumno b";
	
	@Id
	@Column(name = "idALumno")
	private long id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	
	public Alumno() {
	}

	public Alumno(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
