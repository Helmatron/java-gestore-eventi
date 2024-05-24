package GestoreEventi;

import java.time.LocalDate;

public class Evento extends AbstractEvento {

	public Evento(String title, LocalDate date, int postiTot) {
		super(title, date, postiTot);
		// TODO Auto-generated constructor stub
	}

	/* << OVERRIDE TOSTRIG >>
	 * l’override del metodo toString()
	 * in modo che venga restituita una stringa contenente:
	 * data formattata - titolo
	 */
	
	@Override
	public String toString() {
		return "\nL'evento che hai creato \n" + getDate() + " - " + getTitle();

	}

}
