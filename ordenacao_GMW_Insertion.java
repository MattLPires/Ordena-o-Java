import java.util.Random;
import java.util.Scanner;

public class ordenacao_GMW_Insertion {

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

    static void insertionSort (int[] v, int n) {
        int i, j, chave;
        for (i=1; i<n; i++) {
            chave = v[i];
            j = i-1;
            while (j>=0 && v[j]>chave) {
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = chave;
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
        insertionSort(v, n);
        long fim = System.currentTimeMillis ();
        //mostraVetor("vetor ordenado", v, n);
        double tempo = (float)(fim-inicio)/1000;
        System.out.printf ("A ordenacao demorou %.3f segundos\n", tempo);
        scanner.close();
    }
}