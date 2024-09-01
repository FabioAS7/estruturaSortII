package ex06;

import fabio.fatec.*;

public class Ex06 {
	
	public static void main(String args[]) {
		int [] vet1 = new int[1500];
		int [] vet2 = new int[1500];
		int [] vet3 = new int[1500];
		int x=1499;
		long inicio;
		long fim;
		double tempo;
		Bubble b = new Bubble();
		Merge m = new Merge();
		Quick q = new Quick();
		
		
		for(int i=0; i<1500; i++) {
			vet1[i]=x--;
			vet2[i]=x--;
			vet2[i]=x--;
		}
		
		inicio = System.nanoTime();
		b.bubble(vet1);
		fim = System.nanoTime();
		tempo = (fim-inicio)/1000000;
		System.out.println("Por BubbleSort demorou " + tempo + " milisegundos");
		
		inicio = System.nanoTime();
		m.merge(vet2, 0, vet2.length-1);
		fim = System.nanoTime();
		tempo = (fim-inicio)/1000000;
		System.out.println("Por MergeSort demorou " + tempo + " milisegundos");
		
		inicio = System.nanoTime();
		q.quick(vet3, 0, vet3.length-1);
		fim = System.nanoTime();
		tempo = (fim-inicio)/1000000;
		System.out.println("Por QuickSort demorou " + tempo + " milisegundos");
		
	}
}
