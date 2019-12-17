import java.util.Scanner;

/*Ejercicio 3: Realizar un programa que nos de las siguientes opciones:
â—� Pasar de decimal a octal
â—� Pasar de octal a decimal
â—� Pasar de decimal a hexadecimal
â—� pasar de hexadecimal a decimal
â—� pasar de decimal a binario
â—� pasar de binario a decimal
En cada una de las opciones se pedirÃ¡ el valor a convertir (numÃ©rico entero) y se mostrarÃ¡
la soluciÃ³n.
IMPORTANTE: No se pueden utilizar las funciones de conversiÃ³n propias de
java (por ejemplo el parseInt indicando la base). Deben realizarse
manualmente mediante bucles, con divisiones, multiplicaciones y potencias.
Los mÃ©todos que sÃ­ podÃ©is usar son los de String y Math.pow().*/
public class Ejercicio3 {

	public static void main(String[] args) {
		
	int num1=0;
	int valor=0;
	int res=0;
	String octal="";
	String bin="";
	String hexa="";
	int binD=0;
	
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Pulse 1 para pasar de decimal a octal "
			+ "\n Pulse 2 para pasar de octal a decimal "
			+ "\n Pulse 3 para pasar de decimal a hexadecimal "
			+ "\n Pulse 4 para pasar de hexadecimal a decimal "
			+ "\n Pulse 5 para pasar de decimal a binario "
			+ "\n Pulse 6 para pasar de binario a decimal");
	valor = sc.nextInt();
	
	switch(valor) 
	{
		case 1:
			
			num1=valorEnteroPositivo("Introduce un número en decimal");
			octal=decimalOctal(num1);
			System.out.println("El resultado es "+octal);
			break;
		case 2:
			num1=valorEnteroPositivo("Introduce un número en octal");
			res=octalDecimal(num1);
			System.out.println("El resultado es "+res);
			break;
		case 3:
			num1=valorEnteroPositivo("Introduce un número en decimal");
			hexa=decimalHexa(num1);
			System.out.println("El resultado es "+hexa);
			break;
		case 4:
			num1=valorEnteroPositivo("Introduce un número en octal");
			res=hexaDecimal(num1);
			System.out.println("El resultado es "+res);
			break;
		case 5:
			num1=valorEnteroPositivo("Introduce un número en decimal");
			bin=decimalBin(num1);
			System.out.println("El resultado es "+bin);
			break;
		case 6:
			num1=valorEnteroPositivo("Introduce un número en binario");
			binD=binDecimal(num1);
			System.out.println("El resultado es "+binD);
			break;
	}//switch
	

	}//MAIN
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
	private static String decimalOctal(int decimal)
	{
		String Octal ="";
		int dividendo=decimal;
		int divisor=8;
		int resto=0;
		int cociente=decimal;
		while(dividendo>=8)
			{
				cociente=dividendo/divisor;//cociente
				resto=dividendo%divisor;//restos
				Octal=resto+Octal;//pegar restos en el String
				dividendo=cociente;//Cambiar el dividendo por el último cociente 
			}
			Octal=cociente+Octal;
	
		return Octal;
	}//valor decimal a octal	
	private static int octalDecimal(int octal)
	{
		int res=0;
		
		return res;
	}//valor octal a decimal
	private static String decimalHexa(int decimal)
	{
		String hex=("0123456789ABCDEF");
		String hexa="";
		int dividendo=decimal;
		int divisor=16;
		int resto=0;
		int cociente=decimal;
		while(dividendo>0)
			{
				cociente=dividendo/divisor;//cociente
				resto=dividendo%divisor;//restos
				hexa=hex.charAt(resto)+hexa;//pegar restos en el String
				dividendo=cociente;//Cambiar el dividendo por el último cociente 
			}
			hexa=cociente+hexa;
		
		
		return hexa;
	}//valor de decimal a hexa
	private static int hexaDecimal(int hexa)
	{
		int res=0;
		
		return res;
	}//valor hexadecimal a decimal
	private static String decimalBin(int decimal)
	{
		String bin="";
		int dividendo=decimal;
		int divisor=2;
		int resto=0;
		int cociente=decimal;
		while(dividendo>=2)
			{
				cociente=dividendo/divisor;//cociente
				resto=dividendo%divisor;//restos
				bin=resto+bin;//pegar restos en el String
				dividendo=cociente;//Cambiar el dividendo por el último cociente 
			}
			bin=cociente+bin;
		
		return bin;
	}//valor decimal a binario
	private static int binDecimal(int binario)
	{
		String bin="";
		bin=String.valueOf(binario);
		int decimal = 0;
		
		for(int i=0;i<bin.length();i++)
		{
			char caracter= bin.charAt(i);
			String caracterString = String.valueOf(caracter);
			int valorCaracter= Integer.valueOf(caracterString);
			System.out.println(""+valorCaracter);
		}
		
		
		
		
		
		
        return decimal;
	}//valor binario a decimal 
	
	
	
	
	
	
}//CLASS