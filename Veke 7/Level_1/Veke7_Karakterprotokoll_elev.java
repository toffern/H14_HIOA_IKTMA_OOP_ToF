/*
Lag et program som lager karakterprotokoll.
 Denne fila har elev-klassa.
*/

public class Veke7_Karakterprotokoll_elev{

	private String fNavn;
	private String eNavn;

	public Veke7_Karakterprotokoll_elev(){
		fNavn="";
		eNavn="";
	}
	public Veke7_Karakterprotokoll_elev(String eN, String fN){
		setENavn(eN);
		setFNavn(fN);
	}

	public void setENavn(String eN){
		eNavn=eN;
	}
	public void setFNavn(String fN){
		fNavn=fN;
	}

	public String getENavn(){
		return eNavn;
	}

	public String getFNavn(){
		return fNavn;
	}
}