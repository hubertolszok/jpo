package Zadanie;

public class Walec extends punktmaterialny{

	public Walec() {									//Konstruktor domyslny
		super();
	}

	public Walec(double masa) {							//Konstruktor z 1 parametrem
		super (masa);
	}
	
	public Walec(double masa, double promien) {			//Konstruktor z 2 parametrami
		super (masa, promien);
	}
	
	public double getmb() {								//Obliczanie glownego momentu bezwladnosci
		double masa = getmasa();
		return(masa*promien*promien*0.5);
	}
	
	public double getmbstein(double odlodosi) {			//Obliczanie momentu bezwladnosci z twierdzenia steinera
		return getmb() + masa * odlodosi * odlodosi;
		
	}
	
	public String getopisobiekt() {						//Zwraca nazwe obiekti
		return "Walec";
	}
}
