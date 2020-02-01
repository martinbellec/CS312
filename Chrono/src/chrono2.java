
public class chrono2 {
	private int nbSecondes = 0;
	
	public int getHeures() {
		return nbSecondes/3600;
	}
	public int getMinutes() {
		return (nbSecondes%3600)/60;
	}
	public int getSecondes() {
		return (nbSecondes%3600)%60;
	}
	
	public void setHeures(int h) {
		if(h>=0) { //On considère ici l'heure comme pouvant être supérieure à 24
			nbSecondes = getSecondes() + getMinutes()*60 + 3600*h;
		}
	}
	public void setMinutes(int m) {
		if(m>=0 && m<60) {
			nbSecondes = getSecondes() +m*60 + getHeures()*3600;
		}
	}
	public void setSecondes(int s) {
		if(s>=0 && s<60) {
			nbSecondes = s + getMinutes()*60 + getHeures()*3600;
		}
	}
	
	public void rebours() {
		if (nbSecondes > 0){
			nbSecondes -- ;
		}
		return ();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
