package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	Innlegg[] innleggTab;
	int nesteLedig = 0;

	public Blogg() {
		innleggTab = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggTab = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggTab;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i < innleggTab.length; i++){
			if(innleggTab[i] != null && innlegg.getId() == innleggTab[i].getId()) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		return innleggTab.length != nesteLedig;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(ledigPlass()){
			innleggTab[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		}
		return false;
		
	}
	
	public String toString() {
		String outString = "";
		for(Innlegg i : innleggTab){
			if(i == null) continue;
			outString += i.toString();
		}
		return String.format("%d\n%s", getAntall(), outString);
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}