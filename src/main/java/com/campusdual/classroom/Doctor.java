package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	public void getDetails(){
		System.out.println( "El nombre de la persona es: "+this.name+ " .Y su apellido es: "+this.surname + " . Y su especializacion: "+this.specialization);
	}


}
