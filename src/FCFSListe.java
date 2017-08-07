
public class FCFSListe implements WarteSchlange{
	
	public ZPatient anfang;
	public ZPatient ende;
	
	
	@Override
	public void anmelden(ZPatient p) {
		// TODO Auto-generated method stub
		if(anfang == null) {
			anfang = p;
			ende = p;
			p.next = p;
		} else {
			ende.next = p;
			ende = p;
		}
	}

	@Override
	public ZPatient derNaechsteBitte() {
		// TODO Auto-generated method stub
		ZPatient ausgabe = null;
		
		if(anfang != null) {
			ausgabe = anfang;
		}
		if(anfang.next != null) {
			anfang = anfang.next;
		} else {
			return null;
		}
		
		
		return ausgabe;
	}

}
