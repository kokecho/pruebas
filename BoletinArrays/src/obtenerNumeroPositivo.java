

import java.util.Scanner;

public class obtenerNumeroPositivo {

	public static int main(String[] args) {
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

	}//Entero Positivo
	private static int valorDoublePositivo(String mensaje)/*numero positivo*/
	{			
	
		int valor=0;
		boolean valorCorrecto=false;
		
		Scanner sc = new Scanner(System.in);
		while(valorCorrecto==false)
		{
			System.out.println(mensaje);
			if(sc.hasNextDouble())
			{
				valor=sc.nextInt();
				valorCorrecto=true;
				
			}
			else
			{
				sc.next();
				valorCorrecto=false;
			}
		}//while
		return valor;
	}//numero Double positivo

}//main
