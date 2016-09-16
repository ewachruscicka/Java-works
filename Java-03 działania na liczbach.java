import java.io.*;
import java.util.Random;

public class Program3 {
	
	public static void wypisz_tablice(int[] tablica, int rozmiar) {
	      for ( int i = 0; i < rozmiar; i++ )
	         System.out.println("tablica["+i+"] = "+tablica[i]);
	   }

   public static void main(String[] args) {
      try {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int x, y;
         System.out.println("Podaj liczbe wierszy macierzy: ");
         x = Integer.parseInt(in.readLine());
         System.out.println("Podaj liczbe kolumn macierzy: ");
         y = Integer.parseInt(in.readLine());        
         int[][] m = new int[x][y];
         Random rand = new Random();
         for ( int i = 0; i < x; i++ ) {
            for ( int j = 0; j < y; j++ ) {
               m[i][j] = rand.nextInt(100);
               System.out.print("m["+i+"]["+j+"]= "+m[i][j]+" ");
            }
            System.out.println();
         }
         
         int min_x = 0, min_y = 0;
         for ( int i = 0; i < x; i++ ) 
            for ( int j = 0; j < y; j++ )
               if ( m[i][j] < m[min_x][min_y] ) {
                  min_x = i;
                  min_y = j;
               }
         
         int[] pom = new int[x];
         for ( int i = 0; i < x; i++ ) {
        	 pom[i] = m[i][0];
            for ( int j = 0; j < y; j++ )
               if ( m[i][j] < pom[i] ) {
                   pom[i]=m[i][j];
               }
         }
         
         wypisz_tablice(pom, pom.length);
         
         System.out.println("Najmniejszy element znajduje sie w wierszu nr "+
                            (min_x)+" i kolumnie nr "+(min_y)+
                            " a jego wartosc wynosi "+m[min_x][min_y]);
      } catch(IOException e) {
      }
   }
}
