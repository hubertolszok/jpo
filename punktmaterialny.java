package Zadanie;
public class punktmaterialny {
	protected double masa;
	protected double promien;
			
	public punktmaterialny() {					//Konstruktor domyslny
		masa=1;
		promien=1;
    }
	public punktmaterialny(double m) { 			//Konstruktor z parametrem
		if(m>0) {
			masa=m;
			promien=1;
		}
		else {
			System.out.println("Masa nie moze byc ujemna");
		}
    }
	
	public punktmaterialny(double m, double r) { 			
		if(m>0) {
			masa=m;
			
			if(r>0) {
				promien=r;
			}
			else {
				System.out.println("Promien nie moze byc ujemny");
			}
			
		}
		else {
			System.out.println("Masa nie moze byc ujemna");
		}
    }
	
	
	public double getmasa() {						//akcesor
		return masa;
	}
	public double zmienmasa(int a) {				//akcesor
		masa=a;
		return masa;
	}
		
	public int gmombez() {						//Metoda obliczajaca glowny moment bezwladnosci
		int a=0;
		return a;
	}
	public double steiner(double r) {					//Metoda obliczajaca moment bezwladnosci z tw. Steinera
		double mbs;	
		mbs=gmombez()+masa*r*r;
		return mbs;	//Wartosc momentu bezwladnosci z tw. steinera
	}
	public void opis() {						//Metoda zwracajaca opis obiektu
		System.out.println(" Punkt Materialny ");

	}
	
	}

