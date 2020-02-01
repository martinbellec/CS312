
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chrono chrono1 = new chrono();
		chrono2 chrono2 = new chrono2();
		
		chrono1.setSecondes(34);
		chrono1.setMinutes(48);
		chrono1.setHeures(12);
		
		chrono1.print();
		
		
		chrono2.setSecondes(30);
		
		System.out.println(chrono2.getSecondes() + " secondes");
		
		// Question 5 :
		
		chrono2.setHeures(1);
		chrono2.setMinutes(30);
		chrono2.setSecondes(0);
		
		while( (chrono2.getHeures() != 0) || (chrono2.getMinutes() != 0) || (chrono2.getSecondes() != 0) ) {
			chrono2.print();
			chrono2.rebours();
			
		}
		
		
	}

}
