
public class FCFSListe implements WarteSchlange{
	
	public ZPatient anfang;
	public ZPatient ende;
	
	
	@Override
	public void anmelden(ZPatient p) {
		// TODO Auto-generated method stub
		if(anfang == null) {
			anfang = p;
			ende = p;
		} else {
			ende.next = p;
			ende = p;
		}
	}

	@Override
	public ZPatient derNaechsteBitte() {
		// TODO Auto-generated method stub
		return null;
	}

}
