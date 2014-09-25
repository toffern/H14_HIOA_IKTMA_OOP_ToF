import javax.swing.JOptionPane;

public class Kursboktest2
{
	public static void main( String[] args ){

		String tittelen = JOptionPane.showInputDialog("Kva heiter kursi?");
		Kursbok2 protokoll = new Kursbok2(tittelen);

		protokoll.visTittel();

	}

}