package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import static java.lang.String.format;

public class Tekst extends Innlegg {

	private String tekst;
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id, bruker, dato);
        this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes);
        this.tekst = tekst;
	}
	
	public String getTekst() {
		return tekst;

	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
protected String format() {
        return super.toString() + tekst + "+\n";
}

	@Override
	public String toString() {
		return "TEKST\n" + format();

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	//public String toHTML() {
			
	//	throw new UnsupportedOperationException(TODO.method());
				
	//}
}
