import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String text;
		char[] array;
		
		text=obtenerTexto();
		array= obtenerArrayCaracteres(text);
		imprimirArray(array);

	}
	private static String obtenerTexto()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduzca un texto:");
		return sc.nextLine();
	}//ontener texto

	private static char[] obtenerArrayCaracteres(String texto)
	{
		char[] array=new char[texto.length()];
		
		for(int i=0;i<texto.length();i++)
		{
			array[i]=texto.charAt(i);
		}
		//array caracteres
		return array;
	}//obtener caracteres de un array
	private static void imprimirArray(char[] array)
	{
		//System.out.println(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(""+ array[i]);
		}
		
		for(char c:array)
		{
			System.out.println(""+ c);
		}
	}//Imprimir array
}
