import java.io.*;
import java.util.Random;

public class Program2 {

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
	         
	         System.out.println("Podales nastepujace liczby:");
	         wypisz_tablice(t, r);
	         
	         System.out.println("Suma: "+suma(t, r));
	         System.out.println("Minimum: "+minimum(t, r));
	         
	      } catch(IOException e) {
	      }
   }
}
