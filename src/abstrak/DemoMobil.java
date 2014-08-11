package abstrak;

public class DemoMobil {
	public static void main(String[] args) {
		Mobil m= new Mobil(){
			public void injakPedalGas(){
				
		System.out.println("Mobil berjalan");	
	}
		MobilkeDua k= new MobilkeDua(){
			m.injakPedalGas();
		}
		
	}
}
}
