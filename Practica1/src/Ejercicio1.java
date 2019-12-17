

	
	import java.util.Scanner;

	public class Ejercicio1 {

		public static void main(String[] args) {
			
		int num1=0;
		int num2=0;
		int valor=0;
		int res=0;		
		
		Scanner sc= new Scanner(System.in);
		
		num1=valorPositivo("Introduce un número por teclado");

		num2=valorPositivo("Introduce el segundo número");
		
		
		System.out.print("Pulse 1 para multiplicar \nPulse 2 para dividir \nPulse 3 para calcular resto");
		valor= sc.nextInt();
		
			switch(valor)
			{
				case 1:
					res= Multiplicar(num1,num2);
					System.out.println("la multiplicación es "+res );
					break;
				case 2:
					res= Dividir(num1,num2);
					System.out.println("la división es "+res );
					break;
				default: 
					res= Resto(num1,num2);
					System.out.println("El resto da "+res );
				
			}/*obtencion de datos*/
		
		
		}//main
		private static int Multiplicar (int a, int b)//Obtencion de la multiplicacion
		{
			int res=0;
			while(b>0)
			{
				res= res+a;
				b--;		
			}//while
			
			return res;
		}//Multiplicacion
		private static int Dividir (int a, int b)//obtencion de la division
		{
			int res=0;
			int dividendo=a;
			
			while(dividendo>=b)
			{
				dividendo=dividendo-b;
				res++;
				
				
			}//while
			
			return res;
		}//Division
		private static int Resto (int a, int b)//obtención del resto
		{
			
			
			int res=a;
			while(res>=b)
			{
				res=res-b;
			}//while	
			return res;
		}//resto
		private static int valorPositivo(String mensaje)/*numero positivo*/
		{			
		
			int valor=0;
			boolean valorCorrecto=false;
			
			Scanner sc = new Scanner(System.in);
			while(valorCorrecto==false)
			{
				System.out.println(mensaje);
				if(sc.hasNextInt())
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
		}
		
	}//class


	
	
	
	
	


