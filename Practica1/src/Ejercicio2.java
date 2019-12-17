import java.util.Scanner;

/*Ejercicio 2: Realizar un programa que, mediante un menú, nos ofrezca calcular el área de
las siguientes figuras:
1. Área del triángulo: (base*altura)/2
2. Área del cuadrado: (lado*lado)
3. Área del rectángulo: (base * altura)
4. Área del rombo: (diagonal mayor * diagonal menor)/2
5. Área del trapecio: (base mayor + base menor)*altura/2
6. Área del círculo: Pi * radio^2
7. Área de la esfera: 4* Pi * radio^2
.hola
En cada opción del menú nos pedirá los datos necesarios para el cálculo el área y la
mostrará por pantalla.*/
public class Ejercicio2 {

	public static void main(String[] args) {

		double num1=0;
		double num2=0;
		double num3=0;
		int valor=0;
		double res=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" ESCOJA UNA OPCION\n1 triángulo\n2 cuadrado\n3 rectangulo\n4 rombo\n5 trapecio\n6 círculo\n7 esfera");
		valor= sc.nextInt();
		
		switch(valor)
		{
			case 1:
				
				num1=valorEnteroPositivo("Introduce la base");
				num2=valorEnteroPositivo("Introduce la altura");
				
				res=Triangulo(num1,num2);
				System.out.println("El area es "+ res);
				break;
			case 2:
				num1=valorEnteroPositivo("Introduce la base");
				num2=valorEnteroPositivo("Introduce la altura");
			
				res=Cuadrado(num1,num2);
				System.out.println("El area del cuadrado es " +res);
				break;
			case 3:
				num1=valorEnteroPositivo("Introduce la base");
				num2=valorEnteroPositivo("Introduce la altura");
			
				res=Rectangulo(num1,num2);
				System.out.println("El area del rectangulo es " +res);
				break;
			case 4:
				num1=valorEnteroPositivo("Introduce la diagonal mayor");
				num2=valorEnteroPositivo("Introduce la diagonal menor");
				
				res=Rombo(num1,num2);
				System.out.println("El area del rombo es "+res);
				break;
			case 5:
				num1=valorEnteroPositivo("Introduce la base mayor");
				num2=valorEnteroPositivo("Introduce la base menor");
				num3=valorEnteroPositivo("Introduce la altura");
				
				res=Trapecio(num1,num2,num3);
				System.out.println("El area del trapecio es "+res);
				break;
			case 6:
				num1=valorEnteroPositivo("Introduce el radio");
				
				res=Circulo(num1);
				System.out.println("El area de un circulo es "+res);
				break;
			case 7:
				num1=valorEnteroPositivo("Introduce el radio");
				
				res=Esfera(num1);
				System.out.println("El area de la esfera es "+res);
				break;
			default:
				
				System.out.println("No has introducido uno de los valores correctos");
				
				break;
		}//switch
		

	}//main
	
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
	
	private static int valorEnteroPositivo(String mensaje)/*numero positivo*/
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
	}//numero positivo

	private static double Triangulo(double base, double altura)
	{
		double res=0;
		res=(base*altura)/2;
		
		return res;
	}//Triangulo
	private static double Cuadrado(double base,double altura)
	{
		double res=0;
			res=base*altura;
			
		return res;
	}//Cuadrado
	private static double Rectangulo(double base,double altura)
	{
		double res=0;
			res=base*altura;
			
		return res;
	}//Rectangulo
	private static double Rombo(double mayor,double menor)
	{
		double res=0;
			
			res=(mayor*menor)/2;
				
		return res;
	}//Rombo
	private static double Trapecio(double basem,double basen,double altura)
	{
		double res=0;
			res=(basem+basen)*altura/2;
		
		return res;
	}//Trapecio
	private static double Circulo(double radio) 
	{
		double res=0;
		double pi=3.14;
			res=pi*(radio*radio);
		
		return res;
	}//Circulo
	private static double Esfera(double radio)
	{
		double res=0;
		double pi=3.14;
			res=4*pi*(radio*radio);
			
		return res;
	}//Esfera
	
}//class
