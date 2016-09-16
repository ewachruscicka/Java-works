package jv_lab_2;

import java.io.*;
import java.util.Random;

public class Program1 {

	static int i  = 0;
		
   public static void 	wczytaj_tablice(int[] tablica, int rozmiar) 
	throws IOException 
   {
	   
      BufferedReader in ;
      in = new BufferedReader(new InputStreamReader(System.in));
      
      for ( int i = 0; i < rozmiar; i++ ) {
         System.out.println("Podaj liczbe: ");
         String wczytanyTekst	= in.readLine();
         tablica[i] 			= Integer.parseInt(wczytanyTekst);
      }
   }

   public static void wylosuj_tablice(int[] tablica, int rozmiar)
   throws IOException 
   {
	   Random losowanie = new Random();
	   
	   System.out.println("Podaj zakres: ");
	   
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   String tekst = in.readLine();
	   int b = Integer.parseInt(tekst);
	   
	   
	for ( i = 0; i < rozmiar; i++ )
	{
		int a = losowanie.nextInt(b);
		tablica[i] = a;
	}
   }
   
   public static void wypelnij_tablice(int[] tablica, int rozmiar)
     throws IOException 
     {
	   int a = 2;
	   for ( i = 0; i < tablica.length; i++ )
	   {
		   tablica[i] = a;
		   a *= 2;
	   }
     }
     
   public static void 	wypisz_tablice(int[] tablica, int rozmiar) {
      for ( int i = 0; i < rozmiar; i++ )
         System.out.println("tablica[" + i + "] = " + tablica[i]);
   }

   public static void 	main(String[] args) {

      try {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int r = 0;
         System.out.println("Podaj rozmiar: ");
       
         while(true)
         {
        	 try{
        		 r = Integer.parseInt(in.readLine());
        		 System.out.println("OK to jest liczba !!!");
        		 break;
        	 }catch(NumberFormatException e2)
        	 {
        		 System.out.println("TO nie jest liczba !!!");
        	 }
         }
         
         int t[] = new int[r];
         wypelnij_tablice(t, r);
         
         System.out.println("Podales nastepujace liczby:");
         wypisz_tablice(t, r);
         
      } catch(IOException e) {
    	  e.printStackTrace();
      }
   }
}
