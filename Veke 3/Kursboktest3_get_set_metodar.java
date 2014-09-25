import javax.swing.JOptionPane;

public class Kursboktest3_get_set_metodar
{
	public static void main( String[] args ){

		Kursbok3og4 protokoll = new Kursbok3og4("");
		protokoll.visTittel();

		String nyTittelen = JOptionPane.showInputDialog("Kva heiter kursi no då?");
		protokoll.setTittel(nyTittelen);

		JOptionPane.showMessageDialog(null,"Tittelen er "+protokoll.getTittel());

		String nyTittel2 = JOptionPane.showInputDialog("Kva heiter kursi NO då?!?!");
		protokoll.setTittel(nyTittel2);
		JOptionPane.showMessageDialog(null,"Tittelen er no "+protokoll.getTittel());

	}
}