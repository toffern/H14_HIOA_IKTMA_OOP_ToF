import javax.swing.JOptionPane;

public class Kursbok1
{
	String txt="";

	public Kursbok1( String arg){

		this.txt = arg;
	}
	public void visTittel(){

		JOptionPane.showMessageDialog(null,this.txt);

	}

}