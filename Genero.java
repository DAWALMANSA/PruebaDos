package Biblioteca;

/**
 * Interfaz que contiene los géneros de los libros.
 */
public interface Genero
{
	String POESIA= "POESIA";
	String NOVELA= "NOVELA";
	String ENSAYO= "ENSAYO";
	String TEATRO= "TEATRO";
	String LIBRO= "LIBRO";
	
	/**
	 * Método que obliga a las calses a implementar la interfaz
	 */
	public String getGenero();
}
