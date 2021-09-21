import java.util.Random;
import java.util.Scanner;

public class ordenacao_GMW_Bubble {

    static void geraVetor (int[] v, int n) {
        int i;
        Random random = new Random();
        for (i=0; i<n; i++) {
            v[i] = random.nextInt(10*n);
        }
    }

    static void mostraVetor (String s, int[] v, int n) {
        int i;
        System.out.println ("\n" + s);
        for (i=0; i<n; i++) {
            System.out.print (v[i] + " ");
        }
        System.out.println ();
    }

    static void bubbleSort (int[] v, int n) {
        int i, j, aux;
        for (i=1; i<n; i++) {
            for (j=0; j<n-i; j++) {
                if (v[j] > v[j+1]) {
                    aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }

    public static void main (String args[]) {
        int[] v;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print ("digite o tamanho do vetor: ");
        n = scanner.nextInt();
        v = new int[n];
        geraVetor(v, n);
        //mostraVetor("vetor original", v, n);
        long inicio = System.currentTimeMillis (); 
        bubbleSort(v, n);
        long fim = System.currentTimeMillis ();
        //mostraVetor("vetor ordenado", v, n);
        double tempo = (float)(fim-inicio)/1000;
        System.out.printf ("A ordenacao demorou %.3f segundos\n", tempo);
        scanner.close();
    }
}