import javax.swing.JOptionPane;

public class Oppgave4
 {
   public static void main(String[] args)
   {
	 String forsteSiffer = JOptionPane.showInputDialog("Oppgi første desimaltall.");
	 String andreSiffer = JOptionPane.showInputDialog("Oppgi andre desimaltall.");

	 double førsteTal = Double.parseDouble(forsteSiffer);
	 double andreTal = Double.parseDouble(andreSiffer);

	 String utskrift = forsteSiffer +" + " + andreSiffer + " = "+ (førsteTal+andreTal);
     JOptionPane.showMessageDialog(null, utskrift);
  }
}