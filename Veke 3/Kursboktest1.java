import javax.swing.JOptionPane;

public class Kursboktest1
{
	public static void main( String[] args ){

		String tittelen = JOptionPane.showInputDialog("Kva heiter kursi?");
		Kursbok1 protokoll = new Kursbok1(tittelen);

		protokoll.visTittel();

	}

}