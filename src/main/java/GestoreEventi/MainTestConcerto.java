package GestoreEventi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainTestConcerto {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("CREA UN NUOVO CONCERTO \n\nInserire il titolo del concerto");
		String title = scan.nextLine();

		System.out.println("Inserire la data del concerto (yyyy-MM-dd)");
		String dataUtente = scan.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(dataUtente, formatter);
		
		System.out.println("Inserire l'ora del concerto (HH-mm)");
		String oraUtente = scan.nextLine();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("HH-mm");
		LocalTime ora = LocalTime.parse(oraUtente, f);

		System.out.println("Inserire il numero massimo di posti disponibili");
		int postiTot = scan.nextInt();
		
		System.out.println("Inserire il prezzo");
		double price = scan.nextDouble();

		Concerto e = new Concerto(title, date, postiTot, ora, price);

		System.out.println(e.toString());
		System.out.print("Numero di posti totali: " + e.getPostiTot() + "\n\n");
		
		
		
		
		
/*		<< TEST >>
		Scanner scan = new Scanner(System.in);
		
		Concerto e = new Concerto(null, LocalDate.now(), 1, LocalTime.now(), 0);

		System.out.println("CREA UN NUOVO CONCERTO \n\nInserire il titolo del concerto");
		e.setTitle(scan.nextLine().toUpperCase());

		System.out.println("Inserire la data del concerto (yyyy-MM-dd)");
		e.setDate(scan.nextLine());
		
		System.out.println("Inserire l'ora del concerto (HH-mm)");
		e.setFormattingOra(scan.nextLine());
		
		System.out.println("Inserire il numero massimo di posti disponibili");
		e.setPostiTot(scan.nextInt());
		
		System.out.println("Inserire il prezzo");
		e.setPrice(scan.nextDouble());

	
		System.out.println(e.toString());
		System.out.print("Numero di posti totali: " + e.getPostiTot() + "\n\n");
		*/
	}

}
