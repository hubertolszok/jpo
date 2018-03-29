package Zadanie;
public class punktmaterialny {
	private int masa;
	
	public punktmaterialny() {					//Konstruktor domyslny
		masa=1;
    }
	public punktmaterialny(int m) { 			//Konstruktor z parametrem
		if(m>0) {
			masa=m;
		}
		else {
			System.out.println("Masa nie moze byc ujemna");
		}
    }
	
	public int getmasa() {						//akcesor
		return masa;
	}
	public int zmienmasa(int a) {				//akcesor
		masa=a;
		return masa;
	}
		
	public int gmombez() {						//Metoda obliczajaca glowny moment bezwladnosci
		int a=0;
		return a;
	}
	public int steiner(int r) {					//Metoda obliczajaca moment bezwladnosci z tw. Steinera
		int mbs;	
		mbs=gmombez()+masa*r*r;
		return mbs;	//Wartosc momentu bezwladnosci z tw. steinera
	}
	public void opis() {						//Metoda zwracajaca opis obiektu
		System.out.println(" Punkt Materialny ");

	}
	
	}

