package Biblioteca;

/**
 * Clase que define el g�nero literario Teatro.
 */
public class Teatro extends Libro
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
	public Teatro(String i, String t, Autor a, String e, int anyo)
	{
		super(i, t, a, e, anyo);
	}

	@Override
	/**
	 * M�todo que devuelve el g�nero teatro
	 * @return TEATRO - devuelve el g�nero teatro
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