package exercicios;

public class Ex01 {

	public static void main(String[] args) {
		//Criar array
		int[] array1 = new int[11];
		
		//Looping para gerar e adicionar os números no array (de 10 a 1)
		for (int i = 10; i > 0; i--) {
			//Armazenagem dos números
			array1[i] = i;
			
			//A cada looping um número é impresso no console
			System.out.print(array1[i] + " ");
		}
	}

}
