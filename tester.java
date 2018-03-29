package Zadanie;

import java.util.ArrayList;

public class tester {

	public static void main(String[] args) {
	
		punktmaterialny pkt1 = new punktmaterialny();								//Obiekt tworzony konstruktorem domyslnym
		punktmaterialny pkt2 = new punktmaterialny(10);								//Obiekt tworzony konstruktorem z parametrem
		
		 
		System.out.println("Opis pkt1:  ");											//Wypisanie danych o pkt1
		pkt1.opis();
		System.out.println("Masa:  "+pkt1.getmasa());		
		System.out.println("Glowny moment bezwladnosci:  "+pkt1.gmombez());		
		System.out.println("Moment bezwladnosci wzgledem nowej osi:  "+pkt1.steiner(18));		
		pkt1.zmienmasa(20);															//Zmiana masy 1 obiektu		
		
		
		System.out.println("Opis zmienionego obiektu pkt1:  ");						//Wypisanie danych o zmienionym pkt1
		pkt1.opis();
		System.out.println("Masa:  "+pkt1.getmasa());		
		System.out.println("Glowny moment bezwladnosci:  "+pkt1.gmombez());		
		System.out.println("Moment bezwladnosci wzgledem nowej osi:  "+pkt1.steiner(18));	
		
		
		System.out.println("Opis pkt2:  ");											//Wypisanie danych o pkt2
		pkt2.opis();
		System.out.println("Masa:  "+pkt2.getmasa());		
		System.out.println("Glowny moment bezwladnosci:  "+pkt2.gmombez());
		System.out.println("Moment bezwladnosci wzgledem nowej osi:  "+pkt2.steiner(15));
	
		
		ArrayList<punktmaterialny> tablicapkt = new ArrayList<punktmaterialny>();	//Stworzenie listy obiektow
		ArrayList<Integer> tablicamas = new ArrayList<Integer>();					//Stworzenie listy mas
		int liczbapunktow = 5;				
		tablicamas.add(6);															//Dadanie kolejnych mas do tablicy
		tablicamas.add(42);
		tablicamas.add(51);
		tablicamas.add(27);
		tablicamas.add(72);
		
		for(int i=0;i<liczbapunktow;i++) {											//pętla uzupelniajaca tablice obiektow
			punktmaterialny punkt = new punktmaterialny(tablicamas.get(i));
			tablicapkt.add(punkt);
		}
		
		
		for(int i=0;i<liczbapunktow;i++) {											//petla wypisujaca obiekty wraz z opisem
			punktmaterialny punkt = tablicapkt.get(i);
			System.out.println("Opis:  ");
			punkt.opis();
			System.out.println("Masa:  "+punkt.getmasa());		
			System.out.println("Glowny moment bezwladnosci:  "+punkt.gmombez());		
			System.out.println("Moment bezwladnosci wzgledem nowej osi:  "+punkt.steiner(10));	
		}
	}
}


