package Biblioteca;

/**
 * Interfaz que contiene los g�neros de los libros.
 */
public interface Genero
{
	String POESIA= "POESIA";
	String NOVELA= "NOVELA";
	String ENSAYO= "ENSAYO";
	String TEATRO= "TEATRO";
	String LIBRO= "LIBRO";
	
	/**
	 * M�todo que obliga a las calses a implementar la interfaz
	 */
	public String getGenero();
}
