//Array desordenado
public class Ejercico2 {

	public static void main(String[] args) {
		int[] arrayDesordenado= {121,24,1,258,0,-3,8};
		int[] array=obtenerArrayOrdenado(arrayDesordenado);
		
		//int[] array=obtenerArrayOrdenadoPares(arrayDesordenado);
		imprimirArray(array);
	}

	
	private static void imprimirArray(int[] array)
	{
		//System.out.println(array);
		
		for(int c:array)
		{
			System.out.println(""+ c);
		}
	}//Imprimir array
	private static int[] obtenerArrayOrdenado(int[] arrayDesordenado)
	{
		
		int[] arrayOrdenado= new int[arrayDesordenado.length];
		int vMax=Integer.MIN_VALUE;
		int posMax=-1;
		int posInser=0;
		
		for(int i=0;i<arrayDesordenado.length;i++) 
		{
			for(int j=0;j<arrayDesordenado.length;j++)
			{
				if(vMax<arrayDesordenado[j])
				{
					vMax=arrayDesordenado[j];
					posMax=j;
				}
			}
			//vMax y posMax tienen el valor máximo y su posición
			arrayOrdenado[posInser]=vMax;
			arrayDesordenado[posMax]=Integer.MIN_VALUE;
			posInser++;// Se podria usar i
			vMax=Integer.MIN_VALUE;
			
		}
		
		
		return arrayOrdenado;
		
	}//array desordenado
	
	private static int[]obtenerArrayOrdenadoPares(int[] arrayDesordenado)
	{
		for(int i=0;i<arrayDesordenado.length;i++)
		{
			for( int j=i+1;j<arrayDesordenado.length;j++)
			{
				if(arrayDesordenado[i]<arrayDesordenado[j])
				{
					int vAux=arrayDesordenado[i];
					arrayDesordenado[i]=vAux;
				}
			}
		}
		return arrayDesordenado;
	}//oBTENERaRRAY ordenado cambiando los números
}
