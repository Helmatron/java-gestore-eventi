package GestoreEventi;

import java.time.LocalDate;

public abstract class AbstractEvento implements IPrenotazioni {

	/* << CREA CLASSE EVENTO >>
	 * -- dal momento che la classe evento contine le specifiche comuni a diversi
	 * tipi di evento, ho deciso di renderla astratta --
	 * 
	 * << ATTRIBUTI EVENTO >>
	 * Creare una classe Evento che abbia le seguenti proprietà:
	 * 
	 * titolo, data, numero di posti in totale, numero di posti prenotati.
	 */

	private String title;
	private LocalDate date;
	private int postiTot;
	private int prenotazioni;

	/* << COSTRUTTORE >>
	 * Quando si istanzia un nuovo evento questi attributi devono essere tutti
	 * valorizzati nel costruttore, tranne posti prenotati che va inizializzato a 0.
	 * 
	 * Inserire il controllo che la data non sia già passata e che il numero di
	 * posti totali sia positivo. In caso contrario mostrare i dovuti avvisi
	 * all’utente
	 */

	public AbstractEvento(String title, LocalDate date, int postiTot) {
		if (date.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("Data passata. Impossibile creare evento.");
		}
		if (postiTot <= 0) {
			throw new IllegalArgumentException("Numero di posti totali non valido.");
		}

		this.title = title;
		this.date = date;
		this.postiTot = postiTot;
		this.prenotazioni = 0;

	}

	/* << GETTER E SETTER >>
	 * Aggiungere metodi getter e setter in modo che:
	 * 
	 * titolo sia in lettura e in scrittura
	 * data sia in lettura e scrittura
	 * numero di posti totale sia solo in lettura
	 * numero di posti prenotati sia solo in lettura
	 */

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getPostiTot() {
		return this.postiTot;
	}

	public int getPrenotazioni() {
		return this.prenotazioni;
	}
	
	/*
	 * << OVERRIDE PRENOTA E DISDICI >>
	 */

	@Override
	public void prenota() {
		if (date.isBefore(LocalDate.now())) {
			System.out.println("Evento già passato. Impossibile prenotare");
		}
		if (prenotazioni >= postiTot) {
			System.out.println("Posti esauriti");
		}
		prenotazioni++;
	}

	@Override
	public void disdici() {
		if (date.isBefore(LocalDate.now())) {
			System.out.println("Evento già passato. Impossibile disdire");
		}
		if (prenotazioni <= 0) {
			System.out.println("Nessuna prenotazione da disdire");
		}
		prenotazioni--;
	}
	
	/*
	 * << ABSTRACT DEL METODO TOSTRING COMUNE ALLE SOTTOCLASSI >>
	 */
	
	@Override
	public abstract String toString();

}
