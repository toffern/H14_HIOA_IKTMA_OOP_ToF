/*
Lag et program som gjentatte ganger leser inn nummeret til en ukedag, der 1 svarer til mandag, 2 til tirsdag, og s� videre, inntil 7 for s�ndag.
For hvert innlest nummer skal programmet skrive ut navnet p� vedkommende ukedag, alts� "mandag" i tilfelle det blir lest inn 1, "tirsdag" n�r det blir lest inn 2, og s� videre.
Dersom det blir lest inn et tall st�rre enn 7, skal teksten "ukjent ukedag" skrives ut.
Dersom det blir lest inn 0 eller en negativ verdi, skal programmet avslutte. Bruk en switch-setning til � avgj�re hva som skal skrives ut.
*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Veke5_Oppgave10_Switch_Vekedag{

	public static void main( String args[]) {
		Integer inputUkedag = Integer.parseInt( JOptionPane.showInputDialog("Kva nummer ukedag vil du ha? Velg 0 eller negativt tal for � slutte") );
		//String mld = Integer.toString(inputUkedag);

		String ukedagNavn="", mld="";

		while(inputUkedag>0){

			switch(inputUkedag){

				case 1:
						ukedagNavn = "M�ndag";
						break;
				case 2:
						ukedagNavn = "tysdag";
						break;
				case 3:
						ukedagNavn = "onsdag";
						break;
				case 4:
						ukedagNavn = "torsdag";
						break;
				case 5:
						ukedagNavn = "fr�ddan";
						break;
				case 6:
						ukedagNavn = "laugardag";
						break;
				case 7:
						ukedagNavn = "sundag";
						break;
				default:
						mld = "<frekkas> No har du rota litt oppi det vesle hovudet ditt, kj�re ven. Ukjent ukedag! </frekkas>";
			}
			if(inputUkedag<=7) mld = " Du valgte "+ukedagNavn;

			JOptionPane.showMessageDialog(null,mld);  // moglege parmeter til metoda (frame, message, messageType, optionType, options, icon, title,initialValue)
			inputUkedag = Integer.parseInt( JOptionPane.showInputDialog("Kva nummer ukedag vil du ha? Velg 0 eller negativt tal for � slutte") );

		}

	}

}