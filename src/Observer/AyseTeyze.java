package Observer;

public class AyseTeyze  implements Observer{

	SubjectProducts sb;
	public  AyseTeyze(SubjectProducts sb) {
		// TODO Auto-generated constructor stub
		this.sb=sb;
		this.sb.registerObserver(this);
	}

	public void setSubject(SubjectProducts sp) {
		
		this.sb=sp;
		
	}
	
	@Override
	public void update(String str) {
		// TODO Auto-generated method stub
		System.out.println("fiyat " +str+ " Gak kız gidelim boynere :) ");
		
	}

}
