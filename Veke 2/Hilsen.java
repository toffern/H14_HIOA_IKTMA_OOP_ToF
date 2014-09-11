import javax.swing.JOptionPane;

public class Hilsen
 {
   public static void main(String[] args)
   {
	 String navn = JOptionPane.showInputDialog("Kva heiter du?");
	 String utskrift = "Hei på deg " + navn;
     JOptionPane.showMessageDialog(null, utskrift);
  }
}