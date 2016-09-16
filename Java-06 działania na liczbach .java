package jv_lab_2;
import java.io.*;

public class Program2 {

	public static int suma(int[] tablica, int rozmiar) {
		int s = 0;
		for (int i = 0; i < rozmiar; i++)
			s += tablica[i];
		return s;
	}

	public static int minimum(int[] tablica, int rozmiar) {
		int min = tablica[0];
		for (int i = 1; i < rozmiar; i++)
			if (tablica[i] < min)
				min = tablica[i];
		return min;
	}

	public static int srednia(int[] tablica, int rozmiar) {
		int sr = 0;
		int sum1 = 0;
		for (int i = 0; i < rozmiar; i++)
			sum1 += tablica[i];
		
		sr = sum1 / rozmiar;
		return sr;
	}
	
	public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < rozmiar; i++) {
			System.out.println("Podaj liczbe: ");
			tablica[i] = Integer.parseInt(in.readLine());
		}
	}

	public static void wypisz_tablice(int[] tablica, int rozmiar) {
		for (int i = 0; i < rozmiar; i++)
			System.out.println("tablica[" + i + "] = " + tablica[i]);
	}

	public static void main(String[] args) {
       	 int tablica [] = new int [5];
       	 
       	   try {
			wczytaj_tablice(tablica, 5);
		} catch (IOException e) {
			e.printStackTrace();
		}
	int suma = suma(tablica, 5);
	System.out.println("Suma liczb: " + suma);
	
	int min = minimum(tablica, 5);
	System.out.println("Minimum liczb: " + min);
	
	int sr = srednia(tablica, 5);
	System.out.println("Œrednia z liczb: " + sr);
	
	}
}