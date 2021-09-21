import java.util.Random;
import java.util.Scanner;

public class ordenacao_GMW_Selection {

	static void geraVetor (int[] v, int n) {
	    int i;
	    Random random = new Random();
	    for (i=0; i<n; i++) {
	        v[i] = random.nextInt(10*n);
	    }
    }
    
	static void mostraVetor (String s, int[] v, int n) {
	    int i;
	    System.out.println ("\n" +s);
	    for (i=0; i<n; i++) {
	        System.out.print (v[i] + " ");
	    }
	    System.out.println ();
    }
    
	static void selectionSort (int[] v, int n) {
		for (int i = 0; i < n; i++) {
			int m = i;
    		for (int j = (i+1); j<n; j++) {
            	if (v[j] < v[m]) {
            	m = j;
           	    }
        	}
        	if (v[i] != v[m]) {
            	int aux = v[i];
            	v[i] = v[m];
            	v[m] = aux;
        	}
    	}
    }
    
	public static void main (String args []) {
	    int [] v;
	    int n;
	    Scanner scanner = new Scanner(System.in);
	    System.out.print ("Digite o tamanho do vetor: ");
	    n = scanner.nextInt();
	    v = new int [n];
	    geraVetor(v, n);
	    //mostraVetor("Vetor original: ", v, n);
	    long inicio = System.currentTimeMillis ();
	    selectionSort (v, n);
	    long fim = System.currentTimeMillis ();
	    //mostraVetor("Vetor ordenado: ", v, n);
	    double tempo = (float)(fim-inicio)/1000;
	    System.out.printf ("A ordenação demorou %.3f segundos\n", tempo);
	    scanner.close();
	}
}