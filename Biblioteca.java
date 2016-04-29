package Biblioteca;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Clase que forma una biblioteca.
 */
public class Biblioteca
{
	private ArrayList<Libro> coleccion;
	
	/**
	 * Constructor que crea una lista de libros.
	 */
	public Biblioteca()
	{
		this.coleccion=new ArrayList<Libro>();
	}
	
	/**
	 * Método que añade un libro a la biblioteca.
	 * @param libro - 
     * 
	 */
	public boolean anadirLibro(Libro libro)
	{
		boolean swt=false;
		
		if(coleccion.size()==0)
		{
			coleccion.add(libro);
			swt=true;
		}
		else
		{
			if(!coleccion.contains(libro)) 
			{
				 coleccion.add(libro);
				 swt=true;
			}
		}
	
		return swt;
	}
	
	/**
	 * 
	 */
	public boolean anadirLibro(String isbn, String titulo, Autor autor, String editorial, int ano ) 
	{                              																				
		Libro libro=new Libro(isbn, titulo, autor, editorial, ano);
		boolean swt=false;
						
		if(coleccion.size()==0)  
		{
			coleccion.add(libro);
			swt=true;
		}
		else
		{
			if(!coleccion.contains(libro))
			{
				coleccion.add(libro);
				swt=true;
			}
		}

		return swt;
	}
	
	/**
	 * 
	 */
	public ArrayList<Autor> listarLibroAutor(int siglo)
	{
		ArrayList<Autor> mismosiglo=new ArrayList<Autor>();
		
		for(int i=0; i<coleccion.size();i++)
		{
			if(calcularSiglo(coleccion.get(i).getAutor().getFechaNacimiento().get(Calendar.YEAR))==siglo) //arreglado
			{
				mismosiglo.add(coleccion.get(i).getAutor());
			}
		}
		
		return mismosiglo;
	}
	
	/**
	 * 
	 */
	public ArrayList<Libro > listarLibroGenero(String genero)
	{
		ArrayList<Libro> autor=new ArrayList<Libro>();
		
		for(int i=0; i<coleccion.size();i++)
		{
			if(coleccion.get(i).getGenero()==genero)
			{
				autor.add(coleccion.get(i));
			}
		}
		
		return autor;
	}
	
	/**
	 * Método que devuelve los datos de un libro cuyo ISBN exista
	 * 
	 */
	public String consultarLibro(String isbn)
	{
		boolean existe=false;
		String s=null;
		
		for(int i=0; i<coleccion.size() && !existe; i++)
		{  
			if((coleccion.get(i).getIsbn().equals(isbn)))
			{
				s=String.format(coleccion.get(i).toString());
				existe=true;
			}
		}
		
		return s;
	}
	
	/**
	 * .
	 */
	public ArrayList<Libro> consultarGenero(String gen)
	{
		ArrayList<Libro> consulta=new ArrayList<Libro>();
		gen=gen.toUpperCase();
		
		for(int i=0; i<this.coleccion.size(); i++)
		{
			if(this.coleccion.get(i).getGenero().equals(gen))
			{
				consulta.add(this.coleccion.get(i));
			}
		}
		
		consulta=ordenaConsulta(consulta);
		
		return consulta;	
	}

	private ArrayList<Libro> ordenaConsulta(ArrayList<Libro> array)
    {
        Libro aux;
        boolean desordenado=true;
        
        for(int i=1; i<array.size() && desordenado; i++)
        {
            for(int j=0; j<array.size()-i; j++)
            {
                desordenado=false;
                
                if(array.get(j).getAno()>array.get(j+1).getAno())
                {
                    aux=array.get(j);
                    array.add(j, array.get(j+1));
                    array.add(j+1, aux);;
                    desordenado=true;
                }
            }
        }
        
        return array;
    }
		
	private int calcularSiglo(int anyo)
	{
		return (anyo/100)+1;
	}
	
	/**
	 * Metodo que devuelve un libro
	 * @return coleccion.get(i) - Devuelve un libro
	 */
	public Libro getLibro(int i)
	{
		return this.coleccion.get(i);
	}
	
	/**
	 * Metodo que devuelve el tamaño de la colección
	 * @return editorial - Devuelve el tamaño de la colección
	 */
	public int getSize()
	{
		return this.coleccion.size();
	}
}