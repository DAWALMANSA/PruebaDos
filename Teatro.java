package Biblioteca;

/**
 * Clase que define el género literario Teatro.
 */
public class Teatro extends Libro
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
	public Teatro(String i, String t, Autor a, String e, int anyo)
	{
		super(i, t, a, e, anyo);
	}

	@Override
	/**
	 * Método que devuelve el género teatro
	 * @return TEATRO - devuelve el género teatro
	 */
	public String getGenero()
	{
		return TEATRO; 
	}
	 public boolean equals(Object o)
		{
	    	boolean resul=false;
	    	if(o instanceof Teatro)
	    	{
	    		Teatro l=(Teatro) o;
	    		
	    		if(this.getIsbn()==l.getIsbn())
	    		{
	    			resul=true;
	    		}
	    	}
	    	
	    	return resul;
	    }
}