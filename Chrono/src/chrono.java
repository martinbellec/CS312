
public class chrono {

	private int secondes = 0;
	private int minutes = 0;
	private int heures = 0;
	
	public int getHeures() {
		return heures;
	}
	public int getMinutes() {
		return minutes;
	} //Ceci est test
	public int getSecondes() {
		return secondes;
	}
	
	public void setHeures(int h) {
		if(h>=0) { //On considère ici l'heure comme pouvant être supérieure à 24
			heures = h;
		}
	}
	public void setMinutes(int m) {
		if(m>=0 && m<60) {
			minutes = m;
		}
	}
	public void setSecondes(int s) {
		if(s>=0 && s<60) {
			secondes = s;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
