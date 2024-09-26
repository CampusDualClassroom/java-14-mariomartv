package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	public void getDetails(){
		System.out.println( "El nombre de la persona es: "+this.name+ " .Y su apellido es: "+this.surname+" .Y su area es: "+this.area);
	}
}
