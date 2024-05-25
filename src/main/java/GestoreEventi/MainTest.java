package GestoreEventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		/*
		 * << RICHIESTA NUOVO EVENTO A UTENTE >> Creare una classe Main di test, in cui
		 * si chiede all’utente di inserire unnuovo evento con tutti i parametri.
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

		Evento e = new Evento(title, date, postiTot);

		System.out.println(e.toString());
		System.out.print("Numero di posti totali: " + e.getPostiTot() + "\n\n");

		/*
		 * Dopo che l’evento è stato istanziato, chiedere all’utente se e quante
		 * prenotazioni vuole fare e provare ad effettuarle, implementando opportuni
		 * controlli Stampare a video il numero di posti prenotati e quelli disponibili
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Vuoi effettuare una nuova prenotazione? ('SI' o 'NO')");

		String isPrenota = input.nextLine().toUpperCase();

		switch (isPrenota) {
		case "SI":

			System.out.println("Quante prenotazioni si desidera effettuare?");
			int numPrenotazioni = input.nextInt();

			for (int i = numPrenotazioni; i >= 1; i--) {
				e.prenota();
			}

			System.out.println("Le tue prenotazioni: " + e.getPrenotazioni());
			System.out.println("Posti residui: " + (e.getPostiTot() - e.getPrenotazioni()));
			break;

		case "NO":
			System.out.println("Operazione terminata");
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + isPrenota);
		}

		/*
		 * Chiedere all’utente se e quanti posti vuole disdire Provare ad effettuare le
		 * disdette, implementando opportuni controlli Stampare a video il numero di
		 * posti prenotati e quelli disponibili
		 */

		Scanner input2 = new Scanner(System.in);
		System.out.println("\nVuoi disdire una o più prenotazioni? ('SI' o 'NO')");

		String isDisdici = input2.nextLine().toUpperCase();

		switch (isDisdici) {
		case "SI":

			System.out.println("Quante prenotazioni si desidera disdire?");
			int numAnnullamenti = input2.nextInt();

			for (int i = numAnnullamenti; i >= 1; i--) {
				e.disdici();
			}

			System.out.println("Le tue prenotazioni: " + e.getPrenotazioni());
			System.out.println("Posti residui: " + (e.getPostiTot() - e.getPrenotazioni()));
			break;

		case "NO":
			System.out.println("Operazione terminata");
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + isPrenota);
		}
		
	}

}
