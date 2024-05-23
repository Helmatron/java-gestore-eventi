package GestoreEventi;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("CREA UN NUOVO EVENTO \n\nInserire il titolo dell'evento");
		String title = scan.nextLine();
		
		System.out.println("Inserire la data dell'evento");
		String date = scan.nextLine();
		
		System.out.println("Inserire il numero massimo di prenotazioni per questo evento");
		int postiTot = scan.nextInt();
		
		scan.close();
		
		Evento e = new Evento(title, date, postiTot);
		
		System.out.println(e.getPostiTot());
		System.out.println(e.toString());
		
	}
	
}
