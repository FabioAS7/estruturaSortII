package ex01;

import fabio.fatec.Quick;

public class Ex01 {
	
	public static void main(String args[]) {
		
		Quick q = new Quick();
		int vet[] = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
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
