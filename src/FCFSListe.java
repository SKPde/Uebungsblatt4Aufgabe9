
public class FCFSListe implements WarteSchlange{
	
	public ZPatient anfang;
	public ZPatient ende;
	
	boolean count = false;
	
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
		System.out.println(count);
		if(count == true && anfang == ende) {
			anfang.next = null;
			anfang = null;
			ende.next = null;
			ende = null;
			count = false;
			return null;
		}
		
		
		if(anfang == ende) {
			count = true;
		} else {
			count = false;
		}

		if(anfang != null) {
			ausgabe = anfang;
			//anfang = null;
		}
		
		if(anfang.next != null) {
			anfang = anfang.next;			
		} 
		
		return ausgabe;
		
	}

}
