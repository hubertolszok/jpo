package Zadanie;

public class Kula extends punktmaterialny {
	
	public Kula() {								//Konstruktor domyslny
		super();
	}
	
	public Kula(double masa) {					//Konstruktor z 1 parametrem
		super(masa);
	}
	
	public Kula (double masa, double promien) {//Konstruktor z 2 parametrami
		super(masa,promien);		
	}
	
	public double getmb() {						//Obliczanie glownego momentu bezwladnosci
		double masa = getmasa();
		return(masa*promien*promien*0.4);
	}
	
	public double getmbstein(double odlodosi) {//Obliczanie momentu bezwladnosci z twierdzenia steinera
		return getmb() + masa * odlodosi * odlodosi;
		
	}
	
	public String getopisobiekt() {				//Zwraca nazwe obiekti
		return "Kula";
	}
}
