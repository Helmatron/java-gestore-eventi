package GestoreEventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		/*
		 * << RICHIESTA NUOVO EVENTO A UTENTE >>
		 * Creare una classe Main di test, in cui
		 * si chiede all’utente di inserire un nuovo evento con tutti i parametri.
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("CREA UN NUOVO EVENTO \n\nInserire il titolo dell'evento");
		String title = scan.nextLine();

		System.out.println("Inserire la data dell'evento (yyyy-MM-dd)");
		String dataUtente = scan.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(dataUtente, formatter);

		System.out.println("Inserire il numero massimo di prenotazioni per questo evento");
		int postiTot = scan.nextInt();

		scan.close();
		
		Evento e = new Evento(title, date, postiTot);
		
		System.out.println(e.toString());
		System.out.print("Numero di posti totali: " + e.getPostiTot());

		/*
		 * Dopo che l’evento è stato istanziato, chiedere all’utente se e quante
		 * prenotazioni vuole fare e provare ad effettuarle, implementando opportuni
		 * controlli Stampare a video il numero di posti prenotati e quelli disponibili
		 */
		
		

		

		
		

	}

}
