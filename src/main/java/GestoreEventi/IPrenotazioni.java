package GestoreEventi;

public interface IPrenotazioni {

	/*<< IMPLEMENTAZIONE METODI PRENOTA E DISDICI >>
	 * Vanno inoltre implementati dei metodi public che svolgono le seguenti
	 * funzioni:
	 * 
	 * prenota: aggiunge uno ai posti prenotati. Se l’evento è già passato
	 * o non ha posti disponibili deve restituire un messaggio di avviso.
	 * 
	 * disdici: riduce di uno i posti prenotati. Se l’evento è già passato o non ci sono
	 * prenotazioni restituisce un messaggio di avviso.
	 */
	
	public void prenota();

	public void disdici();

}
