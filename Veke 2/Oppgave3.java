import javax.swing.JOptionPane;

public class Oppgave3
 {
   public static void main(String[] args)
   {
	 String forsteSiffer = JOptionPane.showInputDialog("Første tall?");
	 String andreSiffer = JOptionPane.showInputDialog("Andre tall?");

	 int førsteTal = Integer.parseInt(forsteSiffer);
	 int andreTal = Integer.parseInt(andreSiffer);

	 String utskrift = forsteSiffer +" + " + andreSiffer + " = "+ (førsteTal+andreTal);
     JOptionPane.showMessageDialog(null, utskrift);
  }
}