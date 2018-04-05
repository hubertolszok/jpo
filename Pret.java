package Zadanie;

public class Pret extends punktmaterialny{

	public Pret() {								//Konstruktor domyslny
		super();
	}

	public Pret(double masa) {					//Konstruktor z 1 parametrem
		super (masa);
	}
	
	public Pret(double masa, double promien) {//Konstruktor z 2 parametrami
		super (masa, promien);
	}
	
	public double getmb() {						//Obliczanie glownego momentu bezwladnosci
		double masa = getmasa();
		return(masa*promien*promien)/12;
	}
	
	public double getmbstein(double odlodosi) {//Obliczanie momentu bezwladnosci z twierdzenia steinera
		return getmb() + masa * odlodosi * odlodosi;
		
	}
	
	public String getopisobiekt() {				//Zwraca nazwe obiekti
		return "Pret";
	}
}
