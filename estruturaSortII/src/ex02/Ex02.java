package ex02;

import fabio.fatec.Quick;

public class Ex02 {
	
	public static void main(String args[]) {
		
		Quick q = new Quick();
		int vet[] = {44,43,42,41,40,39,38};
		
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
