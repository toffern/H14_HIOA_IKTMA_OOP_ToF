import javax.swing.JOptionPane;

public class Oppgave5
 {
   public static void main(String[] args)
   {
	 double radius = Double.parseDouble( JOptionPane.showInputDialog("Oppgi radius.") );

	 double areal = radius*radius*3.14;

	 String utskrift = "Ved radius: "+radius+" blir arealet: "+areal;
     JOptionPane.showMessageDialog(null, utskrift);
  }
}