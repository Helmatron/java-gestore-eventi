package GestoreEventi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {

	/* << ATTRIBUTI >>
	 * Creare una classe Concerto che estende Evento,
	 * che ha anche gli attributi:
	 * ora (LocalTime) prezzo
	 */

	private LocalTime ora;
	private double price;

	/* << COSTRUTTORE >>
	 * Aggiungere questi attributi nel costruttore
	 * e implementarne getter e setter.
	 */

	public Concerto(String title, LocalDate date, int postiTot, LocalTime ora, double price) {
		super(title, date, postiTot);
		if (ora.isBefore(LocalTime.now())) {
			throw new IllegalArgumentException("Ora evento passata. Impossibile creare evento.");
		}
		this.ora = ora;
		this.price = price;

	}
	
	/*
	 * << GETTER E SETTER >>
	 */

	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	/* << METODI PER ORA E PREZZO FORMATTATI >>
	 * Aggiungere i metodi per restituire 
	 * data e ora formattata 
	 * e prezzo formattato (##,##€)
	 */
	
	public void setFormattingOra(String ora) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH-mm");
		this.ora = LocalTime.parse(ora, formatter);
	}
	
	public String getFormattingPrice() {
		String prezzoFormattato = String.format("%,#.2f€", price);
		return prezzoFormattato;
	}
	
	/* << OVERRIDE TOSTRING >>
	 * Fare l’ override del metodo toString()
	 * in modo che venga restituita una stringa del tipo:
	 * data e ora formattata - titolo - prezzo formattato
	 */
	
	@Override
	public String toString() {
		return "\nL'evento che hai creato \n" 
				+ "Data e ora: " + super.getDate()+ " / " + getOra()
				+ "\nTitolo: " + super.getTitle().toUpperCase()
				+ "\nPrezzo: " + getFormattingPrice() + " €";
	}

	
}
