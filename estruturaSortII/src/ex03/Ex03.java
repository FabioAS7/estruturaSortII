package ex03;

import fabio.fatec.Quick;

public class Ex03 {
	
	public static void main(String args[]) {
		
		Quick q = new Quick();
		int vet[] = {31, 32, 33, 34, 99, 98, 97, 96};
		
		for(int a: vet) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		q.quick(vet, 0, vet.length-1);
		
		for(int a: vet) {
			System.out.print(a + " ");
		}
	}
}
