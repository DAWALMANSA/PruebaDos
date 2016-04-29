package Biblioteca;

/**
 * Clase que define el género literario Novela.
 */
public class Novela extends Libro
{
	/**
	 * Método que introduce los valores del isbn, título, autor, editorial y año de edición
	 * y llama al constructor de la super clase.
	 * @param i - valor para el isbn
	 * @param t - valor para el título
	 * @param a - valor para autor
	 * @param e - valor para la editorial
	 * @param anyo - valor para el año de edición
	 */
	public Novela(String i, String t, Autor a, String e, int anyo)
	{
		super(i, t, a, e, anyo);
	}

	@Override
	/**
	 * Método que devuelve el género novela
	 * @return NOVELA - devuelve el género novela
	 */
	public String getGenero()
	{
		return NOVELA; 
	}
}