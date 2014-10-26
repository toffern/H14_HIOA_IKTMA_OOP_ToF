/*
Lag et program som lager karakterprotokoll.
* Programmet skal hente navnene fra en fil klasseliste, lese inn karaktene for hver elev på en oppgave
og lagre dem i en fil fagprotokoll.
Lag først et program som genererer en fil med klasseliste.
Du skal også generere en fil fagprotokoll.
Så lenge det er flere elever på lista, les hvert elevnavn fra lista, og les inn en karakter i et
elevobjekt. Skriv elevnavn og tilknyttet karakter inn fila norskprotokoll.

Lag et program som skriver alle dataene fra fila fagprotokoll ut på skjerm.
Utvid programmet slik at du kan lese inn karakterer for fem ulike oppgaver og generere en samlekarakter.

(Denne oppgaven kan vi bruke to fredager på.)
*/

import javax.swing.JOptionPane;
//import javax.swing.JTextArea;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Veke7_Karakterprotokoll_LagTextFil{

	private Formatter output; // object used to output text to file

	public void openFile(){
		 try
		 {
			 output = new Formatter( "elever.txt" ); // open the file
		 } // end try
		 catch ( SecurityException securityException )
		 {
		 System.err.println(
		 "You do not have write access to this file." );
		 System.exit( 1 ); // terminate the program
		 } // end catch
		 catch ( FileNotFoundException fileNotFoundException )
		 {
		 System.err.println( "Error opening or creating file." );
		 System.exit( 1 ); // terminate the program
		 } // end catch
	} // end method openFile

 // add records to file
	public void addRecords() {
		 // object to be written to file
		// Denne må vi bytte ut - AccountRecord record = new AccountRecord();
		Veke7_Karakterprotokoll_elev elev = new Veke7_Karakterprotokoll_elev();

		Scanner input = new Scanner( System.in );
		System.out.printf( "%s\n%s\n%s\n%s\n\n",
		 "To terminate input, type the end-of-file indicator ",
		 "when you are prompted to enter input.",
		 "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
		 "On Windows type <ctrl> z then press Enter" );

		System.out.printf( "%s\n%s", "Skriv elevens fornavn (først, så ny linje) og etternavn.", "? " );

		while ( input.hasNext() ) { // loop until end-of-file indicator

		 try { // output values to file
		 // retrieve data to be output
			elev.setFNavn( input.next() ); // les Fornavn
			elev.setENavn( input.next() ); // les Etternavn
			if ( elev.getFNavn() != "" ){
				// Lagre elev-infoen til fil, via output-objektet
				output.format( "%s %s\n", elev.getFNavn(),elev.getENavn());
				String mld = elev.getFNavn()+", "+elev.getENavn();
				JOptionPane.showMessageDialog( null, mld, "Lagra", JOptionPane.INFORMATION_MESSAGE );
			} else {
				System.out.println(
				"Account number must be greater than 0." );
			} // end else
		 } // end try
		 catch ( FormatterClosedException formatterClosedException ) {
			 System.err.println( "Error writing to file." );
			 return;
		 } // end catch
		 catch ( NoSuchElementException elementException ) {
			 System.err.println( "Invalid input. Please try again." );
			 input.nextLine(); // discard input so user can try again
		 } // end catch

		 System.out.printf( "%s\n%s", "Skriv elevens fornavn (først, så ny linje) og etternavn.", "? " );
		 } // end while
	} // end method addRecords

	// close file
	public void closeFile(){
		if ( output != null ) output.close();
	} // end method closeFile

}