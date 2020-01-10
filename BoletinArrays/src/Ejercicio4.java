import java.util.Scanner;

/*Ejercicio4:​Realiza un programa que asigne datos numéricos a un array bidimensional y acontinuación escriba las sumas correspondientes a las filas del array 
 * (consideramos que laprimera dimensión del array son las filas).Un ejemplo de ejecución del programa es el siguiente:Número de filas del array: 
 * 2Número de columnas del array: 2Introducir los valores del arraym[0][0] = 5m[0][1] = 6m[1][0] = 4m[1][1] = 2Con estos datos, de entrada, 
 * ha de mostrar en pantalla la siguiente información:Suma de la fila 0: 11Suma de la fila 1: 6
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		int [][]array= crearArray();
		rellenarArray(array);
		calcularElImmprimir(array);

	}//main

	private static int[][] crearArray()
	{
		int filas;
		int columnas;
		System.out.println("Indica el valor de la dimension para las filas");
		filas= obtenerNumeroPositivo("Indica un valor entero y positivo");
		System.out.println("Indica el valor de la dimension para las columnas");
		columnas=obtenerNumeroPositivo("Indica el valor entero positivo");
		
		int[][] array= new int [filas][columnas];
		return array;
	}// Crear array
		private static int[][] rellenarArray(int[][] array) {
			for(int i=0;i<array[i].length;i++)
			{
				for(int j=0;j<array[i].length;j++)
				{
					int valor=obtenerNumeroPositivo(
							String.format("Indica el valor [%d][%d]",i,j));
					array[i][j]=valor;
				}
			}
			return array;
		}
	
	private static  int obtenerNumeroPositivo(String s) {

				int valor=0;
			
			boolean valorCorrecto=false;
			
			Scanner sc = new Scanner(System.in);
			while(valorCorrecto==false)
			{
				System.out.println("Introduce un numero entero");
				if(sc.hasNextInt())
				{
					valor=sc.nextInt();
					valorCorrecto=true;
					
				}
				else
				{
					valorCorrecto=false;
				}
			}//while
			return valor;
	}
	private static void calcularElImprimir(int[][]array)
	{
		int suma;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				
			}
		}
	}
	}
