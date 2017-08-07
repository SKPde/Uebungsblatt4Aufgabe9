
public class FCFSListe implements WarteSchlange{
	
	public ZPatient anfang;
	public ZPatient ende;
	
	private ZPatient drangewesen;
	
	boolean count = false;
	
	@Override
	public void anmelden(ZPatient p) {
		// TODO Auto-generated method stub
		if(anfang == null) {
			anfang = p;
			ende = p;
			p.next = null;
			ende.next = null;
		} else {
			ende.next = p;
			ende = p;
		}
	}

	@Override
	public ZPatient derNaechsteBitte() {
		ZPatient ausgabe = null;
		if(anfang != null) {
			ausgabe = anfang;
			drangewesen = ausgabe;
			anfang = anfang.next;
		}
		
		
		return ausgabe;
		// TODO Auto-generated method stub

		
	}

}
