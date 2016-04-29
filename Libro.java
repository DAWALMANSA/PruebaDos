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
     * @param titulo - valor del título del libro
     * @param autor - valor del autor del libro
     * @param edicion - valor de la editorial del libro
     * @param ano - valor del año de la edición
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
	 * Método que devuelve el isbn.
	 * @return isbn - Devuelve el isbn del libro
	 */
	public String getIsbn()
	{
        return isbn;
    }
	
	/**
	 * Método que devuelve el título.
	 * @return titulo - Devuelve el título del libro
	 */
	public String getTitulo()
	{
        return titulo;        
    }
	
	/**
	 * Método que devuelve el autor.
	 * @return autor - Devuelve el autor del libro
	 */
	public Autor getAutor()
	{
        return autor;        
    }
	
	/**
	 * Método que devuelve la editorial.
	 * @return editorial - Devuelve la editorial del libro
	 */
	public String getEditorial()
	{
        return editorial;        
    }
	
	/**
	 * Método que devuelve el año de edición del libro.
	 * @return anioEdicion - Devuelve el año de edición del libro
	 */
	public int getAno()
	{
        return anioEdicion;        
    }
	
	@Override
	/**
	 * Método que devuelve un libro.
	 * @return LIBRO - Devuelve el un libro.
	 */
	public String getGenero()
	{
		return LIBRO;
	}

	@Override
	/**
	 * Método que devuelve los datos del libro en forma de JSON
	 * @return resul - Devuelve una cadena formateada con los datos del libro
	 */
	public String toString()
	{
		String resul= String.format("{ISBN: \"%s\", Título: \"%s\", autor: %s, Editorial: \"%s\", Año de Edición: %d}",getIsbn(), getTitulo(), getAutor().toString(), getEditorial(), getAno());
		return resul;
	}
	
	@Override
	/**
	 * Método que comprueba si un libro es igual a alguno que este introducido.
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
