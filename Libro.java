package Biblioteca;

/**
 * Clase que encapsula un libro
 */
public class Libro implements Genero
{
	private String isbn;
	private String titulo;
	private Autor autor;
	private String editorial;
	private int anioEdicion;
	
	/**
	 * Contructor que instancia un libro con los siguientes parametros que le entran.
	 * @param isbn - valor del isbn del libro
     * @param titulo - valor del t�tulo del libro
     * @param autor - valor del autor del libro
     * @param edicion - valor de la editorial del libro
     * @param ano - valor del a�o de la edici�n
	 */
	public Libro(String isbn, String titulo, Autor autor, String edicion, int ano)  // he cambiado los nombres de las variables. porfa comprobar que esten igual que en el diagrama
	{
		this.isbn=isbn;
		this.titulo=titulo;
		this.autor=autor;
		this.editorial=edicion;
		this.anioEdicion=ano;
	}
	
	/**
	 * M�todo que devuelve el isbn.
	 * @return isbn - Devuelve el isbn del libro
	 */
	public String getIsbn()
	{
        return isbn;
    }
	
	/**
	 * M�todo que devuelve el t�tulo.
	 * @return titulo - Devuelve el t�tulo del libro
	 */
	public String getTitulo()
	{
        return titulo;        
    }
	
	/**
	 * M�todo que devuelve el autor.
	 * @return autor - Devuelve el autor del libro
	 */
	public Autor getAutor()
	{
        return autor;        
    }
	
	/**
	 * M�todo que devuelve la editorial.
	 * @return editorial - Devuelve la editorial del libro
	 */
	public String getEditorial()
	{
        return editorial;        
    }
	
	/**
	 * M�todo que devuelve el a�o de edici�n del libro.
	 * @return anioEdicion - Devuelve el a�o de edici�n del libro
	 */
	public int getAno()
	{
        return anioEdicion;        
    }
	
	@Override
	/**
	 * M�todo que devuelve un libro.
	 * @return LIBRO - Devuelve el un libro.
	 */
	public String getGenero()
	{
		return LIBRO;
	}

	@Override
	/**
	 * M�todo que devuelve los datos del libro en forma de JSON
	 * @return resul - Devuelve una cadena formateada con los datos del libro
	 */
	public String toString()
	{
		String resul= String.format("{ISBN: \"%s\", T�tulo: \"%s\", autor: %s, Editorial: \"%s\", A�o de Edici�n: %d}",getIsbn(), getTitulo(), getAutor().toString(), getEditorial(), getAno());
		return resul;
	}
	
	@Override
	/**
	 * M�todo que comprueba si un libro es igual a alguno que este introducido.
	 * @return resul - Devuelve true o false
	 */
    public boolean equals(Object o)
	{
    	boolean resul=false;
    	if(o instanceof Libro)
    	{
    		Libro l=(Libro) o;
    		
    		if(this.getIsbn()==l.getIsbn())
    		{
    			resul=true;
    		}
    	}
    	
    	return resul;
    }
}
