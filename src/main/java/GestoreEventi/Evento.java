package GestoreEventi;

import java.time.LocalDateTime;

public class Evento {

	private String title;
	private String date;
	private int postiTot;
	private int prenotazioni = 0;

	public Evento(String title, String date, int postiTot) {

		this.title = title;
		this.date = date;
		this.postiTot = postiTot;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
		
	}

	public int getPostiTot() {
		return postiTot;
	}

	public int getPrenotazioni() {
		return prenotazioni;
	}

	public void prenota() {
		this.prenotazioni ++;
	}
	
	public void disdici() {
		this.prenotazioni --;
	}

	@Override
	public String toString() {
		return "\nL'evento che hai creato \n" + date + " - " + title;
		
	}
	
}
