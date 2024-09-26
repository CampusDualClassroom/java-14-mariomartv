package com.campusdual.classroom;

public class Person {
	public String name;
	public String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void getDetails(){
		System.out.println( "El nombre de la persona es: "+this.name+ " .Y su apellido es: "+this.surname);
	}
}
