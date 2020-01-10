import java.util.Arrays;

public class ejercicio5 {

	public static void main(String[] args) {
		
		char[] array="Hola que tal".toCharArray();
		invertirArray(array);
		imprimir(array);
	}//main
	

	private static char[] invertirArray(char[] array)
	{
		int mitad=array.length/2;
		int ultimaPos=array.length-1;
		for(int i=0;i<mitad;i++)
		{
			char vAux=array[ultimaPos-i];
			array[ultimaPos-i]=array[i];
			array[i]= vAux;
		}
		return array;
	}
	private static void imprimir(char[]array)
	{
		System.out.println(Arrays.toString(array));
	}
}
