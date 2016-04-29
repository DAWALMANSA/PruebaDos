package Biblioteca;
/**
 * Clase que define el g�nero literario Ensayo.
 */
public class Ensayo extends Libro
{
	/**
	 * M�todo que introduce los valores del isbn, t�tulo, autor, editorial y a�o de edici�n
	 * y llama al constructor de la super clase.
	 * @param i - valor para el isbn
	 * @param t - valor para el t�tulo
	 * @param a - valor para autor
	 * @param e - valor para la editorial
	 * @param anyo - valor para el a�o de edici�n
	 */
	public Ensayo(String i, String t, Autor a, String e, int anyo)
	{
		super(i, t, a, e, anyo);
	}

	@Override
	/**
	 * M�todo que devuelve el g�nero ensayo
	 * @return ENSAYO - devuelve el g�nero ensayo
	 */
	public String getGenero()
	{
		return "ENSAYO";
	}
}