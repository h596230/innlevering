package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		String outString = samling.toString();
		try {
			FileWriter fWriter = new FileWriter(mappe + filnavn);
			fWriter.write(outString);
			fWriter.close();
		} catch (IOException e){
			return false;
		}
		return true;
	}
}
