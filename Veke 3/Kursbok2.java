import javax.swing.JOptionPane;

// Eg drifta litt vekk frå leksjonen her eit lite øyeblikk, så denne er nok litt ut over spørsmålet.
public class Kursbok2
{
	String txt="";

	public Kursbok2( String arg){

		this.txt = arg;
	}
	public void visTittel(){

		String mld = "Kursi heiter: "+this.txt;
		JOptionPane.showMessageDialog(null,mld);

	}

}