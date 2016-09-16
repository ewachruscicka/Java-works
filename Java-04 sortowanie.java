import java.io.*;
import java.util.Random;

public class Program4 {

   public static void babelek(int[] tablica, int rozmiar) {
      boolean zamiana = false;
	   int tmp;
      int i, j;
      for ( i = 1; i < rozmiar; i++ ) {
    	  zamiana = false;
         for ( j = 1; j < rozmiar; j++ ) {
            if ( tablica[j-1] > tablica[j] ) {
               tmp = tablica[j-1];
               tablica[j-1] = tablica[j];
               tablica[j] = tmp;
               zamiana = true;
            }
         }
         if (!zamiana) break;
      }
   }

   public static int suma(int[] tablica, int rozmiar) {
      int s = 0;
      for ( int i = 0; i < rozmiar; i++ )
         s += tablica[i];
      return s;
   }

   public static int minimum(int[] tablica, int rozmiar) {
      int min = tablica[0];
      for ( int i = 1; i < rozmiar; i++ )
         if ( tablica[i] < min )
            min = tablica[i];
      return min;
   }
   
   public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
	      //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      Random rand = new Random();
		   for ( int i = 0; i < rozmiar; i++ ) {
	         //System.out.println("Podaj liczbe: ");
	         tablica[i] = rand.nextInt(100);//Integer.parseInt(in.readLine());
	      }
	   }
   
   public static void wypisz_tablice(int[] tablica, int rozmiar) {
      for ( int i = 0; i < rozmiar; i++ )
         System.out.println("tablica["+i+"] = "+tablica[i]);
   }

   public static void main(String[] args) {
      try {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int r;
         System.out.println("Podaj rozmiar: ");
         r = Integer.parseInt(in.readLine());
         int[] t = new int[r];
         wczytaj_tablice(t, r);
         
         System.out.println("Tablica przed posortowaniem:");
         wypisz_tablice(t, r);
         long startTime = System.nanoTime();
         babelek(t, r);
         long endTime = System.nanoTime();
         long duration = (endTime - startTime);
         System.out.println("Czas sortowania: "+duration);
         //babelek(t, r);
         System.out.println("Tablica posortowana:");
         wypisz_tablice(t, r);
 
      } catch(IOException e) {
      }
   }
}

