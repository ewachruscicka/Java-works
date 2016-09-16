package jv_lab_2;

import java.io.*;

public class Program3 {

public static int minimum(int[] tablica, int r) {
	int minimum = tablica[0];
	for (int i = 1; i < r; i++)
		if (tablica[i] < minimum)
			minimum = tablica[i];
	return minimum;
}

public static int maksimum(int[] tablica, int rx) {
	int maksimum = tablica[0];
	for (int i = 1; i < rx; i++)
		if (tablica[i] > maksimum)
		   maksimum = tablica[i];
	return maksimum;
}

public static double srednia(int[] minima) {
	double srednia = 0;
	int suma = 0;
	for (int i = 0; i < minima.length; i++)
		suma = suma + minima[i];
	srednia = (double)suma / minima.length;
	return srednia;
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
         
         for ( int i = 0; i < x; i++ ) {
            for ( int j = 0; j < y; j++ ) {
               System.out.println("Podaj element ["+i+"]["+j+"]: ");
               m[i][j] = Integer.parseInt(in.readLine());
            }
         }
         
         int min_x = 0, min_y = 0;
         for ( int i = 0; i < x; i++ ) 
            for ( int j = 0; j < y; j++ )
               if ( m[i][j] < m[min_x][min_y] ) {
                  min_x = i;
                  min_y = j;
               }
         
         System.out.println("Najmniejszy element znajduje sie w wierszu nr "+
                            (min_x)+" i kolumnie nr "+(min_y)+
                            " a jego wartosc wynosi "+m[min_x][min_y]);
      
         int tablicamin [] = new int[y];
         for (int i = 0; i < y; i++)
     	   tablicamin[i] = minimum(m[i], x);
         int max = maksimum(tablicamin, y);
     	
     	System.out.println("Najwiêksze minimum z tablicy: " + max);
     	System.out.println("Œrednia minimów: " + srednia(tablicamin));
      
      } catch(IOException e) {
      }
   }
}
