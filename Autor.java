package Biblioteca;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Autor
{
	private String nombre;
	private Calendar fechaNacimiento;
	
	public Autor(String n, int anyo, int m, int d)
	{
		nombre=n;
		fechaNacimiento=new GregorianCalendar(anyo, m-1, d);
	}

	public String getNombre()
	{
		return nombre;
	}
	
	public Calendar getFechaNacimiento()
	{
		return fechaNacimiento;
	}
	
	@Override
	public String toString()
	{
		String resul= String.format("{\"%s\", Fecha De Nacimiento: %td de %tB de %tY}",getNombre(), getFechaNacimiento(), getFechaNacimiento(), getFechaNacimiento());
		return resul;
	}
	
}
