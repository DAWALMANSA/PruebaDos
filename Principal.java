package Biblioteca;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Programa de pruebas principal con el que podemos probar el programa
 * gracias a un menu de opciones.
 * 
 * @author (1º DAW) 
 * @version (1.0)
 */
public class Principal
{
	
	/**
	 * Clase principal que contiene un menu de opciones donde podemos añadir un libro,
	 * consultar un libro, consultar el listado de libros de un género,
	 * consultar el listado de libros de autores de un determinado siglo y salir del programa.
	 */
	public static void main(String[] args)
	{
		boolean aux=false;
		ArrayList<Libro> auxArray=new ArrayList<Libro>();
		Scanner entrada=new Scanner(System.in);
		Biblioteca biblio=new Biblioteca();
		int opcion=5;
		Autor a=new Autor("nombre", 1989, 10, 1);
		Libro l=new Libro("ISBN", "Titulo", a, "Santillana", 1902);
		Libro l2=new Libro("ISBN2", "Titulo2", a, "Anaya", 2016);
		
		biblio.anadirLibro(l2);
		
		do
		{
			System.out.printf("Elija una opción\n");
			System.out.printf("1 - Añadir un libro\n");
			System.out.printf("2 - Consultar un libro\n");
			System.out.printf("3 - Consultar el listado de libros de un género\n");
			System.out.printf("4 - Consultar el listado de libros (título) de autores de un determinado siglo\n");
			System.out.printf("0 - Salir del programa\n");
			System.out.printf("-----------------------------------------\n");
			System.out.printf("Introduce una opción: ");
			opcion=entrada.nextInt();
			entrada.nextLine();
			
			switch(opcion)
			{
				case 1: System.out.printf("De que género es el libro: ");
						String genero=entrada.nextLine();	
						
						genero=genero.toUpperCase();
						
						if(genero.equals(Genero.TEATRO))
						{ 
							Teatro lib1=new Teatro(l.getIsbn(), l.getTitulo(), l.getAutor(), l.getEditorial(), l.getAno());
							aux=biblio.anadirLibro(lib1);
						}
						else if(genero.equals(Genero.ENSAYO))
						{
							Ensayo lib1=new Ensayo(l.getIsbn(), l.getTitulo(), l.getAutor(), l.getEditorial(), l.getAno());
							aux=biblio.anadirLibro(lib1);
						}
						else if(genero.equals(Genero.NOVELA))
						{
							Novela lib1=new Novela(l.getIsbn(), l.getTitulo(), l.getAutor(), l.getEditorial(), l.getAno());
							aux=biblio.anadirLibro(lib1);
						}
						else if(genero.equals(Genero.POESIA))
						{
							Novela lib1=new Novela(l.getIsbn(), l.getTitulo(), l.getAutor(), l.getEditorial(), l.getAno());
							aux=biblio.anadirLibro(lib1);
						}
						else
						{
							aux=biblio.anadirLibro(l);
						}
					    
						if(aux)
						{
							System.out.printf("\nLIBRO AÑADIDO CORRECTAMENTE\n");
						}
						else
						{
							System.out.printf("\nEL LIBRO YA EXISTE !!!\n");
						}  
						
						break;
											
				case 2: System.out.printf("Introduzca el ISBN: ");
						String isbn;
						isbn=entrada.nextLine();
						System.out.println(biblio.consultarLibro(isbn));
						break;
						
				case 3: System.out.printf("Introduzca el género a consultar: ");
						String g;
						g=entrada.nextLine();
						auxArray=biblio.consultarGenero(g);
						
						for(int i=0; i<auxArray.size(); i++)
						{
							System.out.printf("\n%s\n", auxArray.get(i).getTitulo());
						}
						break;
						
				case 4: System.out.printf("Introduzca el siglo a consultar: ");
						int s;
						s=entrada.nextInt();
						entrada.nextLine();
						System.out.println(biblio.listarLibroAutor(s));
						break;
						
				case 0: System.out.printf("Fin del programa");
						break;
						
				
				default: System.out.println("Opción incorrecta"); break;
			}
		}while(opcion!=0);
		
		entrada.close();
	}
}
		
		
		

