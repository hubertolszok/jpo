package Zadanie;

import java.util.ArrayList;

public class tester {

	public static void main(String[] args) {
		
		Kula Kula1= new Kula(6);
		Walec Walec1= new Walec (78.22);
		Pret Pret1 = new Pret(56.4,56.9);
		
		System.out.print(Kula1.getopisobiekt()+"\t Moment bezwladnosci:  "+ Kula1.getmb()+"\t "+"\t Moment Steinera: \t"+Kula1.getmbstein(2)+"\n");
		System.out.print(Walec1.getopisobiekt()+"\t Moment bezwladnosci:  "+ Walec1.getmb()+"\t "+"\t Moment Steinera: \t"+Walec1.getmbstein(2)+"\n");
		System.out.print(Pret1.getopisobiekt()+"\t Moment bezwladnosci:  "+ Pret1.getmb()+"\t "+"\t Moment Steinera: \t"+Pret1.getmbstein(2)+"\n");
		
		
		punktmaterialny tab[] = new punktmaterialny[9];
		
		for(int x=0; x<9; x=x+3) {
			tab[x]=new Walec((x+1)*2,(x+1)*10);
			tab[x+1]=new Kula((x+1)+10,(x+1)*2);
			tab[x+2]=new Pret((x+1)*3,(x+1)+2);
		}
		
		 for(int x = 0; x <9 ; x++)
			{
		      tab[x].opis();
		      System.out.println("Moment bezwladnosci przesuniety o 2 jednostki: " + tab[x].steiner(2) + "\n");
				      }
		
		
		
	}
}


